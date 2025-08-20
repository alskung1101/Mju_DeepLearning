const express = require("express");
const mongoose = require("mongoose");
const cors = require("cors");
const bcrypt = require("bcrypt");
const jwt = require("jsonwebtoken");
const axios = require("axios"); // ✅ 카카오 API 호출용
require("dotenv").config(); // ✅ dotenv 불러오기

const app = express();
app.use(cors());
app.use(express.json());

// ✅ MongoDB 연결
mongoose
  .connect(process.env.MONGO_URI, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
  })
  .then(() => console.log("✅ MongoDB 연결 성공"))
  .catch((err) => console.error("❌ MongoDB 연결 실패:", err));

// ✅ 유저 스키마
const UserSchema = new mongoose.Schema({
  username: String,
  password: String,
  email: String,
  kakaoId: { type: String, unique: true }, // 중복 방지
});

const User = mongoose.model("User", UserSchema);

// ✅ 회원가입 API
app.post("/signup", async (req, res) => {
  try {
    const { username, password, email } = req.body;

    // 비밀번호 해시
    const hashed = await bcrypt.hash(password, 10);

    const user = new User({ username, password: hashed, email });
    await user.save();

    res.json({ message: "회원가입 성공!" });
  } catch (error) {
    res.status(500).json({ message: "회원가입 실패", error });
  }
});

// ✅ 로그인 API
app.post("/login", async (req, res) => {
  try {
    const { username, password } = req.body;

    const user = await User.findOne({ username });
    if (!user) return res.status(400).json({ message: "아이디 없음" });

    const isPasswordValid = await bcrypt.compare(password, user.password);
    if (!isPasswordValid)
      return res.status(400).json({ message: "비밀번호 틀림" });

    // JWT 토큰 발급
    const token = jwt.sign({ id: user._id }, process.env.JWT_SECRET, {
      expiresIn: "1h",
    });

    res.json({ message: "로그인 성공!", token });
  } catch (error) {
    res.status(500).json({ message: "로그인 실패", error });
  }
});
app.get("/auth/kakao", (req, res) => {
  const kakaoAuthURL = `https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=${process.env.KAKAO_REST_API_KEY}&redirect_uri=${process.env.KAKAO_REDIRECT_URI}`;
  res.redirect(kakaoAuthURL);
});
// ✅ 카카오 로그인 Redirect Callback (카카오가 직접 호출하는 엔드포인트)
app.get("/auth/kakao/callback", async (req, res) => {
  const { code } = req.query;
  try {
    // 1. 토큰 요청
    const tokenResponse = await axios.post(
      "https://kauth.kakao.com/oauth/token",
      null,
      {
        params: {
          grant_type: "authorization_code",
          client_id: process.env.KAKAO_REST_API_KEY,
          redirect_uri: process.env.KAKAO_REDIRECT_URI,
          code,
        },
        headers: { "Content-Type": "application/x-www-form-urlencoded" },
      }
    );

    const { access_token } = tokenResponse.data;

    // 2. 사용자 정보 가져오기
    const userResponse = await axios.get("https://kapi.kakao.com/v2/user/me", {
      headers: { Authorization: `Bearer ${access_token}` },
    });

    const kakaoUser = userResponse.data;

    // 3. DB 확인/생성
    let user = await User.findOne({ kakaoId: kakaoUser.id });
    if (!user) {
      user = new User({
        username: kakaoUser.properties?.nickname || `kakao_${kakaoUser.id}`,
        email: kakaoUser.kakao_account?.email || "",
        kakaoId: kakaoUser.id,
      });
      await user.save();
    }

    // 4. JWT 발급
    const token = jwt.sign({ id: user._id }, process.env.JWT_SECRET, {
      expiresIn: "1h",
    });

    // 👉 프론트엔드로 토큰 전달 (환경변수에서 가져오기)
    res.redirect(`${process.env.FRONTEND_URL}?token=${token}`);
  } catch (error) {
    console.error(
      "❌ 카카오 콜백 처리 실패:",
      error.response?.data || error.message
    );
    res
      .status(500)
      .json({ message: "카카오 콜백 처리 실패", error: error.message });
  }
});

// ✅ 서버 실행
app.get("/", (req, res) => {
  res.send("🚀 CareerMate 서버가 정상 동작 중입니다!");
});

app.listen(process.env.PORT, () =>
  console.log(`✅ Server running on http://localhost:${process.env.PORT}`)
);

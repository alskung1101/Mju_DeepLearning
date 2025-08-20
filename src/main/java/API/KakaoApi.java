package API;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Getter
public class KakaoApi {
    @Value("${kakao.api_key}")
    private String kakaoApiKey;
    private static KakaoApi instance;
    @Value("${kakao.redirect_uri}")
    private String kakaoRedirectUri;
    @Value("${kakao.logout_redirect_uri}")
    private String kakaoLogoutRedirectUri;

    public KakaoApi getInstance(){
        return null;
    };
    public String getAcessToken(String code){
        return "";
    };
    public HashMap<String, Object> getUserInfo(String code){
        return null;
    }
    public void kakaoLogout(String accessToken){

    };
    public boolean kakaoVerification(String authorizationCode){
        return false;
    };

}

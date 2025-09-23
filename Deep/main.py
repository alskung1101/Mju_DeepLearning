# 필요한 라이브러리들을 임포트합니다
import requests  # HTTP 요청을 위한 라이브러리
import os  # 환경변수 접근을 위한 라이브러리
from dotenv import load_dotenv  # .env 파일에서 환경변수를 로드하기 위한 라이브러리

# .env 파일에서 환경변수를 로드합니다
load_dotenv()

class WeatherApp:
    """
    날씨 정보를 가져오고 옷차림을 추천하는 메인 클래스입니다.
    """
    
    def __init__(self):
        """
        WeatherApp 클래스를 초기화합니다.
        API 키를 .env 파일에서 가져오고, 기본 URL을 설정합니다.
        """
        # .env 파일에서 OpenWeather API 키를 가져옵니다
        self.api_key = os.getenv('OPENWEATHER_API_KEY')
        # OpenWeather API의 현재 날씨 정보 엔드포인트 URL
        self.base_url = "http://api.openweathermap.org/data/2.5/weather"
        
        # API 키가 설정되지 않은 경우 오류 메시지를 출력하고 프로그램을 종료합니다
        if not self.api_key:
            print("❌ 오류: OPENWEATHER_API_KEY가 .env 파일에 설정되지 않았습니다.")
            print("   .env 파일을 생성하고 다음과 같이 입력하세요:")
            print("   OPENWEATHER_API_KEY=your_api_key_here")
            exit(1)
    
    def get_weather(self, city_name):
        """
        지정된 도시의 현재 날씨 정보를 OpenWeather API에서 가져옵니다.
        
        Args:
            city_name (str): 날씨 정보를 가져올 도시명
            
        Returns:
            dict: 날씨 정보가 담긴 JSON 데이터
            
        Raises:
            ValueError: 도시를 찾을 수 없거나 API 요청에 실패한 경우
        """
        try:
            # API 요청에 필요한 파라미터들을 설정합니다
            params = {
                'q': city_name,  # 검색할 도시명
                'appid': self.api_key,  # API 키
                'units': 'metric',  # 온도 단위를 섭씨로 설정
                'lang': 'kr'  # 응답 언어를 한국어로 설정
            }
            
            # OpenWeather API에 GET 요청을 보냅니다
            response = requests.get(self.base_url, params=params)
            # HTTP 상태 코드가 200이 아니면 예외를 발생시킵니다
            response.raise_for_status()
            
            # JSON 응답을 파이썬 딕셔너리로 변환하여 반환합니다
            return response.json()
            
        except requests.exceptions.HTTPError as e:
            # HTTP 오류가 발생한 경우 (404: 도시를 찾을 수 없음, 기타 오류)
            if response.status_code == 404:
                raise ValueError(f"❌ '{city_name}' 도시를 찾을 수 없습니다. 도시명을 확인해주세요.")
            else:
                raise ValueError(f"❌ API 요청 오류: {e}")
        except requests.exceptions.RequestException as e:
            # 네트워크 연결 오류 등의 요청 관련 오류
            raise ValueError(f"❌ 네트워크 오류: {e}")
        except Exception as e:
            # 예상치 못한 기타 오류들
            raise ValueError(f"❌ 예상치 못한 오류: {e}")
    
    def get_clothing_recommendation(self, temperature, weather_condition):
        """
        기온과 날씨 조건에 따라 적절한 옷차림을 추천합니다.
        
        Args:
            temperature (float): 현재 기온 (섭씨)
            weather_condition (str): 날씨 상태 설명
            
        Returns:
            list: 추천 옷차림 목록
        """
        recommendations = []  # 추천 옷차림을 저장할 리스트
        
        # 기온에 따른 기본 옷차림 추천
        # 매우 추운 날씨 (-10°C 미만)
        if temperature < -10:
            recommendations.extend([
                "🧥 두꺼운 패딩 점퍼",
                "🧣 목도리와 장갑",
                "🧦 두꺼운 양말",
                "👢 방한 부츠"
            ])
        # 추운 날씨 (0°C 미만)
        elif temperature < 0:
            recommendations.extend([
                "🧥 패딩 점퍼",
                "🧣 목도리",
                "🧦 두꺼운 양말",
                "👟 방한 신발"
            ])
        # 차가운 날씨 (10°C 미만)
        elif temperature < 10:
            recommendations.extend([
                "🧥 코트나 자켓",
                "👕 긴팔 셔츠",
                "👖 긴바지",
                "🧦 양말"
            ])
        # 시원한 날씨 (20°C 미만)
        elif temperature < 20:
            recommendations.extend([
                "🧥 얇은 자켓",
                "👕 긴팔 또는 반팔",
                "👖 긴바지",
                "👟 운동화"
            ])
        # 따뜻한 날씨 (30°C 미만)
        elif temperature < 30:
            recommendations.extend([
                "👕 반팔 셔츠",
                "👖 반바지 또는 얇은 긴바지",
                "👟 가벼운 신발",
                "🧢 모자 (선택사항)"
            ])
        # 더운 날씨 (30°C 이상)
        else:
            recommendations.extend([
                "👕 반팔 셔츠",
                "👖 반바지",
                "👟 통풍이 좋은 신발",
                "🧢 모자",
                "🕶️ 선글라스"
            ])
        
        # 날씨 조건에 따른 추가 추천
        # 날씨 설명을 소문자로 변환하여 검색하기 쉽게 만듭니다
        weather_lower = weather_condition.lower()
        
        # 비가 오는 날씨인 경우
        if 'rain' in weather_lower or '비' in weather_lower:
            recommendations.extend([
                "☂️ 우산",
                "🧥 방수 재킷",
                "👟 방수 신발"
            ])
        # 눈이 오는 날씨인 경우
        elif 'snow' in weather_lower or '눈' in weather_lower:
            recommendations.extend([
                "🧥 방수 재킷",
                "👟 방수 부츠",
                "🧤 장갑"
            ])
        # 바람이 강한 날씨인 경우
        elif 'wind' in weather_lower or '바람' in weather_lower:
            recommendations.extend([
                "🧥 바람막이",
                "🧣 목도리 (바람 차단용)"
            ])
        # 맑은 날씨인 경우 (20°C 이상일 때만 자외선 차단 아이템 추가)
        elif 'sun' in weather_lower or '맑음' in weather_lower:
            if temperature > 20:
                recommendations.extend([
                    "🧢 모자",
                    "🕶️ 선글라스",
                    "🧴 선크림"
                ])
        
        # 추천 옷차림 목록을 반환합니다
        return recommendations
    
    def display_weather_info(self, weather_data):
        """
        날씨 정보를 사용자에게 보기 좋게 출력합니다.
        
        Args:
            weather_data (dict): OpenWeather API에서 받은 날씨 정보 JSON 데이터
        """
        # 날씨 데이터에서 필요한 정보들을 추출합니다
        city = weather_data['name']  # 도시명
        country = weather_data['sys']['country']  # 국가 코드
        temperature = weather_data['main']['temp']  # 현재 기온
        feels_like = weather_data['main']['feels_like']  # 체감 온도
        humidity = weather_data['main']['humidity']  # 습도
        description = weather_data['weather'][0]['description']  # 날씨 상태 설명
        
        # 날씨 정보를 이모지와 함께 출력합니다
        print(f"\n🌍 위치: {city}, {country}")
        print(f"🌡️  현재 기온: {temperature:.1f}°C")
        print(f"🤔 체감 온도: {feels_like:.1f}°C")
        print(f"💧 습도: {humidity}%")
        print(f"☁️  날씨: {description}")
        
        # 기온과 날씨 조건에 따른 옷차림을 추천합니다
        recommendations = self.get_clothing_recommendation(temperature, description)
        print(f"\n👕 오늘의 옷차림 추천:")
        # 추천 목록을 번호와 함께 출력합니다
        for i, rec in enumerate(recommendations, 1):
            print(f"   {i}. {rec}")
    
    def run(self):
        """
        메인 프로그램을 실행합니다.
        사용자로부터 도시명을 입력받고, 날씨 정보를 조회하여 옷차림을 추천합니다.
        """
        # 프로그램 시작 메시지를 출력합니다
        print("🌤️  날씨 정보 및 옷차림 추천 프로그램")
        print("=" * 50)
        
        # 무한 루프로 사용자가 여러 도시의 날씨를 조회할 수 있게 합니다
        while True:
            try:
                # 사용자로부터 도시명을 입력받습니다
                city_name = input("\n도시명을 입력하세요 (종료: 'quit'): ").strip()
                
                # 종료 명령어를 입력한 경우 프로그램을 종료합니다
                if city_name.lower() in ['quit', 'exit', '종료']:
                    print("👋 프로그램을 종료합니다.")
                    break
                
                # 빈 입력인 경우 다시 입력을 요청합니다
                if not city_name:
                    print("❌ 도시명을 입력해주세요.")
                    continue
                
                # 날씨 정보를 가져오는 중임을 알려줍니다
                print(f"\n🔍 '{city_name}'의 날씨 정보를 가져오는 중...")
                
                # OpenWeather API에서 날씨 정보를 가져옵니다
                weather_data = self.get_weather(city_name)
                
                # 날씨 정보와 옷차림 추천을 출력합니다
                self.display_weather_info(weather_data)
                
            except ValueError as e:
                # 도시를 찾을 수 없거나 API 오류가 발생한 경우
                print(f"\n{e}")
            except KeyboardInterrupt:
                # Ctrl+C로 프로그램을 중단한 경우
                print("\n\n👋 프로그램을 종료합니다.")
                break
            except Exception as e:
                # 예상치 못한 기타 오류가 발생한 경우
                print(f"\n❌ 예상치 못한 오류가 발생했습니다: {e}")

# 프로그램이 직접 실행될 때만 WeatherApp을 시작합니다
if __name__ == "__main__":
    # WeatherApp 인스턴스를 생성하고 실행합니다
    app = WeatherApp()
    app.run()

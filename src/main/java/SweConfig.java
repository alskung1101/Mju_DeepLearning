import API.KakaoApi;
import Repository.RestaurantRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SweConfig {
    @Bean
    public KakaoApi kakaoApi(){
        return new KakaoApi();
    }
    @Bean
    public RestaurantRepository restaurantRepository(){
        //return new RestaurantRepository();}
        return null;
    }

}

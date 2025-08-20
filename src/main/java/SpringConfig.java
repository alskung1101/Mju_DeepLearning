import API.KakaoApi;
import Repository.RestaurantRepository;
import Repository.ScheduleRepository;
import Repository.UserRepository;
import Repository.WorkerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    KakaoApi kakaoApi(){
        return new KakaoApi();
    }

    @Bean
    UserRepository userRepository(){
        return userRepository();
    }
    @Bean
    RestaurantRepository restaurantRepository(){
        return restaurantRepository();
    }

    @Bean
    ScheduleRepository scheduleRepository(){
        return scheduleRepository();
    }

    @Bean
    WorkerRepository workerRepository(){
        return workerRepository();
    }

}

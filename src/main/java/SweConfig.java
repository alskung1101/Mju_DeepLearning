import API.KakaoApi;
import Repository.RestaurantRepository;
import Repository.ScheduleRepository;
import Repository.WorkerRepository;
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
    @Bean
    public ScheduleRepository scheduleRepository(){
        //return new ScheduleRepository();}
        return null;
    }
    @Bean
    public WorkerRepository workerRepository(){
        //return new workerRepository();}
        return null;
    }

}

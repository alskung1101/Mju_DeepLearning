package Repository;

import Entity.Schedule;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface ScheduleRepository extends CrudRepository {
    public default Optional<Schedule> findByEmailAndRestaurantAndStarttime(String email, Long restaurantId, LocalDateTime startTime){
        return null;
    };
}

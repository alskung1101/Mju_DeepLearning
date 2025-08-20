package Repository;

import Entity.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ScheduleRepository extends CrudRepository {
    default Optional<Schedule> findByEmailAndRestaurantAndStartTime(String email, Long restaurantId, LocalDateTime startTime){
        return null;
    };

}

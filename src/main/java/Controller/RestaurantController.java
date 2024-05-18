package Controller;

import Entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import Repository.RestaurantRepository;
import Repository.ScheduleRepository;
import Repository.WorkerRepository;
public class RestaurantController {
    private RestaurantRepository restaurantRepository;
    private ScheduleRepository scheduleRepository;
}

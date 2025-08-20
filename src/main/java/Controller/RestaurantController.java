package Controller;

import DTO.RestaurantDTO;
import Entity.Schedule;
import Repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import Repository.RestaurantRepository;
import Repository.ScheduleRepository;
import Repository.WorkerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestaurantController {
    private RestaurantRepository restaurantRepository;
    private ScheduleRepository scheduleRepository;
    private WorkerRepository workerRepository;
    private UserRepository userRepository;

    @Autowired
    public RestaurantController(RestaurantRepository restaurantRepository, ScheduleRepository scheduleRepository, WorkerRepository workerRepository, UserRepository userRepository){
        this.restaurantRepository = restaurantRepository;
        this.scheduleRepository = scheduleRepository;
        this.workerRepository = workerRepository;
        this.userRepository = userRepository;
    }

    @PostMapping()
    public String createResstaurant(Model model, HttpSession session, RestaurantDTO dto){
        return "";
    }
    @GetMapping()
    public String showRestaurantPage(Model model, HttpSession session){
        return "";
    }
    @GetMapping()
    public String enterRestaurantPage(Model model, HttpSession session, Long restaurantId){
        return "";
    }

}

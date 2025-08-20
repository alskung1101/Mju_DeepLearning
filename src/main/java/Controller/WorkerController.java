package Controller;

import DTO.ScheduleDTO;
import Entity.Schedule;
import Entity.Staff;
import Repository.RestaurantRepository;
import Repository.ScheduleRepository;
import Repository.UserRepository;
import Repository.WorkerRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WorkerController {
    private UserRepository userRepository;
    private ScheduleRepository scheduleRepository;
    private WorkerRepository workerRepository;
    @Autowired
    public WorkerController(UserRepository userRepository, ScheduleRepository scheduleRepository, WorkerRepository workerRepository){
        this.userRepository = userRepository;
        this.scheduleRepository = scheduleRepository;
        this.workerRepository = workerRepository;
    }
    @PostMapping
    public String inviteStaff(Model model, HttpSession session, String phone, Long restaurantId){
        return "";
    };
    @GetMapping
    public String showWorkers(Model model, HttpSession session){
        return "";
    };
    @GetMapping
    public String enterWorkerManaging(Model model, HttpSession session){
        return "";
    };
    @PostMapping
    public String setStaffPermission(HttpSession session, Long workerId){
        return "";
    };
    @PostMapping
    public String addWorkerBonus(Model model, HttpSession session, String content, int bonus, Long workerId){
        return "";
    };
    @PostMapping
    public String dismissal(HttpSession session, Staff staff){
        return "";
    };
    @PostMapping
    public String createSchedule(Model model, HttpSession session){
        return "";
    };
    @GetMapping
    public String enterScheduleManaging(Model model, HttpSession session){
        return "";
    };
    @PostMapping
    public String fixSchedule(Model model, HttpSession session, ScheduleDTO schedule){
        return "";
    };
    @GetMapping
    public String showScheduleObjection(Model model, HttpSession session){
        return "";
    };
    @PostMapping
    public String processObjection(Model model, HttpSession session, Long scheduleId, boolean fix){
        return "";
    };
    @PostMapping
    public String sendObjection(HttpSession session, Schedule schedule){
        return "";
    };
    @GetMapping
    public String checkWorkerArrived(HttpSession session, Schedule schedule){
        return "";
    };
    @GetMapping
    public String checkWorkerDeparted(HttpSession session, Schedule schedule){
        return "";
    };

}

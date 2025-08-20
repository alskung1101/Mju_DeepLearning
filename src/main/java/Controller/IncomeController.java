package Controller;
import DTO.IncomeItemDTO;
import Repository.IncomeRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class IncomeController {
    private IncomeRepository incomeRepository;
    @Autowired
    public IncomeController(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    @GetMapping("/income")
    public String showIncomePage(HttpServletRequest request, Model model) {
        return "";
    }

    @GetMapping("/income/list")
    public String listIncomes(HttpServletRequest request, Model model) {
        return "";
    }

    @PostMapping("/income/add")
    public String addIncome(HttpServletRequest request, IncomeItemDTO income) {
        return "";
    }

    @PostMapping("/income/delete")
    public String deleteIncome(HttpServletRequest request, int index) {
        return "";
    }

    @PostMapping("/income/edit")
    public String editIncome(HttpServletRequest request, int index, IncomeItemDTO updatedIncome) {
        return "";
    }

    @PostMapping("/income/compare")
    public String compareTotalIncome(HttpServletRequest request, Model model, int previousIncome) {
        return "";
    }
}
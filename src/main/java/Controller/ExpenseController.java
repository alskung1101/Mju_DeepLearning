package Controller;

import DTO.ExpenseItemDTO;
import Repository.ExpenseRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class ExpenseController {

    private ExpenseRepository expenseRepository;
    @Autowired
    public ExpenseController(ExpenseRepository expenseRepository){
        this.expenseRepository=expenseRepository;
    }
    @GetMapping("/expense")
    public String showExpensePage(HttpServletRequest request, Model model) {
        return "";
    }

    @GetMapping("/expense/list")
    public String listExpenses(HttpServletRequest request, Model model) {
        return "";
    }

    @PostMapping("/expense/add")
    public String addExpense(HttpServletRequest request, ExpenseItemDTO expense) {
        return "";
    }

    @PostMapping("/expense/delete")
    public String deleteExpense(HttpServletRequest request, Long index) {
        return "";
    }

    @PostMapping("/expense/edit")
    public String editExpense(HttpServletRequest request, int index, ExpenseItemDTO updatedExpense) {
        return "";
    }

    @PostMapping("/expense/update")
    public String updateExpense(HttpServletRequest request, Model model, ExpenseItemDTO expense) {
        return "";
    }

}
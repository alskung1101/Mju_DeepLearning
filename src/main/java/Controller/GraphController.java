package Controller;

import DTO.GraphDTO;
import Entity.Graph;
import Repository.GraphRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.util.List;

@Controller
public class GraphController {
    private final GraphRepository graphRepo;

    @Autowired
    public GraphController(GraphRepository graphRepo) {
        this.graphRepo = graphRepo;
    }

    @PostMapping
    public void deleteGraphData(HttpServletRequest request, Model model, GraphDTO dto) { }

    @PostMapping
    public String createGraph(HttpServletRequest request, Model model, GraphDTO dto) { return ""; }

    @GetMapping
    public void viewGraph(Graph graph) { }

    @GetMapping
    public void refreshDisplay() { }

    @GetMapping
    public void selectDateRange() { }

    @PostMapping
    public void deleteData() { }

    @GetMapping
    public void collectData(Graph dataCollect) { }

    @GetMapping
    public List<Graph> getIncomeData() {
        return graphRepo.getIncomeData();
    }

    @GetMapping
    public List<Graph> getExpenseData() {
        return graphRepo.getExpenseData();
    }

    @GetMapping
    public List<Graph> getSalesData() {
        return graphRepo.getSalesData();
    }
}

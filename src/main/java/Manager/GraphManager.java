package Manager;

import Entity.Graph;
import Viewer.GraphViewer;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraphManager {
    private List<Graph> manageGraphs;

    private final GraphViewer graphViewer;
    private boolean isManaging;

    @Autowired
    public GraphManager(GraphViewer graphViewer) {
        this.graphViewer = graphViewer;
        this.isManaging = true;
    }

    public void viewGraph(Graph graphData) {
        graphViewer.viewGraph(graphData);
    }

    public void refreshDisplay() {
        graphViewer.refreshDisplay();
    }

    public void selectDateRange() {
        graphViewer.selectDateRange();
    }

    public void deleteData() {
        graphViewer.deleteData();
    }

    public void collectData(Graph dataCollect) {
        graphViewer.collectData(dataCollect);
    }

    public double getIncome() {
        return 0.0;
    }

    public double getExpense() {
        return 0.0;
    }

    public double getSales() {
        return 0.0;
    }

    public LocalDate getDate() {
        return LocalDate.now();
    }

    public void deleteGraphData(String content, String data, Graph graph) { }

    public String createGraph(String content, String data, Graph graph) {
        return "";
    }

    public void updateGraph(Long id, double income, double expense, double sales, LocalDate date) { }

    public void displayAllGraphs() { }

}

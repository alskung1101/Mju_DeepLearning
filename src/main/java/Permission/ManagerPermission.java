package Permission;

import DTO.ExpenseItemDTO;
import DTO.IncomeItemDTO;
import DTO.ScheduleDTO;
import Entity.Graph;
import Entity.Schedule;
import Entity.Worker;
import Entity.Staff;
import Manager.ExpenseManager;
import Manager.IncomeManager;
import Manager.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class ManagerPermission extends StaffPermission {
    private static final int PERMISSION_LEVEL = 1;
    private ScheduleManager scheduleManager;
    private WorkerManager workerManager;
    private GraphManager graphManager;
    private ExpenseManager expenseManager;
    private IncomeManager incomeManager;

    @Override
    public List<Schedule> filterObjectionToPermission(int level) { return null; }
    @Override
    public Schedule fixObjection(boolean change, Worker manager, Long scheduleId) { return null; }
    @Override
    public void createSchedule(ScheduleDTO dto, Worker manager) { }
    @Override
    public void changeSchedule(Schedule schedule) { }
    @Override
    public void registerExpense(ExpenseItemDTO expense) { }
    @Override
    public List<ExpenseItemDTO> getAllExpenses() { return null; }
    @Override
    public void deleteExpense(int index) { }
    @Override
    public void updateExpense(int index, ExpenseItemDTO updatedExpense) { }
    @Override
    public void registerIncome(IncomeItemDTO income) { }
    @Override
    public List<IncomeItemDTO> getAllIncomes() { return null; }
    @Override
    public void deleteIncome(int index) { }
    @Override
    public void updateIncome(int index, IncomeItemDTO updatedIncome) { }
    @Override
    public void compareTotalIncome(int previousIncome) { }
    @Override
    public void addStock(String stockName, String category) { }
    @Override
    public void reviseStock(String stockName, String category) { }
    @Override
    public String getStock() { return ""; }
    @Override
    public void setExpirationDate(String date) { }
    @Override
    public String getExpirationDate() { return ""; }
    @Override
    public void setCategory(String category) { }
    @Override
    public String getCategory() { return ""; }
    @Override
    public void sortByExpirationDate(String date) { }
    @Override
    public void deleteStock(String stockName, String category) { }
    @Override
    public boolean selectItem() { return false; }

    public void addBonus(String content, int bonus, Worker worker) { }
    public void calWorkersSalary() { }
    public void setPermission(Staff staff, int level) { }
    public void viewGraph(Graph graph) { }
    public void refreshDisplay() { }
    public void selectDateRange() { }
    public void deleteData() { }
    public void collectData(Graph dataCollect) { }
    public double getIncome() { return 0; }
    public double getExpense() { return 0; }
    public double getSales() { return 0; }
    public LocalDate getDate() { return null; }
    public void deleteGraphData(String content, String data, Graph graph) { }
    public String createGraph(String content, String data, Graph graph) { return ""; }
}

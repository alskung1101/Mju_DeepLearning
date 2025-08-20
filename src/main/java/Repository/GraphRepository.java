package Repository;

import Entity.Graph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface GraphRepository extends CrudRepository<Graph, Long> {
    List<Graph> findByIncome(double income);
    List<Graph> findByExpense(double expense);
    List<Graph> findBySales(double sales);

    List<Graph> getIncomeData();
    List<Graph> getExpenseData();
    List<Graph> getSalesData();

    List<Graph> findByDateBetween(LocalDate startDate, LocalDate endDate);
}

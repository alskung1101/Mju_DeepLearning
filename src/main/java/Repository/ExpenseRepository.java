package Repository;
import DTO.IncomeItemDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import DTO.ExpenseItemDTO;
import java.util.List;

@Repository
public interface ExpenseRepository extends CrudRepository<ExpenseItemDTO, Long>{
    //void save(ExpenseItemDTO expense);

    List<ExpenseItemDTO> findAll();

    void delete(int index);

    void update(int index, ExpenseItemDTO updateExpense);

    List<ExpenseItemDTO> findByItemName(String itemName);

    List<ExpenseItemDTO> findByDate(String date);
}
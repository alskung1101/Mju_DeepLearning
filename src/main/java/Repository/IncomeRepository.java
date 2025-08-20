package Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import DTO.IncomeItemDTO;
import java.util.List;
@Repository
public interface IncomeRepository extends CrudRepository<IncomeItemDTO, Long> {

    List<IncomeItemDTO> findAll();

    void deleteById(Long id);

    void updateById(Long id, IncomeItemDTO updatedIncome);

    List<IncomeItemDTO> findByDate(String date);

    List<IncomeItemDTO> findByDescription(String description);
}
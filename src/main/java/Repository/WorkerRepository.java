package Repository;

import Entity.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface WorkerRepository extends CrudRepository {
    Worker findById(@PathVariable Long id);

    List<Worker> findByEmail(String email);

}

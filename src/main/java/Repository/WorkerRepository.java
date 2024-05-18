package Repository;

import Entity.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface WorkerRepository extends CrudRepository {
    public Worker findById(@PathVariable Long id);

    public List<Worker> findByEmail(String email);

}

package Repository;

import org.springframework.data.repository.CrudRepository;
import Entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository {
    Optional<User> findByEmail(String email);
    Optional<User> findById(@PathVariable Long id);
}

package beom.plantoplantserver.repository;

import beom.plantoplantserver.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, String> {
    Optional<User> findById(String id);
}

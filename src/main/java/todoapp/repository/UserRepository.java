package todoapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import todoapp.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

	Optional<User> findByUsername(String username);
	
	Boolean existsByEmail(String email);
	
	Optional<User> findByUsernameOrEmail(String username, String email);

	Boolean existsByUsername(String username);

	
	
}

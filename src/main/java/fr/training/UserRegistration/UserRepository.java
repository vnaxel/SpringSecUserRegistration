package fr.training.UserRegistration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("Select u FROM User u WHERE u.email = ?1")
	User findbyEmail(String email);
}

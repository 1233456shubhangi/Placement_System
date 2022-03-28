package PlacementSystem.Placement;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository <T> extends JpaRepository<User,Long>
{

	User findByUsernameAndPassword(String username, String password);
	
}

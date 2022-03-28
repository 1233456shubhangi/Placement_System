package PlacementSystem.Placement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long>
{

	static Company findByEmail(String email) {
		
		return null;
	}

	
	
	
}

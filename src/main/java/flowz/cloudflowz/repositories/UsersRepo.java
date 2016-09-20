package flowz.cloudflowz.repositories;

import org.springframework.data.repository.CrudRepository;
import flowz.cloudflowz.domain.Users;

public interface UsersRepo extends CrudRepository<Users, Integer>{
	
	Users findByUsername(String username);	
	
}

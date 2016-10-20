package flowz.cloudflowz.repositories;

import org.springframework.data.repository.CrudRepository;
import flowz.cloudflowz.domain.Actionz;

public interface ActionzRepo extends CrudRepository<Actionz, Integer>{

	Actionz findByActionzName(String actionzName);
	
}




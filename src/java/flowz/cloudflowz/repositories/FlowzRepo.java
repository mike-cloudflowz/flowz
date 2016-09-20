package flowz.cloudflowz.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import flowz.cloudflowz.domain.Flowz;

public interface FlowzRepo extends CrudRepository<Flowz, Integer>{
				
}

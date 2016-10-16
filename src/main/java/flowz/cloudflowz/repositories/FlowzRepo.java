package flowz.cloudflowz.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import flowz.cloudflowz.domain.Flowz;

public interface FlowzRepo extends CrudRepository<Flowz, Integer>{
	
	List<Flowz> findByFlowzStatusAndUsername(String flowzStatus, String username);	
	List<Flowz> findByFlowzStatusInAndUsername(List<String> statusList, String username);
	List<Flowz> findByUsername(String username);
	Flowz findFirstById();
}

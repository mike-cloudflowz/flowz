package flowz.cloudflowz.repositories;

import org.springframework.data.repository.CrudRepository;
import flowz.cloudflowz.domain.FlowzSkedz;

public interface FlowzSkedzRepo extends CrudRepository<FlowzSkedz, Integer>{
	
	void deleteByFlowzParamzId(Integer flowzParamzId);
				
}

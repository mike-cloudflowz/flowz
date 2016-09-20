package flowz.cloudflowz.repositories;

import org.springframework.data.repository.CrudRepository;
import flowz.cloudflowz.domain.FlowzStepz;

public interface FlowzStepzRepo extends CrudRepository<FlowzStepz, Integer>{
	
	void deleteByFlowzParamzId(Integer flowzParamzId);
				
}

package flowz.cloudflowz.repositories;

import org.springframework.data.repository.CrudRepository;
import flowz.cloudflowz.domain.FlowzStepzParamz;

public interface FlowzStepzParamzRepo extends CrudRepository<FlowzStepzParamz, Integer>{
	
	void deleteByFlowzParamzId(Integer flowzParamzId);		
	
}
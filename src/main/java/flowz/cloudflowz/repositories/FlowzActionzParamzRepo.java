package flowz.cloudflowz.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import flowz.cloudflowz.domain.FlowzActionzParamz;

public interface FlowzActionzParamzRepo extends CrudRepository<FlowzActionzParamz, Integer>{
		
	List<FlowzActionzParamz> findAllByOrderByStepzTmstmpAsc();	
	List<FlowzActionzParamz> findByUsername(String username);
	List<FlowzActionzParamz> findAllByFlowzId(Integer flowzId);
	
}

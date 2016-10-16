package flowz.cloudflowz.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import flowz.cloudflowz.domain.FlowzStepz;

public interface FlowzStepzRepo extends CrudRepository<FlowzStepz, Integer> {

	List<FlowzStepz> findAllByFlowzId(Integer flowzId);
	
}


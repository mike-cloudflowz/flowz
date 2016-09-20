package flowz.cloudflowz.services;

import java.util.List;
import flowz.cloudflowz.domain.FlowzParamz;

public interface FlowzParamzService {
	
    Iterable<FlowzParamz> listAllFlowzParamz();

    FlowzParamz getFlowzParamzById(Integer id);

    FlowzParamz saveFlowzParamz(FlowzParamz flowzParamz);

    void deleteFlowzParamz(Integer id);
    
    Iterable<FlowzParamz> getAllFlowzParamz();
    
    List<FlowzParamz> getUsersFlowzParamz(String username);
         
}

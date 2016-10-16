package flowz.cloudflowz.services;

import java.util.List;
import flowz.cloudflowz.domain.FlowzActionzParamz;

public interface FlowzActionzParamzService {
	
    Iterable<FlowzActionzParamz> listAllFlowzActionzParamz();

    FlowzActionzParamz getFlowzActionzParamzById(Integer id);
    
    FlowzActionzParamz getFlowzActionzParamzByFlowzId(Integer id);

    FlowzActionzParamz saveFlowzActionzParamz(FlowzActionzParamz flowzActionzParamz);

    void deleteFlowzActionzParamz(Integer id);
    
    Iterable<FlowzActionzParamz> getAllFlowzActionzParamz();
    
    List<FlowzActionzParamz> getUsersFlowzActionzParamz(String username);
         
}

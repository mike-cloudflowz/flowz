package flowz.cloudflowz.services;

import flowz.cloudflowz.domain.FlowzParamz;

public interface FlowzParamzService {
    Iterable<FlowzParamz> listAllFlowzParamz();

    FlowzParamz getFlowzParamzById(Integer id);

    FlowzParamz saveFlowzParamz(FlowzParamz flowzParamz);

    void deleteFlowzParamz(Integer id);
    
    Iterable<FlowzParamz> getAllFlowzParamz();
         
}

package flowz.cloudflowz.services;

import flowz.cloudflowz.domain.FlowzStepz;

public interface FlowzStepzService {

    FlowzStepz saveFlowzStepz(FlowzStepz flowzStepz);
    void deleteFlowzStepz(Integer id);    
    
}

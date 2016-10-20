package flowz.cloudflowz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flowz.cloudflowz.domain.FlowzStepz;
import flowz.cloudflowz.repositories.FlowzStepzRepo;

@Service
public class FlowzStepzServiceImpl implements FlowzStepzService {
	
    private FlowzStepzRepo flowzStepzRepo;
    
    @Autowired
    public void setFlowzStepzRepo(FlowzStepzRepo flowzStepzRepo) {
        this.flowzStepzRepo = flowzStepzRepo;
    }
        
    @Override
    public FlowzStepz saveFlowzStepz(FlowzStepz flowzStepz) {
        return flowzStepzRepo.save(flowzStepz);
    }

    @Override
    public void deleteFlowzStepz(Integer id) {
        flowzStepzRepo.delete(id);
    }      
    
}
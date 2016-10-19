package flowz.cloudflowz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flowz.cloudflowz.domain.FlowzActionzParamz;
import flowz.cloudflowz.repositories.FlowzActionzParamzRepo;

@Service
public class FlowzActionzParamzServiceImpl implements FlowzActionzParamzService {
    private FlowzActionzParamzRepo flowzActionzParamzRepo;

    @Autowired
    public void setFlowzParamzRepo(FlowzActionzParamzRepo flowzActionzParamzRepo) {
        this.flowzActionzParamzRepo = flowzActionzParamzRepo;
    }

    @Override
    public Iterable<FlowzActionzParamz> listAllFlowzActionzParamz() {
        return flowzActionzParamzRepo.findAll();
    }
    
    @Override
    public FlowzActionzParamz getFlowzActionzParamzById(Integer id) {
        return flowzActionzParamzRepo.findOne(id);
    }

    @Override
    public List<FlowzActionzParamz> getFlowzActionzParamzByFlowzId(Integer flowzId) {
        return flowzActionzParamzRepo.findAllByFlowzId(flowzId);
    }

    @Override
    public FlowzActionzParamz saveFlowzActionzParamz(FlowzActionzParamz flowzActionzParamz) {
        return flowzActionzParamzRepo.save(flowzActionzParamz);
    }
    
    @Override
    public void deleteFlowzActionzParamz(Integer id) {
        flowzActionzParamzRepo.delete(id);
    }      
    
    @Override
    public Iterable<FlowzActionzParamz> getAllFlowzActionzParamz() {
        return flowzActionzParamzRepo.findAllByOrderByStepzTmstmpAsc();
    }   
    
    @Override
    public List<FlowzActionzParamz> getUsersFlowzActionzParamz(String username) {
        return flowzActionzParamzRepo.findByUsername(username);
    }
    
}

package flowz.cloudflowz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flowz.cloudflowz.domain.FlowzParamz;
import flowz.cloudflowz.repositories.FlowzParamzRepo;

@Service
public class FlowzParamzServiceImpl implements FlowzParamzService {
    private FlowzParamzRepo flowzParamzRepo;

    @Autowired
    public void setFlowzParamzRepo(FlowzParamzRepo flowzParamzRepo) {
        this.flowzParamzRepo = flowzParamzRepo;
    }

    @Override
    public Iterable<FlowzParamz> listAllFlowzParamz() {
        return flowzParamzRepo.findAll();
    }
    
    @Override
    public FlowzParamz getFlowzParamzById(Integer id) {
        return flowzParamzRepo.findOne(id);
    }

    @Override
    public FlowzParamz getFlowzParamzByFlowzId(Integer id) {
        return flowzParamzRepo.findOne(id);
    }

    @Override
    public FlowzParamz saveFlowzParamz(FlowzParamz flowzParamz) {
        return flowzParamzRepo.save(flowzParamz);
    }
    
    @Override
    public void deleteFlowzParamz(Integer id) {
        flowzParamzRepo.delete(id);
    }      
    
    @Override
    public Iterable<FlowzParamz> getAllFlowzParamz() {
        return flowzParamzRepo.findAllByOrderByStepzTmstmpAsc();
    }   
    
    @Override
    public List<FlowzParamz> getUsersFlowzParamz(String username) {
        return flowzParamzRepo.findByUsername(username);
    }
    
}

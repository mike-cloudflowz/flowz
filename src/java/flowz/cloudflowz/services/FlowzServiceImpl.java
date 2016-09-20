package flowz.cloudflowz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flowz.cloudflowz.domain.Flowz;
import flowz.cloudflowz.repositories.FlowzRepo;

@Service
public class FlowzServiceImpl implements FlowzService {
    private FlowzRepo flowzRepo;

    @Autowired
    public void setFlowzRepo(FlowzRepo flowzRepo) {
        this.flowzRepo = flowzRepo;
    }

    @Override
    public Iterable<Flowz> listAllFlowz() {
        return flowzRepo.findAll();
    }

    @Override
    public Flowz getFlowzById(Integer id) {
        return flowzRepo.findOne(id);
    }

    @Override
    public Flowz saveFlowz(Flowz flowz) {
        return flowzRepo.save(flowz);
    }

    @Override
    public void deleteFlowz(Integer id) {
        flowzRepo.delete(id);
    }      
    
    @Override
    public void manageFlowz(Integer id) {
    	Flowz flowz = flowzRepo.findOne(id);
    	flowz.setFlowz_status("Scheduled");   	
    	flowzRepo.save(flowz);    	
    }
    
}

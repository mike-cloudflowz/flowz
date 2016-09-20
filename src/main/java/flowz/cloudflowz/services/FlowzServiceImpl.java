package flowz.cloudflowz.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
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
    public void scheduleFlowz(Integer id) {
    	Flowz flowz = flowzRepo.findOne(id);
    	flowz.setFlowzStatus("Scheduled");   	
    	flowzRepo.save(flowz);    	
    }
    
    @Override
    public void unScheduleFlowz(Integer id) {
    	Flowz flowz = flowzRepo.findOne(id);
    	flowz.setFlowzStatus("Created");   	
    	flowzRepo.save(flowz);  
    	    	
    }
    
    @Override
    public List<Flowz> getCreatedFlowz() {
      User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();	
      return flowzRepo.findByFlowzStatusAndUsername("Created", user.getUsername());
    }    
    
    @Override
    public List<Flowz> getScheduledFlowz() {
      User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
      return flowzRepo.findByFlowzStatusAndUsername("Scheduled", user.getUsername());
    }   
    
    @Override
    public List<Flowz> getExecutedFlowz() {
      User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
      return flowzRepo.findByFlowzStatusAndUsername("Executed", user.getUsername());
    }   
    
    @Override
    public List<Flowz> getExistingFlowz() {
    	List<String> statusList = new ArrayList<String>();
    	statusList.add(new String("Created"));
    	statusList.add(new String("Scheduled"));
    	User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return flowzRepo.findByFlowzStatusInAndUsername(statusList, user.getUsername());
    }   
    
    @Override
    public List<Flowz> getUsersFlowz(String username) {
        return flowzRepo.findByUsername(username);
    }
    
}

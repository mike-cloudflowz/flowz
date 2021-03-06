package flowz.cloudflowz.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import flowz.cloudflowz.domain.Actionz;
import flowz.cloudflowz.domain.Flowz;
import flowz.cloudflowz.domain.FlowzActionzParamz;
import flowz.cloudflowz.domain.FlowzStepz;
import flowz.cloudflowz.domain.UserzEndpointz;
import flowz.cloudflowz.repositories.FlowzActionzParamzRepo;
import flowz.cloudflowz.repositories.FlowzRepo;
import flowz.cloudflowz.repositories.FlowzStepzRepo;
import flowz.cloudflowz.repositories.UserzEndpointzRepo;
import flowz.cloudflowz.repositories.ActionzRepo;

@Service
public class FlowzServiceImpl implements FlowzService {
	
    private FlowzRepo flowzRepo;
    private FlowzActionzParamzRepo flowzActionzParamzRepo;
    private FlowzStepzRepo flowzStepzRepo;
    private ActionzRepo actionzRepo;
    private UserzEndpointzRepo userzEndpointzRepo;

    @Autowired
    public void setFlowzRepo(FlowzRepo flowzRepo) {
        this.flowzRepo = flowzRepo;
    }
    
    @Autowired
    public void setFlowzActionzParamzRepo(FlowzActionzParamzRepo flowzActionzParamzRepo) {
        this.flowzActionzParamzRepo = flowzActionzParamzRepo;
    }
    
    @Autowired
    public void setFlowzStepzRepo(FlowzStepzRepo flowzStepzRepo) {
        this.flowzStepzRepo = flowzStepzRepo;
    }
    
    @Autowired
    public void setActionzRepo(ActionzRepo actionzRepo) {
        this.actionzRepo = actionzRepo;
    }
    
    @Autowired
    public void setUserzEndpointzRepo(UserzEndpointzRepo userzEndpointzRepo) {
        this.userzEndpointzRepo = userzEndpointzRepo;
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
    	List<FlowzStepz> flowzStepz = flowzStepzRepo.findAllByFlowzId(id);
    	
    	for (FlowzStepz paramzList : flowzStepz) {    		 
    		flowzStepzRepo.delete(paramzList.getId());    		
    	} // end for loop   	
        flowzRepo.delete(id);
    }      
    
    @Override
    public void scheduleFlowz(Integer id) {
    	Flowz flowz = flowzRepo.findOne(id);
    	List<FlowzActionzParamz> flowzActionzParamz = flowzActionzParamzRepo.findAllByFlowzId(flowz.getId());
    	
    	int i = 1;
    	for (FlowzActionzParamz paramzList : flowzActionzParamz) {
 
    		FlowzStepz flowzStepz = new FlowzStepz();
    		flowzStepz.setUsername(flowz.getUsername());
    		flowzStepz.setFlowzId(flowz.getId());
    		flowzStepz.setActionz_name(paramzList.getActionz_name());       		
    		String getDate = paramzList.getInitialTmstmp();
    		flowzStepz.setStepz_tmstmp(getDate.substring(3,5) + getDate.substring(0,2) + getDate.substring(8,10) + getDate.substring(11,13) + getDate.substring(14,16));
    		flowzStepz.setUserz_endpointz_id(paramzList.getUserz_endpointz_id());
    		UserzEndpointz userzEndpointz = userzEndpointzRepo.findById(paramzList.getUserz_endpointz_id());
    		Actionz actionz = actionzRepo.findByActionzName(paramzList.getActionz_name());
    		String payload = actionz.getActionz_payload();
    		payload = payload.replaceAll("<endpoint>", userzEndpointz.getEndpointz_value());
    		payload = payload.replaceAll("<param1>", paramzList.getParam1());
    		payload = payload.replaceAll("<param2>", paramzList.getParam2());
    		flowzStepz.setStepz_payload(payload);
    		
    		if (i++ == flowzActionzParamz.size()) {
    			flowzStepz.setLast_stepz("Y");	  
    		} // end if
    		else {
    			flowzStepz.setLast_stepz("N");
    		}

    		flowzStepzRepo.save(flowzStepz);    		
    	} // end for loop   	
    	   	    	   	
    	flowz.setFlowzStatus("Scheduled");   	
    	flowzRepo.save(flowz);    	
    } 
    
    @Override
    public void unScheduleFlowz(Integer id) {
    	Flowz flowz = flowzRepo.findOne(id);
    	List<FlowzStepz> flowzStepz = flowzStepzRepo.findAllByFlowzId(flowz.getId());
    	
    	for (FlowzStepz paramzList : flowzStepz) {    		 
    		flowzStepzRepo.delete(paramzList.getId());    		
    	} // end for loop   	
    	
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

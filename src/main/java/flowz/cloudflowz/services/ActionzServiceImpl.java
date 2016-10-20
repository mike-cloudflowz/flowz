package flowz.cloudflowz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import flowz.cloudflowz.domain.Actionz;
import flowz.cloudflowz.repositories.ActionzRepo;

@Service
public class ActionzServiceImpl implements ActionzService {
	
    private ActionzRepo actionzRepo;
    
    @Autowired
    public void setActionzRepo(ActionzRepo actionzRepo) {
        this.actionzRepo = actionzRepo;
    }
        
    @Override
    public Actionz findByActionzName(String actionzName) {
        return actionzRepo.findByActionzName(actionzName);
    }  
    
}
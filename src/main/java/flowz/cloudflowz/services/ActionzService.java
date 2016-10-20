package flowz.cloudflowz.services;

import flowz.cloudflowz.domain.Actionz;

public interface ActionzService {
	
	Actionz findByActionzName(String actionzName);
    
}

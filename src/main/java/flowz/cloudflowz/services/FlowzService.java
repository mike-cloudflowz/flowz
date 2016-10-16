package flowz.cloudflowz.services;

import java.util.List;

import flowz.cloudflowz.domain.Flowz;

public interface FlowzService {
    Iterable<Flowz> listAllFlowz();

    Flowz getFlowzById(Integer id);

    Flowz saveFlowz(Flowz flowz);

    void deleteFlowz(Integer id);
    
    void scheduleFlowz(Integer id);    

	void unScheduleFlowz(Integer id);
    
	List<Flowz> getCreatedFlowz();

	List<Flowz> getScheduledFlowz();
	
	List<Flowz> getExecutedFlowz();
	
	List<Flowz> getExistingFlowz();
	
	List<Flowz> getUsersFlowz(String username);
	
	Flowz findFirstById();
	
}

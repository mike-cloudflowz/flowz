package flowz.cloudflowz.services;

import flowz.cloudflowz.domain.Flowz;

public interface FlowzService {
    Iterable<Flowz> listAllFlowz();

    Flowz getFlowzById(Integer id);

    Flowz saveFlowz(Flowz flowz);

    void deleteFlowz(Integer id);
    
    void manageFlowz(Integer id);
    
}

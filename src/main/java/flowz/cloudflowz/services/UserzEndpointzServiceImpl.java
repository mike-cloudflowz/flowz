package flowz.cloudflowz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import flowz.cloudflowz.domain.UserzEndpointz;
import flowz.cloudflowz.repositories.UserzEndpointzRepo;

@Service
public class UserzEndpointzServiceImpl implements UserzEndpointzService {
	
    private UserzEndpointzRepo userzEndpointzRepo;
    
    @Autowired
    public void setUserzEndpointzRepo(UserzEndpointzRepo userzEndpointzRepo) {
        this.userzEndpointzRepo = userzEndpointzRepo;
    }
        
    @Override
    public List<UserzEndpointz> findByUsername(String username) {
        return userzEndpointzRepo.findByUsername(username);
    }  
    
    public UserzEndpointz findById(Integer id) {
    	return userzEndpointzRepo.findById(id);
    }
    
    @Override
    public List<UserzEndpointz> findByUsernameAndEndpointzType(String username, String endpointz_type) {
        return userzEndpointzRepo.findByUsernameAndEndpointzType(username, endpointz_type);
    }  
        
}

    
    
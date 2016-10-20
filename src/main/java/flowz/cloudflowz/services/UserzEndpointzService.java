package flowz.cloudflowz.services;

import java.util.List;
import flowz.cloudflowz.domain.UserzEndpointz;

public interface UserzEndpointzService {

	List <UserzEndpointz> findByUsername(String username);
	
	UserzEndpointz findById(Integer id);
	
	List <UserzEndpointz> findByUsernameAndEndpointzType(String username, String endpointz_type);
	
}

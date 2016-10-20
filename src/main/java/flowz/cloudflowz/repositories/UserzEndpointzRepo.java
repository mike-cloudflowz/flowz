package flowz.cloudflowz.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import flowz.cloudflowz.domain.UserzEndpointz;

public interface UserzEndpointzRepo extends CrudRepository<UserzEndpointz, Integer> {
	
	List<UserzEndpointz> findByUsername(String username);	
	UserzEndpointz findById(Integer id);
	List<UserzEndpointz> findByUsernameAndEndpointzType(String username, String endpointz_type);
	
}

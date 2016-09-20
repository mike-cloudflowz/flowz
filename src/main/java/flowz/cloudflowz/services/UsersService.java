package flowz.cloudflowz.services;

import flowz.cloudflowz.domain.Users;

public interface UsersService {
	
	Users findByUsername(String username);
    
}

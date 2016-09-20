package flowz.cloudflowz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import flowz.cloudflowz.domain.Users;
import flowz.cloudflowz.repositories.UsersRepo;

@Service
public class UsersServiceImpl implements UsersService {
	
    private UsersRepo usersRepo;
    
    @Autowired
    public void setUsersRepo(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }
        
    @Override
    public Users findByUsername(String username) {
        return usersRepo.findByUsername(username);
    }  
    
}

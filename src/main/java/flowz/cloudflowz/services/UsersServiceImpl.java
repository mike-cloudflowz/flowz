package flowz.cloudflowz.services;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import flowz.cloudflowz.domain.Users;
import flowz.cloudflowz.repositories.UsersRepo;

@Service
public class UsersServiceImpl implements UsersService, ApplicationListener<AuthenticationSuccessEvent> {
	
    private UsersRepo usersRepo;
    
    @Autowired
    public void setUsersRepo(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }
        
    @Override
    public Users findByUsername(String username) {
        return usersRepo.findByUsername(username);
    }  
    
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
    	User user = (User) event.getAuthentication().getPrincipal();
        String username = user.getUsername();
        Users users = usersRepo.findByUsername(username);        
        Calendar calendar = Calendar.getInstance();
        java.sql.Timestamp lastLoginTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());        
        users.setLast_login(lastLoginTimestamp);
        usersRepo.save(users);
     }
    
}

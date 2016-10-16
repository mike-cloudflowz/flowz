package flowz.cloudflowz.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private Byte enabled;
    private String email_address;
    private String cell_phone;
    private String userz_locationz;
    
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Byte getEnabled() {
		return enabled;
	}
	
	public void setEnabled(Byte enabled) {
		this.enabled = enabled;
	}
	
	public String getEmail_address() {
		return email_address;
	}
	
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	
	public String getCell_phone() {
		return cell_phone;
	}
	
	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}		
	
	public String getUserz_locationz() {
		return userz_locationz;
	}

	public void setUserz_locationz(String userz_locationz) {
		this.userz_locationz = userz_locationz;
	}
	
	public void User() {
    }
	
}



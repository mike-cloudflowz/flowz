package flowz.cloudflowz.domain;

import javax.persistence.*;

@Entity
public class UserzEndpointz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    @Column(name="endpointz_type")
    private String endpointzType;
    private String endpointz_value;
    private String endpointz_label;
    
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
		
	public String getEndpointzType() {
		return endpointzType;
	}

	public void setEndpointzType(String endpointzType) {
		this.endpointzType = endpointzType;
	}

	public String getEndpointz_value() {
		return endpointz_value;
	}
	
	public void setEndpointz_value(String endpointz_value) {
		this.endpointz_value = endpointz_value;
	}
	
	public String getEndpointz_label() {
		return endpointz_label;
	}
	
	public void setEndpointz_label(String endpointz_label) {
		this.endpointz_label = endpointz_label;
	}  
		
}

package flowz.cloudflowz.domain;

import javax.persistence.*;

@Entity
public class Flowz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer userz_id;
    private String flowz_name;
    private String flowz_type;
    private String flowz_status;
    private String description;
    
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getUserz_id() {
		return userz_id;
	}
	
	public void setUserz_id(Integer userz_id) {
		this.userz_id = userz_id;
	}
	
	public String getFlowz_name() {
		return flowz_name;
	}
	
	public void setFlowz_name(String flowz_name) {
		this.flowz_name = flowz_name;
	}
	
	public String getFlowz_type() {
		return flowz_type;
	}
	
	public void setFlowz_type(String flowz_type) {
		this.flowz_type = flowz_type;
	}
	
	public String getFlowz_status() {
		return flowz_status;
	}
	
	public void setFlowz_status(String flowz_status) {
		this.flowz_status = flowz_status;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}  
   
}

package flowz.cloudflowz.domain;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
public class FlowzStepz {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    
    @Column(name="flowz_id")
	private Integer flowzId;	 
    
    private String actionz_name;
    
    private Integer userz_endpointz_id;
    
    private String stepz_payload;
    private String stepz_tmstmp;
	private Timestamp executed_tmstmp;
	private String last_stepz;
	
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
	
	public Integer getFlowzId() {
		return flowzId;
	}

	public void setFlowzId(Integer flowzId) {
		this.flowzId = flowzId;
	}

	public String getActionz_name() {
		return actionz_name;
	}
	
	public void setActionz_name(String actionz_name) {
		this.actionz_name = actionz_name;
	}
		
	public Integer getUserz_endpointz_id() {
		return userz_endpointz_id;
	}

	public void setUserz_endpointz_id(Integer userz_endpointz_id) {
		this.userz_endpointz_id = userz_endpointz_id;
	}
	
	public String getStepz_payload() {
		return stepz_payload;
	}
	
	public void setStepz_payload(String stepz_payload) {
		this.stepz_payload = stepz_payload;
	}
	
	public String getStepz_tmstmp() {
		return stepz_tmstmp;
	}
	
	public void setStepz_tmstmp(String stepz) {
		this.stepz_tmstmp = stepz;
	}
	
	public Timestamp getExecuted_tmstmp() {
		return executed_tmstmp;
	}
	
	public void setExecuted_tmstmp(Timestamp executed_tmstmp) {
		this.executed_tmstmp = executed_tmstmp;
	}
	
	public String getLast_stepz() {
		return last_stepz;
	}
	
	public void setLast_stepz(String last_stepz) {
		this.last_stepz = last_stepz;
	}

	public FlowzStepz() {
		
	}	
		
}





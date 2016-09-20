package flowz.cloudflowz.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlowzSkedz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;  
    private String username;
    @Column(name="flowz_paramz_id")
    private Integer flowzParamzId;        
    private Integer flowz_id;    
    private String actionz_name;    
    private String batchz_tmstmp;    
    private String created_by;    
    private Timestamp created_on;
      
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

	public Integer getFlowzParamzId() {
		return flowzParamzId;
	}

	public void setFlowzParamzId(Integer flowzParamzId) {
		this.flowzParamzId = flowzParamzId;
	}

	public Integer getFlowz_id() {
		return flowz_id;
	}

	public void setFlowz_id(Integer flowz_id) {
		this.flowz_id = flowz_id;
	}

	public String getActionz_name() {
		return actionz_name;
	}

	public void setActionz_name(String actionz_name) {
		this.actionz_name = actionz_name;
	}

	public String getBatchz_tmstmp() {
		return batchz_tmstmp;
	}

	public void setBatchz_tmstmp(String batchz_tmstmp) {
		this.batchz_tmstmp = batchz_tmstmp;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Timestamp getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}   
    
}

package flowz.cloudflowz.domain;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
public class FlowzStepz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;    
    private String username;
    @Column(name="flowz_paramz_id")
    private Integer flowzParamzId;       
    private Integer flowz_id;    
    private String actionz_name;    
    private String stepz_tmstmp;    
    private Timestamp actionz_tmstmp;    
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

	public String getStepz_tmstmp() {
		return stepz_tmstmp;
	}

	public void setStepz_tmstmp(String stepz_tmstmp) {
		this.stepz_tmstmp = stepz_tmstmp;
	}

	public Timestamp getActionz_tmstmp() {
		return actionz_tmstmp;
	}

	public void setActionz_tmstmp(Timestamp actionz_tmstmp) {
		this.actionz_tmstmp = actionz_tmstmp;
	}

	public String getLast_stepz() {
		return last_stepz;
	}

	public void setLast_stepz(String last_stepz) {
		this.last_stepz = last_stepz;
	}  
	    
}





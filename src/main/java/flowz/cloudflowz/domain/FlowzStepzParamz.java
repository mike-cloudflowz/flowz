package flowz.cloudflowz.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlowzStepzParamz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; 
    private String username;
    @Column(name="flowz_paramz_id")
    private Integer flowzParamzId;       
    private Integer flowz_stepz_id;    
    private String actionz_paramz_type;       
    private String valuez;       
    private Integer actionz_paramz_order;    
    private String stepz_tmstmp;

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

	public Integer getFlowz_stepz_id() {
		return flowz_stepz_id;
	}

	public void setFlowz_stepz_id(Integer flowz_stepz_id) {
		this.flowz_stepz_id = flowz_stepz_id;
	}

	public String getActionz_paramz_type() {
		return actionz_paramz_type;
	}

	public void setActionz_paramz_type(String actionz_paramz_type) {
		this.actionz_paramz_type = actionz_paramz_type;
	}

	public String getValuez() {
		return valuez;
	}

	public void setValuez(String valuez) {
		this.valuez = valuez;
	}

	public Integer getActionz_paramz_order() {
		return actionz_paramz_order;
	}

	public void setActionz_paramz_order(Integer actionz_paramz_order) {
		this.actionz_paramz_order = actionz_paramz_order;
	}

	public String getStepz_tmstmp() {
		return stepz_tmstmp;
	}

	public void setStepz_tmstmp(String stepz_tmstmp) {
		this.stepz_tmstmp = stepz_tmstmp;
	}      

}




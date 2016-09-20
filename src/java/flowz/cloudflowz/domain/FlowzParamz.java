package flowz.cloudflowz.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlowzParamz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer userz_id;
    private Integer flowz_id;
    private String actionz_name;
    
    @Column(name="stepz_tmstmp")
	private String stepzTmstmp;	
    
	private String param1;	
	private String param2;
	private String param3;
	private Byte paramz_extracted;
	
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
	
	public String getStepzTmstmp() {
		return stepzTmstmp;
	}

	public void setStepzTmstmp(String stepzTmstmp) {
		this.stepzTmstmp = stepzTmstmp;
	}

	public String getParam1() {
		return param1;
	}
	
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	
	public String getParam2() {
		return param2;
	}
	
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	
	public String getParam3() {
		return param3;
	}
	
	public void setParam3(String param3) {
		this.param3 = param3;
	}
	
	public Byte getParamz_extracted() {
		return paramz_extracted;
	}
	
	public void setParamz_extracted(Byte paramz_extracted) {
		this.paramz_extracted = paramz_extracted;
	}	
	  
}

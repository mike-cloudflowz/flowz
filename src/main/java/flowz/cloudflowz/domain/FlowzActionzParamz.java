package flowz.cloudflowz.domain;

import javax.persistence.*;

@Entity
public class FlowzActionzParamz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;   
    
    @Column(name="flowz_id")
	private Integer flowzId;	 
    
    @Column(nullable = false)
    private String actionz_name;       
  
    @Column(name="initial_tmstmp", nullable = false)
    private String initialTmstmp;
    
    @Column(name="stepz_tmstmp")
	private String stepzTmstmp;	   
    
    private Integer userz_endpointz_id;
    
    @Column(nullable = false)
	private String param1;	
	private String param2;
		
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

	public String getInitialTmstmp() {
		return initialTmstmp;
	}

	public void setInitialTmstmp(String initialTmstmp) {
		this.initialTmstmp = initialTmstmp;
	}

	public String getStepzTmstmp() {
		return stepzTmstmp;
	}

	public void setStepzTmstmp(String stepzTmstmp) {
		this.stepzTmstmp = stepzTmstmp;
	}

	public Integer getUserz_endpointz_id() {
		return userz_endpointz_id;
	}

	public void setUserz_endpointz_id(Integer userz_endpointz_id) {
		this.userz_endpointz_id = userz_endpointz_id;
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

	public FlowzActionzParamz() {
		
    }
		
}

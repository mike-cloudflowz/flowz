package flowz.cloudflowz.domain;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
public class Flowz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String flowz_name;
    private String flowz_type;
    
    @Column(name="flowz_status")
    private String flowzStatus;
    
    private String flowz_recurz_type;
    private String trackz_flowz;
    private String description;
    
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
		
	public String getFlowzStatus() {
		return flowzStatus;
	}

	public void setFlowzStatus(String flowzStatus) {
		this.flowzStatus = flowzStatus;
	}
	
	public String getFlowz_recurz_type() {
		return flowz_recurz_type;
	}

	public void setFlowz_recurz_type(String flowz_recurz_type) {
		this.flowz_recurz_type = flowz_recurz_type;
	}
	
	public String getTrackz_flowz() {
		return trackz_flowz;
	}

	public void setTrackz_flowz(String trackz_flowz) {
		this.trackz_flowz = trackz_flowz;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
   		
}

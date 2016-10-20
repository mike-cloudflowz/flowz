package flowz.cloudflowz.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actionz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="actionz_name")
    private String actionzName;   
    
    private String actionz_url;
    private String actionz_payload;
    private String description;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActionzName() {
		return actionzName;
	}

	public void setActionzName(String actionzName) {
		this.actionzName = actionzName;
	}

	public String getActionz_url() {
		return actionz_url;
	}

	public void setActionz_url(String actionz_url) {
		this.actionz_url = actionz_url;
	}

	public String getActionz_payload() {
		return actionz_payload;
	}

	public void setActionz_payload(String actionz_payload) {
		this.actionz_payload = actionz_payload;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Actionz() {
		
    }
	
}
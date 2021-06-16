package com.nosce.pkg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PROJECT")
public class Project {

	@Id
    @GeneratedValue
    private Long id;
     
    @Column(name="ProjectName")
    private String projectName;
     
    @Column(name="Type")
    private String type;
     
    @Column(name="Subject")
    private String subject;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Project(Long id, String projectName, String type, String subject) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.type = type;
		this.subject = subject;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
     
    
 
   
}

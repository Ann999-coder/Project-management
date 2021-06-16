package com.nosce.pkg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CLIENT")

public class Client {
	
	@Id
    @GeneratedValue
    private Long id;
     
    @Column(name="Company")
    private String company;
     
    @Column(name="Website")
    private String website;
    
    @Column(name="Contact")
    private String contact;
    
    @Column(name="UserName")
    private String userName;
    
    @Column(name="Password")
    private String password;

     
    public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Long id, String company, String website, String contact, String userName, String password) {
		super();
		this.id = id;
		this.company = company;
		this.website = website;
		this.contact = contact;
		this.userName = userName;
		this.password = password;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}

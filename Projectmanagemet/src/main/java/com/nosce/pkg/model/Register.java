package com.nosce.pkg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="TBL_REGISTER")

public class Register {

	@Id
    @GeneratedValue
    private Long id;
     
	@Column(name="email", nullable=false, length=200)
	@NotBlank(message = "Name is mandatory")
    private String email;
	
    @Column(name="Password")
    @NotBlank(message = "password is mandatory")
    private String password;
    
    @Column(name="FirstName")
    @NotBlank(message = "fName is mandatory")
    private String firstName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Register(Long id, String email, String password, String firstName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
	}

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	    
}

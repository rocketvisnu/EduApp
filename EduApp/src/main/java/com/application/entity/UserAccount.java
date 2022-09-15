package com.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity(name = "useraccount")
public class UserAccount {

	@Id
	@Column(name = "type")
	@NotEmpty(message = "*Please provide your id")
    String	type;
	
	@Column(name = "username")
	@NotEmpty(message = "*Please provide your id")
    String	username;

	@Column(name = "password")
	@NotEmpty(message = "*Please provide your PASSWORD")
    String password;    
    
	public String getType() {
		return type;
	}

	public void setType(String username) {
	    this.type = username;
	}
	    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
    	this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
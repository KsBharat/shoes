package com.test.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;


@Entity
public class UserDetails1 {
	
	@Id
	private String userid;	
	private String password;
	private boolean enabled;
	private String role;
	private Date dateofbirth;
	
	
	
	@OneToOne(mappedBy="userDetails1")
	private Customer customer;

	@Transient
	private MultipartFile userimagefile;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public MultipartFile getUserimagefile() {
		return userimagefile;
	}

	public void setUserimagefile(MultipartFile userimagefile) {
		this.userimagefile = userimagefile;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	
}

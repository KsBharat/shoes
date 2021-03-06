package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress {
	
	
	@Id
	private String billingaddresssid;
	private String houseno;
	private String street;
	private String area;
	private String city;
	private String state;
	private int pincode;
	private String country;
	
	
	@OneToOne(mappedBy="billingaddress")
	private Customer customer;
	
	public String getBillingaddresssid() {
		return billingaddresssid;
	}
	public void setBillingaddresssid(String billingaddresssid) {
		this.billingaddresssid = billingaddresssid;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}

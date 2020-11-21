package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Customer {

	@Id
	private String username;
	@Column(name="cust_name", nullable= false)
	private String cust_name;
	@Column(name="emailid", nullable=false)
	private String emailId;
	@Column(name="phonenumber", nullable=false)
	private String phoneNumber;
	@Column(name="Address",nullable=false)
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


    public Customer(String username, String cust_name, String emailId, String phoneNumber, String address) {
	    super();
        this.username = username;
        this.cust_name = cust_name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}

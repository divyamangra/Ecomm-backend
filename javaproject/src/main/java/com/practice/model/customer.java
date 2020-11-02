package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class customer {
	
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
	
	
	
	
	

}

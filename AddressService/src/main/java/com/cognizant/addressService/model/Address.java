package com.cognizant.addressService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int user_id;
	@Column(name = "perm_add")
	private String permanentAddress;
	@Column(name = "pre_add")
	private String presentAddress;
	public Address(int user_id,String permanentAddress, String presentAddress) {
		super();
		this.user_id=user_id;
		this.permanentAddress = permanentAddress;
		this.presentAddress = presentAddress;
	}
	public Address() {
		super();
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	

}

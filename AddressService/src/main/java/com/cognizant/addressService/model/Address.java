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
	public Address(String permanentAddress, String presentAddress) {
		super();
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
	
	

}

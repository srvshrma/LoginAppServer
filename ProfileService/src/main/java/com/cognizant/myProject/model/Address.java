package com.cognizant.myProject.model;




public class Address {
	
	private int user_id;
	
	private String permanentAddress;
	
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

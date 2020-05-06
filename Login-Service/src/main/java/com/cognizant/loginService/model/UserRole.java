package com.cognizant.loginService.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class UserRole {
	@Id
	private int user_id;
	
	private ArrayList<UserRole> role;
	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
	public ArrayList<UserRole> getRole() {
		return role;
	}


	public void setRole(ArrayList<UserRole> role) {
		this.role = role;
	}


	public UserRole() {
		super();
	}
	
	
}

package com.cognizant.myProject.service;

import java.util.Optional;

import com.cognizant.myProject.exception.ProfileNotFoundException;
import com.cognizant.myProject.model.User;

public interface UserService {
	
	User createUser(User user) throws ProfileNotFoundException;
	
	Iterable<User> getAllUsers() throws ProfileNotFoundException ;
	Optional<User> findById(int id) throws ProfileNotFoundException;


}

package com.cognizant.myProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.myProject.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	
}

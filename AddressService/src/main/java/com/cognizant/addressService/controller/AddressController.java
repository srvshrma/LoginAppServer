package com.cognizant.addressService.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.addressService.model.Address;
import com.cognizant.addressService.service.AddService;

@RestController
public class AddressController {
	@Autowired
	AddService service;
	@GetMapping("/address/id/{id}")
	public Optional<Address> getById(@PathVariable(value = "id")int id){
		return service.getAddressById(id);
	}
	@PostMapping("/address/create")
	public Address create(@RequestBody Address address) {
	    return service.createAddress(address);	
	}
}

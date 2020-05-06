package com.cognizant.addressService.service;

import java.util.Optional;

import com.cognizant.addressService.model.Address;

public interface AddService {
	
	Address createAddress(Address address);
	Optional<Address> getAddressById(int id);
	

}

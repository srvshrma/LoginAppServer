package com.cognizant.addressService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.addressService.model.Address;
import com.cognizant.addressService.repository.AddressRepository;
@Service
public class AddServiceImpl implements AddService {
	@Autowired
	AddressRepository aRepo; 

	@Override
	public Optional<Address> getAddressById(int id) {
		
		return aRepo.findById(id);
	}

	@Override
	public Address createAddress(Address address) {
		// TODO Auto-generated method stub
		return aRepo.save(address);
	}

}

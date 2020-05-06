package com.cognizant.addressService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.addressService.model.Address;
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{

}

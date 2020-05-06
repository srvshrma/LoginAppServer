package com.cognizant.myProject.client;

import java.util.Optional;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.myProject.model.Address;


@org.springframework.cloud.openfeign.FeignClient(value="address-service",url = "http://localhost:8989/")
public interface FeignClient {
	@LoadBalanced
	@RequestMapping(value = "/address/create",method = RequestMethod.POST)
	public Address createAddress(Address address);
	@LoadBalanced
	@RequestMapping(value = "/address/id/{id}",method = RequestMethod.GET)
	public Optional<Address> getAddressById(@PathVariable(value="id")int id);

}

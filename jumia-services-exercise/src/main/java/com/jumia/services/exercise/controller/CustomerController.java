package com.jumia.services.exercise.controller;

import com.jumia.services.exercise.dto.CustomerDto;
import com.jumia.services.exercise.service.interfaces.CustomerServicesInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Amr Elkady
 */

@CrossOrigin(originPatterns = "*")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServicesInterface customerServicesInterface;
	
	
	@GetMapping("/customers")
	public List<CustomerDto> retrieveAllCustomer(){
		return customerServicesInterface.getAll();
	}

}
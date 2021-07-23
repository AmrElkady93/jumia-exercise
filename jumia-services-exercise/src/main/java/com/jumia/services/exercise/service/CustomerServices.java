package com.jumia.services.exercise.service;

import com.jumia.services.exercise.dto.CustomerDto;
import com.jumia.services.exercise.dto.adapter.CustomerAdapter;
import com.jumia.services.exercise.entity.Customer;
import com.jumia.services.exercise.repository.CustomerRepository;
import com.jumia.services.exercise.service.interfaces.CustomerServicesInterface;
import com.jumia.services.exercise.utils.CountryUtilityService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Amr Elkady
 */
@Service
public class CustomerServices implements CustomerServicesInterface {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerAdapter customerAdapter;
	
	@Autowired
	private CountryUtilityService countryUtils;

	
	@Override
	public List<CustomerDto> getAll() {

		List<Customer> customers = customerRepository.findAll();
		List<CustomerDto> customerDtos = new ArrayList<>();

		if (!customers.isEmpty()) {
			customerDtos = customerAdapter.toDTO(customers);
			countryUtils.setCountyNameAndCode(customerDtos);
			countryUtils.validatePhoneNumber(customerDtos);
		}

		return customerDtos;
	}

}

package com.jumia.services.exercise.controller;

import com.jumia.services.exercise.dto.CustomerDto;
import com.jumia.services.exercise.dto.adapter.CustomerAdapter;
import com.jumia.services.exercise.entity.Customer;
import com.jumia.services.exercise.repository.CustomerRepository;
import java.util.ArrayList;
import java.util.List;

import com.jumia.services.exercise.service.interfaces.CustomerServicesInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author Amr Elkady
 */
@ExtendWith(MockitoExtension.class)
class CustomerControllerTest {

	@InjectMocks
	CustomerController customerController;

	@Mock
	CustomerServicesInterface customerServicesInterface;

	CustomerAdapter customerAdapter=new CustomerAdapter();


	@Test
	void retrieveAllCustomer() {

		// given
		Customer customer_1 = new Customer(1, "Amr", "(212) 6007989253");
		Customer customer_2 = new Customer(2, "Oliver", "(258) 847651504");

		List<Customer> customers = new ArrayList<>();
		customers.add(customer_1);
		customers.add(customer_2);

		List<CustomerDto> customerDtos =customerAdapter.toDTO(customers);
		when(customerServicesInterface.getAll()).thenReturn(customerDtos);

		// when
		List<CustomerDto> result = customerController.retrieveAllCustomer();

		//then
		assertEquals(result.size(), 2);
		assertEquals(result.get(0).getName(), customer_1.getName());
		assertEquals(result.get(1).getName(), customer_2.getName());

	}
}
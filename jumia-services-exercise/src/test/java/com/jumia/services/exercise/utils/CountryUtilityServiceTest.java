package com.jumia.services.exercise.utils;

import com.jumia.services.exercise.dto.CustomerDto;
import com.jumia.services.exercise.dto.adapter.CustomerAdapter;
import com.jumia.services.exercise.entity.Customer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Amr Elkady
 */
@ExtendWith(MockitoExtension.class)
class CountryUtilityServiceTest {

	@InjectMocks
	CountryUtilityService CountryUtilityService;

	@InjectMocks
	CustomerAdapter customerAdapter;

	static List<Customer> customers;

	@BeforeAll
	static void beforeAll(){

		customers = new ArrayList<>();
		Customer customer_1 = new Customer(1, "Amr", "(212) 6007989253");
		Customer customer_2 = new Customer(2, "Oliver", "(258) 847651504");
		customers.add(customer_1);
		customers.add(customer_2);


	}

	@Test
	void setCountyNameAndCode(){

		//given
		List<CustomerDto> customerDtos =customerAdapter.toDTO(customers);

		//when
		CountryUtilityService.setCountyNameAndCode(customerDtos);

		//then
		assertEquals(customerDtos.get(0).getCountry(),Country.MOROCCO.getName());
		assertEquals(customerDtos.get(0).getCountryCode(),"+"+Country.MOROCCO.getCode().substring(1, Country.MOROCCO.getCode().length() - 1));

		assertEquals(customerDtos.get(1).getCountry(),Country.MOZAMBIQUE.getName());
		assertEquals(customerDtos.get(1).getCountryCode(),"+"+Country.MOZAMBIQUE.getCode().substring(1, Country.MOZAMBIQUE.getCode().length() - 1));

	}

	@Test
	void validatePhoneNumber(){

		//given
		List<CustomerDto> customerDtos =customerAdapter.toDTO(customers);

		//when
		CountryUtilityService.validatePhoneNumber(customerDtos);

		//then
		assertFalse(customerDtos.get(0).isState());
		assertTrue(customerDtos.get(1).isState());

	}
}
package com.jumia.services.exercise.dto.adapter;

import com.jumia.services.exercise.dto.CustomerDto;
import com.jumia.services.exercise.entity.Customer;
import com.jumia.services.exercise.interfaces.Adapter;
import org.springframework.stereotype.Component;

/**
 *
 * @author Amr Elkady
 */
@Component
public class CustomerAdapter implements Adapter<Customer, CustomerDto> {

	@Override
	public Customer toEntity(CustomerDto dto) {
		
		Customer entity =new Customer();
		
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setPhone(dto.getPhone());
		
		return entity;
	}

	@Override
	public CustomerDto toDTO(Customer entity) {
		
		CustomerDto dto =new CustomerDto();
		
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setPhone(entity.getPhone());
		
		return dto;
	}

}

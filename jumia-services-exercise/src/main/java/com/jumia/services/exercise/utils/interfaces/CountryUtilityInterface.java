/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jumia.services.exercise.utils.interfaces;

import com.jumia.services.exercise.dto.CustomerDto;
import java.util.List;

/**
 *
 * @author Amr Elkady
 */
public interface CountryUtilityInterface {
	
	void setCountyNameAndCode(List<CustomerDto> customerDtos);
	
	void validatePhoneNumber(List<CustomerDto> customerDtos);
}

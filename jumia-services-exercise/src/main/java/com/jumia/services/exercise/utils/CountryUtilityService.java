package com.jumia.services.exercise.utils;

import com.jumia.services.exercise.dto.CustomerDto;
import com.jumia.services.exercise.utils.interfaces.CountryUtilityInterface;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Amr Elkady
 */
@Component
public class CountryUtilityService implements CountryUtilityInterface {

	public void setCountyNameAndCode(List<CustomerDto> customerDtos) {

		for (CustomerDto cust : customerDtos) {
			String fullNumber = cust.getPhone();

			if (fullNumber.startsWith(Country.CAMEROON.getCode())) {

				cust.setCountry(Country.CAMEROON.getName());
				cust.setCountryCode(
						"+" + Country.CAMEROON.getCode().substring(1, Country.CAMEROON.getCode().length() - 1));
				cust.setNumber(cust.getPhone().substring(Country.CAMEROON.getCode().length()).trim());

			} else if (fullNumber.startsWith(Country.ETHIOPIA.getCode())) {

				cust.setCountry(Country.ETHIOPIA.getName());
				cust.setCountryCode(
						"+" + Country.ETHIOPIA.getCode().substring(1, Country.ETHIOPIA.getCode().length() - 1));
				cust.setNumber(cust.getPhone().substring(Country.ETHIOPIA.getCode().length()).trim());

			} else if (fullNumber.startsWith(Country.MOROCCO.getCode())) {

				cust.setCountry(Country.MOROCCO.getName());
				cust.setCountryCode(
						"+" + Country.MOROCCO.getCode().substring(1, Country.MOROCCO.getCode().length() - 1));
				cust.setNumber(cust.getPhone().substring(Country.MOROCCO.getCode().length()).trim());

			} else if (fullNumber.startsWith(Country.MOZAMBIQUE.getCode())) {

				cust.setCountry(Country.MOZAMBIQUE.getName());
				cust.setCountryCode(
						"+" + Country.MOZAMBIQUE.getCode().substring(1, Country.MOZAMBIQUE.getCode().length() - 1));
				cust.setNumber(cust.getPhone().substring(Country.MOZAMBIQUE.getCode().length()).trim());

			} else if (fullNumber.startsWith(Country.UGANDA.getCode())) {

				cust.setCountry(Country.UGANDA.getName());
				cust.setCountryCode("+" + Country.UGANDA.getCode().substring(1, Country.UGANDA.getCode().length() - 1));
				cust.setNumber(cust.getPhone().substring(Country.UGANDA.getCode().length()).trim());

			} else {
				cust.setCountry("Unknown");
				cust.setCountryCode("Unknown");
				cust.setNumber("Unknown");
			}

		}
	}

	@Override
	public void validatePhoneNumber(List<CustomerDto> customerDtos) {

		for (CustomerDto cust : customerDtos) {
			String fullNumber = cust.getPhone();
			if (fullNumber.startsWith(Country.CAMEROON.getCode())) {

				cust.setState(fullNumber.matches(Country.CAMEROON.getRegex()));

			} else if (fullNumber.startsWith(Country.ETHIOPIA.getCode())) {

				cust.setState(fullNumber.matches(Country.ETHIOPIA.getRegex()));

			} else if (fullNumber.startsWith(Country.MOROCCO.getCode())) {

				cust.setState(fullNumber.matches(Country.MOROCCO.getRegex()));

			} else if (fullNumber.startsWith(Country.MOZAMBIQUE.getCode())) {

				cust.setState(fullNumber.matches(Country.MOZAMBIQUE.getRegex()));

			} else if (fullNumber.startsWith(Country.UGANDA.getCode())) {

				cust.setState(fullNumber.matches(Country.UGANDA.getRegex()));

			} else {

				cust.setState(false);
			}

		}
	}
}

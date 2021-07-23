/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jumia.services.exercise.repository;

import com.jumia.services.exercise.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Amr Elkady
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
}

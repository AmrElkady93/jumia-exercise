package com.jumia.services.exercise.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Amr Elkady
 */

@Entity(name = "customer")
public class Customer {

	@Id
	private int id;

	private String name;

	private String phone;
	
	public Customer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", phone='" + phone + '\'' + '}';
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jumia.services.exercise.utils;

/**
 *
 * @author Amr Elkady
 */
public enum Country {

	CAMEROON("Cameroon", "(237)", "\\(237\\)\\ ?[2368]\\d{7,8}$"),
	ETHIOPIA("Ethiopia", "(251)", "\\(251\\)\\ ?[1-59]\\d{8}$"),
	MOROCCO("Morocco", "(212)", "\\(212\\)\\ ?[5-9]\\d{8}$"),
	MOZAMBIQUE("Mozambique", "(258)", "\\(258\\)\\ ?[28]\\d{7,8}$"),
	UGANDA("Uganda", "(256)", "\\(256\\)\\ ?\\d{9}$");

	private final String name;
	private final String code;
	private final String regex;

	Country(String name, String code, String regex) {
		this.name = name;
		this.code = code;
		this.regex = regex;
	}

	public String getName() {
		return (String)name;
	}

	public String getCode() {
		return (String)code;
	}

	public String getRegex() {
		return (String)regex;
	}

	@Override
	public String toString() {
		return "Country{" + "name=" + name + ", code=" + code + ", regex=" + regex + '}';
	}

}

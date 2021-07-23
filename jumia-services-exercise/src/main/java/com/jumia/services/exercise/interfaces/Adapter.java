/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jumia.services.exercise.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amr Elkady
 */
public interface Adapter<ENTITY,DTO> {
	
	public ENTITY toEntity(DTO dto);

	public DTO toDTO(ENTITY entity);

	default List<ENTITY> toEntity(List<DTO> dtos) {
		List<ENTITY> entities = new ArrayList<ENTITY>();
		dtos.forEach(dto -> entities.add(toEntity(dto)));
		return entities;
	}

	default List<DTO> toDTO(List<ENTITY> entities) {
		List<DTO> dtos = new ArrayList<DTO>();
		entities.forEach(entity -> dtos.add(toDTO(entity)));
		return dtos;
	}
	
}

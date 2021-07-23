package com.jumia.services.exercise.interfaces;

import java.util.List;

/**
 *
 * @author Amr Elkady
 */
public interface CrudServicesInterface<T, ID>{
	
	public List<T> getAll();

}

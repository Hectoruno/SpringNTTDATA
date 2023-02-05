package org.springframework.samples.petclinic.service;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Pet;

public interface PetService {
	
	Collection<Pet> getBornOrderByBirth(LocalDate i,LocalDate e) throws DataAccessException;

	
	Pet getPetById(Integer id) throws DataAccessException;

	void save(Pet p) throws DataAccessException;

}

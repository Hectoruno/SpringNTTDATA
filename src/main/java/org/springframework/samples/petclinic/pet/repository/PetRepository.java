package org.springframework.samples.petclinic.pet.repository;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Pet;

public interface PetRepository extends Repository<Pet, Integer> {

	Collection<Pet> findByBirthDateOrderByBirthDate(@Param("birth-date") LocalDate date);

	Collection<Pet> findAll() throws DataAccessException;

	void save(Pet pet);

}
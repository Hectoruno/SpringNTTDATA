package org.springframework.samples.petclinic.Specialty.repository;

import java.util.Collection;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Specialty;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.transaction.annotation.Transactional;

public interface SpecialtyRepository extends Repository<Specialty, Integer> {

	/**
	 * Retrieve all <code>Specialty</code>s from the data store.
	 * @return a <code>Collection</code> of <code>Specialty</code>s
	 */
	@Transactional(readOnly = true)
	@Cacheable("specialties")
	Collection<Vet> findAll() throws DataAccessException;

	/**
	 * Retrieve all <code>Specialty</code>s from data store in Pages
	 * @param pageable
	 * @return
	 * @throws DataAccessException
	 */
	@Transactional(readOnly = true)
	@Cacheable("specialties")
	Page<Vet> findAll(Pageable pageable) throws DataAccessException;

	void save(Specialty specialty);

	Specialty findById(@Param("id") Integer id);

}
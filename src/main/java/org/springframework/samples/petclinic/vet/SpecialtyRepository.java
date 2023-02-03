package org.springframework.samples.petclinic.vet;

import java.util.Collection;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface SpecialtyRepository extends Repository<Specialty, Integer> {

	/**
	 * Retrieve all <code>Specialty</code>s from the data store.
	 * @return a <code>Collection</code> of <code>Specialty</code>s
	 */
	@Transactional(readOnly = true)
	@Cacheable("specialty")
	Collection<Specialty> findAll() throws DataAccessException;

	/**
	 * Retrieve all <code>Specialty</code>s from data store in Pages
	 * @param pageable
	 * @return
	 * @throws DataAccessException
	 */
	@Transactional(readOnly = true)
	@Cacheable("specialty")
	Page<Specialty> findAll(Pageable pageable) throws DataAccessException;
}
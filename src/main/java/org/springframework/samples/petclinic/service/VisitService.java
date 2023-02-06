package org.springframework.samples.petclinic.service;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.samples.petclinic.model.Visit;

public interface VisitService {

	void save(Visit v);

	public Collection<Visit> getVisitsByPetId(Integer id) throws DataAccessException;

	Page<Visit> getMostFourRecentsVisits() throws DataAccessException;

	Visit getById(Integer id) throws DataAccessException;

}

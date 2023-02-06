package org.springframework.samples.petclinic.bill.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Bill;
import org.springframework.transaction.annotation.Transactional;

public interface BillRepository extends Repository<Bill, Integer>{
	
	void save(Bill bill);
	
	@Transactional(readOnly = true)
	@Cacheable("bills")
	Page<Bill> findAll() throws DataAccessException;
	
	Bill findById(Integer id) throws DataAccessException;
	
	/**
	 * Returnes all the bills from data store
	 **/
	@Query("SELECT bill FROM Bill bill")
	@Transactional(readOnly = true)
	Page<Bill> findAll(Pageable pageable);

}

package org.springframework.samples.petclinic.bill.controller;

import org.springframework.samples.petclinic.bill.repository.BillRepository;

public class BillController {
	
	private final BillRepository bills;

	public BillController(BillRepository bills) {
		this.bills = bills;
	}
}

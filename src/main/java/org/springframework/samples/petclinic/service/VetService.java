package org.springframework.samples.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.samples.petclinic.repository.VetRepository;

public class VetService {

	@Autowired
	VetRepository vetRepository;

	public Vets showResourcesVetList() {
		Vets vets = new Vets();
		vets.getVetList().addAll(vetRepository.findAll());
		return vets;
	}

}

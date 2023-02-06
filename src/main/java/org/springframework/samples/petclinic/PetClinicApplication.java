/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.samples.petclinic.Specialty.repository.SpecialtyRepository;
import org.springframework.samples.petclinic.bill.repository.BillRepository;
import org.springframework.samples.petclinic.model.Bill;
import org.springframework.samples.petclinic.model.Specialty;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.vet.repository.VetRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
@SpringBootApplication
@ImportRuntimeHints(PetClinicRuntimeHints.class)
//@OpenAPIDefinition(info = @Info(title = "ProductStore API", version = "2.0", description = "ProductStore Information"))
// @EnableSwagger2
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}
	@Bean
	public CommandLineRunner demoFactRepository(BillRepository bills) {
		return (args) -> {
			System.out.println("Bill List: ");

			for(Bill b: bills.findAll()) {
				System.out.println("Bill: " + b);
			}
		};
	}

}
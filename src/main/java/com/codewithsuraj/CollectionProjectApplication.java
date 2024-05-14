package com.codewithsuraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(CollectionProjectApplication.class, args);

		/**
		 *   Boolean isExits = patientRepository.existsById(id);
		 *         if (isExits) {
		 *             Patient patient1 = patientRepository.findById(id).get();
		 *
		 *             patient1.setName(patient.getName());
		 *             patient1.setEmail(patient.getEmail());
		 *             patient1.setAddress(patient.getAddress());
		 *             patient1.setDob(patient.getDob());
		 *             patient1.setGender(patient.getGender());
		 *             return patientRepository.save(patient1);
		 *
		 *         }
		 *         return null;
		 */
	}

}

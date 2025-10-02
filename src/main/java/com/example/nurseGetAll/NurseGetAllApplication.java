package com.example.nurseGetAll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NurseGetAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(NurseGetAllApplication.class, args);

		Nurse n1 = new Nurse("Ana", "Banana");
		Nurse n2 = new Nurse("Paco", "Paca");
		Nurse n3 = new Nurse("Crisso", "Neta");
		Nurse n4 = new Nurse("Banca", "Panca");
		Nurse n5 = new Nurse("Maca", "Paca");
		Nurse n6 = new Nurse("Rorro", "Calderas");

		NurseController.nurses.add(n1);
		NurseController.nurses.add(n2);
		NurseController.nurses.add(n3);
		NurseController.nurses.add(n4);
		NurseController.nurses.add(n5);
		NurseController.nurses.add(n6);

	}

}
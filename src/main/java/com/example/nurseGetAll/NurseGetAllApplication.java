package com.example.nurseGetAll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NurseGetAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(NurseGetAllApplication.class, args);

		Nurse n1 = new Nurse("Ana", "Banana", 25, "Female");
		Nurse n2 = new Nurse("Paco", "Paca", 21, "Male");
		Nurse n3 = new Nurse("Crisso", "Neta", 22, "Female");
		Nurse n4 = new Nurse("Banca", "Panca", 34, "Female");
		Nurse n5 = new Nurse("Maca", "Paca", 27, "Undefined");
		Nurse n6 = new Nurse("Rorro", "Calderas", 27, "Undefined");

		NurseController.nurses.add(n1);
		NurseController.nurses.add(n2);
		NurseController.nurses.add(n3);
		NurseController.nurses.add(n4);
		NurseController.nurses.add(n5);
		NurseController.nurses.add(n6);

	}

}
package com.example.nurseGetAll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NurseController {
	public static ArrayList<Nurse> nurses = new ArrayList<Nurse>();

	@GetMapping("nurse/name/{name}")
	public static List<Nurse> getByName(@PathVariable String name) {
		List<Nurse> nurseFound = new ArrayList<Nurse>();

		for (Nurse nurse : nurses) {
			if (nurse.getName().toLowerCase().contains(name.toLowerCase())) {
				nurseFound.add(nurse);
			}
		}
		return nurseFound;
	}
}
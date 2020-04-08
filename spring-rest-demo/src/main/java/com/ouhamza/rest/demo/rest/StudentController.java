package com.ouhamza.rest.demo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ouhamza.rest.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	private List<Student> students;
	
	@PostConstruct
	private void loadData() {
		students = new ArrayList<Student>();
		students.add(new Student("Ouhamza", "lhss"));
		students.add(new Student("tagguine", "adil"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		if(id >= students.size() || id < 0) {
			throw new StudentNotFoundException("Student id not found : "+ id);
		}
			
		return students.get(id);
	}
	

}

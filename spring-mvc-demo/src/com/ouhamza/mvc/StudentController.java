package com.ouhamza.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("showForm")
	public String showForm(Model model) {
		
		// create a student object
		Student student = new Student();
		// add student object to the model
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// create a student object
	    System.out.println("the student name is :"+ theStudent.getFirstName());
		return "student-confirmation";
	}
	
}

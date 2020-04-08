package com.ouhamza.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}

	
	@RequestMapping("showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult bindingResult) {

	    System.out.println("the student name is :|"+ theCustomer.getLastName()+"|");
	    System.out.println("the bindingResult is :|"+ bindingResult +"|");

		if(bindingResult.hasErrors()) {
			return "customer-form";
		}else {
			// create a student object
			return "customer-confirmation";		
		}
	
	}
	
}

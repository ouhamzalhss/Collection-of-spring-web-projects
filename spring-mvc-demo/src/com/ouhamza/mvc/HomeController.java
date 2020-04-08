package com.ouhamza.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HomeController {

	@RequestMapping
	public String showMyPage() {
		return "main-page";
	}
	
	@RequestMapping("helloForm")
	public String helloForm() {
		return "hello-form";
	}
	
	@RequestMapping("process")
	public String confirmPage(@RequestParam String studentName,Model model) {
		model.addAttribute("studentName","YO "+studentName.toUpperCase());
		return "confirm";
	}
}

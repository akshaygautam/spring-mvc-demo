package com.spring.mvc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	Student theStudent;
	@RequestMapping("/form")
	public String showForm(Model theModel) {
		//create new Student object
		theModel.addAttribute("student",theStudent);
		//add as model attribute
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student theStudent) {
		
		System.out.println("Name of the Student:\t"+theStudent.getFirstName()+" "+theStudent.getLastName());
		return "student-confirmation";
	}
}

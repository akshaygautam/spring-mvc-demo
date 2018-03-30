package com.spring.mvc.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private Customer customer;
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		StringTrimmerEditor trimer = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimer);
	}
	
	@RequestMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("customer",customer);
		return "customer-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult) {
		System.out.println("First name: |"+customer.getFirstName()+"|\nLast name:|"+customer.getLastName()+"|\nSalary:|"+
							customer.getSalary()+"|\nPostal:|"+customer.getPostal()+"|\n|"+customer.getCourseCode()+"|\n|"
							+bindingResult);
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}
		else
		return "customer-confirm";
	}
	
}

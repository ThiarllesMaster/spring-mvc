package com.customer;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@RequestMapping
    public ModelAndView showForm() {
        return new ModelAndView("customer", "customer", new Customer());
    }
	
	@PostMapping
	public String registerCustomer(@Valid @ModelAttribute("customer") Customer customer, 
			 BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			bindingResult.reject("cannot be empty", "cannot be empty");
			return "customer";
		}
		return "customer";
	}

}

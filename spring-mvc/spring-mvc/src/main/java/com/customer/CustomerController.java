package com.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/customer")
public class CustomerController {
	
	@GetMapping
	public String showIndex() {
		return "customer";
	}

}

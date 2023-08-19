package com.shivacode.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/welcome")
	public String getWelcome() {
		return "Hello welcome springboot";
		
	}

}

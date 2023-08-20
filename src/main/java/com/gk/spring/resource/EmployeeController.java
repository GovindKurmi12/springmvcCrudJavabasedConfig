package com.gk.spring.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	//@Autowired
	//private EmployeeService employeeService;

	@GetMapping("hello")
	public String addStudent() {
		// employeeService.addStudent(null);

		return "index";
	}
}

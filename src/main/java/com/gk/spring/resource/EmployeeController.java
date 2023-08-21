package com.gk.spring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gk.spring.model.Employee;
import com.gk.spring.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("hello")
	public String addStudent(Model m) {
		List<Employee> employeeList = employeeService.getAllEmployee();
		Employee employee = employeeList.get(0);
		m.addAttribute("employee", employee);
		return "index";
	}
}

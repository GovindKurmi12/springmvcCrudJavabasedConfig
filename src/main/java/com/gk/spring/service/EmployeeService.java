package com.gk.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.spring.model.Employee;
import com.gk.spring.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public void addStudent(Employee employee) {
		employeeRepo.addEmployee(employee);
	}

	public List<Employee> getAllEmployee() {
		return employeeRepo.getAllEmployee();

	}
}

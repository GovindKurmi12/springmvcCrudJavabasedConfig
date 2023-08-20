package com.gk.spring.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gk.spring.model.Employee;

@Repository
public class EmployeeRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addEmployee(Employee employee) {
		String sql = "";
		Object[] arg = {};
		jdbcTemplate.update(sql, arg);
	}
}

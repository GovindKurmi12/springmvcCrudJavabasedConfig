package com.gk.spring.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	public List<Employee> getAllEmployee() {
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setAddress(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setName(rs.getString(4));
				e.setPhone(rs.getString(5));

				return e;
			}
		});
	}
}

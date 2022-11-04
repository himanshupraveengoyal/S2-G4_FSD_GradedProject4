package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	// 3. Now Your application should be able to add employees data in the db if and
	// only if the authenticated user is ADMIN-
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	// 4. Your application should provide an endpoint to list all the employees
	// stored in the database.
	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	// 6. creating put mapping that updates the employee detail
	@PutMapping("/employee")
	private Employee update(@RequestBody Employee employee) {
		employeeService.update(employee);
		return employee;
	}

	// 7.creating a delete mapping that deletes a specified employee
	@DeleteMapping("/employee/{employeeid}")
	private void deleteEmployee(@PathVariable("employeeid") Long employeeid) {
		employeeService.delete(employeeid);
	}
}

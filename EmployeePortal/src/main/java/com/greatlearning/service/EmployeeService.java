package com.greatlearning.service;

import java.util.List;

import com.greatlearning.model.Employee;

public interface EmployeeService {

	// 3. add employee data inside db
	Employee addEmployee(Employee employee);

	// 4. get all employee data
	List<Employee> getAllEmployees();
	
	// 5. get employee based on id
	Employee getEmployeeBasedOnId(long id);

	// 6.updating a record
	void update(Employee employee);

	// 7.deleting a specific record by using the method deleteById() of
	void delete(Long id);

}
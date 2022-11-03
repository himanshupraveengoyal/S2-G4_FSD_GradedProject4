package com.greatlearning.employeePortal.service;

import java.util.List;

import com.greatlearning.employeePortal.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
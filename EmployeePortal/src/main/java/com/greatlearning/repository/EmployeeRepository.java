package com.greatlearning.repository;

import com.greatlearning.model.Employee;

public interface EmployeeRepository {
	
	public void save(Employee employee);
	public void deleteById(int id);

}

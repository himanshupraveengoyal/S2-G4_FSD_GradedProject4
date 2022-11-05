package com.greatlearning.employeePortal.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.greatlearning.employeePortal.Repository.EmployeeRepository;
import com.greatlearning.employeePortal.entity.Employee;
import com.greatlearning.employeePortal.service.EmployeeService;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	// 3. add employee data inside db
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	// 4. get all employee data
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// 5. get employee based on id
	@Override
	public Employee getEmployeeBasedOnId(long id) {
		return employeeRepository.findById(id).get();
	}

	// 6.updating a record
	@Override
	public void update(Employee employee) {
		employeeRepository.save(employee);
	}

	// 7.deleting a specific record by using the method deleteById() of
	@Override
	public void delete(Long id) {
		employeeRepository.deleteById(id);
	}

	// 8.Fetch an employee by first name 
	@Override
	public List<Employee> getEmployeeByFirstName(String firstName) {
		return (List<Employee>) employeeRepository.findAllByName(firstName);
	}

	// 9.Fetch List of employee by first name sorted in asc or desc
	@Override
	public List<Employee> getEmployeeByFirstNameSortedASC(String firstName) {
		return (List<Employee>) employeeRepository.findAll(Sort.by(Direction.ASC ,firstName));
	}

	@Override
	public List<Employee> getEmployeeByFirstNameSortedDESC(String firstName) {
		return (List<Employee>) employeeRepository.findAll(Sort.by(Direction.DESC ,firstName));
	}

}

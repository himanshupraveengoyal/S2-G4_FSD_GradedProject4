package com.greatlearning.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greatlearning.model.Employee;
import com.greatlearning.repository.EmployeeRepository;
import com.greatlearning.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired  
	EmployeeRepository employeeRepository; 
	
	// 3. add employee data inside db
		@Override
		public Employee addEmployee(Employee employee) {
			return employeeRepository.save(employee);
		}

		//4. get all employee data
		@Override
		public List<Employee> getAllEmployees() {
			return employeeRepository.findAll();
		}
		
	//6.updating a record  
			@Override
			public void update(Employee employee)   
			{  
				employeeRepository.save(employee);  
			}

	//7.deleting a specific record by using the method deleteById() of CrudRepository  
		@Override
		public void delete(Long id)   
		{  
			employeeRepository.deleteById(id);  
		}

		
	
}

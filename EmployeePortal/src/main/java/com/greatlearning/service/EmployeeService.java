package com.greatlearning.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greatlearning.model.Employee;
import com.greatlearning.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired  
	EmployeeRepository employeeRepository; 
	
	//6.updating a record  
			public void update(Employee employee)   
			{  
				employeeRepository.save(employee);  
			}

	//7.deleting a specific record by using the method deleteById() of CrudRepository  
		public void delete(int id)   
		{  
			employeeRepository.deleteById(id);  
		}

		
	
}

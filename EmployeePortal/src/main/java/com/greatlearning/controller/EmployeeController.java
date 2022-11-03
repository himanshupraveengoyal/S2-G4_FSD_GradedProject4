package com.greatlearning.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.greatlearning.service.EmployeeService;
import com.greatlearning.model.Employee;

@RestController
public class EmployeeController {
	@Autowired  
	EmployeeService employeeService;
	
	//6. creating put mapping that updates the employee detail   
		@PutMapping("/employee")  
		private Employee update(@RequestBody Employee employee)   
		{  
			employeeService.update(employee);  
		return employee;  
		}  
	//7.creating a delete mapping that deletes a specified employee  
		@DeleteMapping("/employee/{employeeid}")  
		private void deleteEmployee(@PathVariable("employeeid") int employeeid)   
		{  
			employeeService.delete(employeeid);  
		}  
}

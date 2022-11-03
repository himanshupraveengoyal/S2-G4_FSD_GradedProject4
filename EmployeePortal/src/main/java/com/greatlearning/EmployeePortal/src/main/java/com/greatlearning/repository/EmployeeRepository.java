package com.greatlearning.employeePortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeePortal.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

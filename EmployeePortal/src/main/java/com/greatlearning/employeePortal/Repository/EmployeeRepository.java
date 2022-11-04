package com.greatlearning.employeePortal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeePortal.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

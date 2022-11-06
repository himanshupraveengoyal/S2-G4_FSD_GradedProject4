package com.greatlearning.employeePortal.repository;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.employeePortal.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.firstName= ?1")
    List<Employee> findAllByName(String firstName);
}

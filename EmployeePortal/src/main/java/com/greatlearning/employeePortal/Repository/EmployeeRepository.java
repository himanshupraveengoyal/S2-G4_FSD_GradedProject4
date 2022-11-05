package com.greatlearning.employeePortal.Repository;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.employeePortal.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findAll(String firstName);
    @Query("select * from Employee where firstName = ?1")
    List<Employee> findAllByName(String firstName);
}

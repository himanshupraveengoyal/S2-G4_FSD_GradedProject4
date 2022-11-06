package com.greatlearning.employeePortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeePortal.entity.AppUsers;

public interface ApplicationUserRepository extends JpaRepository<AppUsers, String> {

}

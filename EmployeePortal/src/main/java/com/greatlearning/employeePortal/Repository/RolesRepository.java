package com.greatlearning.employeePortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeePortal.entity.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long> {

}

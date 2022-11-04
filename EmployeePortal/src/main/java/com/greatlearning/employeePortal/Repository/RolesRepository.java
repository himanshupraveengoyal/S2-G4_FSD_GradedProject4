package com.greatlearning.employeePortal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeePortal.entity.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long> {

}

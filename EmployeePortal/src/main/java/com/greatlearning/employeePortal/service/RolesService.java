package com.greatlearning.employeePortal.service;

import java.util.Optional;

import com.greatlearning.employeePortal.entity.Roles;

public interface RolesService {

	void addRole(Roles roles);

	Optional<Roles> getRoleById(long id);
}

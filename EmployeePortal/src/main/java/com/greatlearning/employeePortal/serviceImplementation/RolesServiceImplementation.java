package com.greatlearning.employeePortal.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeePortal.entity.Roles;
import com.greatlearning.employeePortal.repository.RolesRepository;
import com.greatlearning.employeePortal.service.RolesService;

@Service
public class RolesServiceImplementation implements RolesService {

	@Autowired
	RolesRepository rolesRepository;

	@Override
	public void addRole(Roles roles) {
		rolesRepository.saveAndFlush(roles);
	}

	@Override
	public Optional<Roles> getRoleById(long id) {
		return rolesRepository.findById(id);
	}
}

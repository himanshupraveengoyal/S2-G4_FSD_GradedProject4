package com.greatlearning.employeePortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeePortal.entity.Roles;
import com.greatlearning.employeePortal.serviceImplementation.RolesServiceImplementation;

@RestController
@RequestMapping("/Roles")
public class RolesController {

	@Autowired
	RolesServiceImplementation rolesServiceImplementation;

	@PostMapping("/addRole")
	public String addRoles(@RequestBody Roles roles) {
		rolesServiceImplementation.addRole(roles);
		return "Role added Successfully!!!";
	}

}

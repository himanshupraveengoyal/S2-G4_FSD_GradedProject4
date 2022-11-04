package com.greatlearning.employeePortal.service;

import java.util.Optional;

import com.greatlearning.employeePortal.entity.AppUsers;

public interface UserService {

	void addUser(AppUsers user);

	Optional<AppUsers> getUserDetails(String username);
}

package com.greatlearning.employeePortal.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeePortal.entity.AppUsers;
import com.greatlearning.employeePortal.repository.ApplicationUserRepository;
import com.greatlearning.employeePortal.service.UserService;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	ApplicationUserRepository appUserRepository;

	@Override
	public void addUser(AppUsers user) {
		appUserRepository.saveAndFlush(user);
	}

	@Override
	public Optional<AppUsers> getUserDetails(String username) {
		return appUserRepository.findById(username);
	}

}

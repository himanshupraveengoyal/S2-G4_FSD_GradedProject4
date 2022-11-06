package com.greatlearning.employeePortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeePortal.encryption.PasswordEncryption;
import com.greatlearning.employeePortal.entity.AppUsers;
import com.greatlearning.employeePortal.serviceImplementation.UserServiceImplementation;

@RestController
@RequestMapping("/Users")
public class AppUsersController {

	@Autowired
	UserServiceImplementation userServiceImplementation;

	public static boolean isAdminSessionActive = false;

	@PostMapping("/addUser")
	public String addUser(@RequestBody AppUsers user) {
		try {
			user.setPassword(PasswordEncryption.getMd5(user.getPassword()));
			userServiceImplementation.addUser(user);
		} catch (Exception e) {
			return "User cannot be saved. User role may not exists";
		}
		return "User saved successfully";
	}

	@PostMapping("/login")
	public String userAuthentication(@RequestBody AppUsers user) {

		try {
			user.setPassword(PasswordEncryption.getMd5(user.getPassword()));
			AppUsers userFromDb = userServiceImplementation.getUserDetails(user.getUsername()).get();
			if (userFromDb.getUsername().toLowerCase().equals(user.getUsername().toLowerCase())
					&& userFromDb.getPassword().equals(user.getPassword())) {
				if (userFromDb.getRoles().getName().toLowerCase().equals("admin"))
					isAdminSessionActive = true;
				else
					isAdminSessionActive = false;
				return "login successfully!!!";
			}
		} catch (Exception e) {
			isAdminSessionActive = false;
			return "Particular user does not exists";
		}
		isAdminSessionActive = false;
		return "login failed. Enter correct user credentials!!!";
	}
}

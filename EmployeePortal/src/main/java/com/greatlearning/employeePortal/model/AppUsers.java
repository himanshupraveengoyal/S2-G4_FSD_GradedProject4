package com.greatlearning.employeePortal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String username;
	
	private String password;
	
	@OneToOne
	private Roles roles;

}

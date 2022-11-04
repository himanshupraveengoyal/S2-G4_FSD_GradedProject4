package com.greatlearning.employeePortal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

	// Defining employee id as primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String firstName;

	private String lastName;

	private String email;
}

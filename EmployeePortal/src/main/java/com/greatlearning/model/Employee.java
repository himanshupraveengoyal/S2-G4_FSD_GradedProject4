package com.greatlearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//mark class as an Entity   
@Entity
//defining class name as Table name  
@Table(name = "employee")

//Getters and Setter Dependencies
@Getter
@Setter

//Constructor Dependencies
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	// Defining employee id as primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	public String firstName;
	public String lastName;
	public String email;
}
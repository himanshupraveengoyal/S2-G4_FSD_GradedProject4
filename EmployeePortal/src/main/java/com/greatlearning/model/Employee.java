package com.greatlearning.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name="employee")  
public class Employee {
	//Defining employee id as primary key  
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		public long id;
		public String firstName;
		public String lastName;
		public String email;
		
		public Employee() {
			
		}
		
		public Employee(String firstName, String lastName, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}

		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
		}
}

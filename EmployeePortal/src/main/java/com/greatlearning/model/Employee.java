package com.greatlearning.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Employee {
	//Defining employee id as primary key  
		@Id  
		@Column  
		private int employee_id;  
		@Column  
		private String employee_First_Name;  
		@Column  
		private String employee_Second_Name;  
		@Column  
		private String employee_email_id;  
		public int getemployee_id()   
		{  
		return employee_id;  
		}  
		public void setemployee_id(int employee_id)   
		{  
		this.employee_id = employee_id;  
		}  
		public String getemployee_First_Name()  
		{  
		return employee_First_Name;  
		}  
		public void setemployee_First_Name(String employee_First_Name)   
		{  
		this.employee_First_Name = employee_First_Name;  
		}  
		public String getemployee_Second_Name()   
		{  
		return employee_Second_Name;  
		}  
		public void setemployee_Second_Name(String employee_Second_Name)   
		{  
		this.employee_Second_Name = employee_Second_Name;  
		}  
		public String getemployee_email_id()   
		{  
		return employee_email_id;  
		}  
		public void setemployee_email_id(String employee_email_id)   
		{  
		this.employee_email_id = employee_email_id;  
		}  
}

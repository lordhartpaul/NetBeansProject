package com.simpleproject.employeesalary.model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Employeesalary implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Size(min=3,max=30)
	private String firstName;
	
	@Size(min=3,max=30)
	private String lastName;
	
	@NotEmpty
	private String salary;

}

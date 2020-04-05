package com.simpleproject.employeesalary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
@EnabledJpaAuditing
public class EmployeeSalaryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(EmployeeSalaryApplication.class, args);

	}

}

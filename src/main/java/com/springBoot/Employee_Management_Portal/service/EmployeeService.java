package com.springBoot.Employee_Management_Portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springBoot.Employee_Management_Portal.entity.Employee;
import com.springBoot.Employee_Management_Portal.repo.EmployeeRepo;

@Component
public class EmployeeService {

	@Autowired
	EmployeeRepo er;
	
	public String addEmployee(Employee emp) {
		 er.save(emp);
		 return "employee saved";
	}
}

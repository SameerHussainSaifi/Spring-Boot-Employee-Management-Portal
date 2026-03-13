package com.springBoot.Employee_Management_Portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springBoot.Employee_Management_Portal.entity.Employee;
import com.springBoot.Employee_Management_Portal.repo.EmployeeRepo;

@Component
public class EmployeeService {

	@Autowired
	EmployeeRepo er;
	
	public Employee addEmployee(Employee emp) {
		return  er.save(emp);
		 
	}
	
	public List<Employee> getAllEmployees() {
		return (List<Employee>) er.findAll();
	}
}

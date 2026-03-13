package com.springBoot.Employee_Management_Portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springBoot.Employee_Management_Portal.entity.Employee;
import com.springBoot.Employee_Management_Portal.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	
	
	 
@GetMapping("/employee/add")
public String showAddEmployeePage() {
	return "addEmployee";
}
	    
	
	@PostMapping("/employee/save")
	public String addEmployee(@ModelAttribute Employee emp) {
		es.addEmployee(emp);
		return "redirect:/admin/dashboard";
	}
}

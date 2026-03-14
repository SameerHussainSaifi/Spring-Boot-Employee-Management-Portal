package com.springBoot.Employee_Management_Portal.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/employee/update/{id}")
	public String showUpdateForm(@PathVariable("id") int id, Model model) {
		Employee employee=es.getEmployeeById(id);
		model.addAttribute("employee",employee);
		return "updateEmployee";
	}
	
	@PostMapping("/employee/update")
	public String updateEmployee(@ModelAttribute Employee emp) {
		es.updateEmployee(emp);
		return "redirect:/admin/dashboard";
		
	}
	
	@GetMapping("/employee/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		es.deleteEmployee(id);
		return "redirect:/admin/dashboard";
	}
}

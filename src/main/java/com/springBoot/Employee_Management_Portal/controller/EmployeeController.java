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
	
	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}
	
	 @GetMapping("/admin/login")
	    public String showLoginPage() {
	        return "adminLogin"; // This will render WEB-INF/views/admin-login.jsp
	    }

	    @GetMapping("/admin/register")
	    public String showRegisterPage() {
	        return "adminRegister"; // This will render WEB-INF/views/admin-register.jsp
	    }
	
	@PostMapping("/save")
	public String addEmployee(@ModelAttribute Employee emp) {
		return es.addEmployee(emp);
	}
}

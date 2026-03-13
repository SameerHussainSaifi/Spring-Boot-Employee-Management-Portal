package com.springBoot.Employee_Management_Portal.repo;

import org.springframework.data.repository.CrudRepository;

import com.springBoot.Employee_Management_Portal.entity.Admin;
import com.springBoot.Employee_Management_Portal.entity.Employee;

public interface AdminRepo extends CrudRepository<Admin, Integer> {

	

	Admin findByEmail(String email);



	



}

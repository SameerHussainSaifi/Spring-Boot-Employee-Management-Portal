package com.springBoot.Employee_Management_Portal.repo;

import org.springframework.data.repository.CrudRepository;

import com.springBoot.Employee_Management_Portal.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}

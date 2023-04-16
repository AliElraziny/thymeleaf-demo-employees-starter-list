package com.try2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.try2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	Employee deleteById(int theId);
	
}

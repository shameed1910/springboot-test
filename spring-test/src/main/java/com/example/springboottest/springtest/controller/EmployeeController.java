package com.example.springboottest.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboottest.springtest.entity.Employee;
import com.example.springboottest.springtest.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void createEmployee(@RequestBody Employee employee) {
		 this.employeeRepository.save(employee);
	}
	

}

package com.example.springboottest.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboottest.springtest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.IEmpoyeeService;

@RestController
public class EmployeeController {
	@Autowired
	IEmpoyeeService employeeservice;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello world";
		
	}
	@PostMapping("/employee")
	Integer createEmplyee(@RequestBody Employee employee) {
		
		Integer id=employeeservice.saveEmployee(employee);
		System.out.println(id);
		return id;
	}
	@GetMapping("/allemployees")
	public List<Employee>getEmployee(){
		return employeeservice.getAllEmployees();
		
	}

}

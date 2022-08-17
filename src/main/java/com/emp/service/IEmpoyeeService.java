package com.emp.service;

import java.util.List;

import com.emp.model.Employee;

public interface IEmpoyeeService {

	Integer saveEmployee(Employee employee);
	
	public List<Employee>getAllEmployees();
	
}

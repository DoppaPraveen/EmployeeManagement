package com.emp.service;

import java.util.List;
import java.util.Optional;

import com.emp.model.Employee;

public interface IEmpoyeeService {

	Integer saveEmployee(Employee employee);
	
	public List<Employee>getAllEmployees();
	
	Optional<Employee>grtEmployee(Integer id);
	
	public void deleteEmployee(Integer id);
	
	Employee updateEmployee(Employee employee,Integer id);
	
	
}

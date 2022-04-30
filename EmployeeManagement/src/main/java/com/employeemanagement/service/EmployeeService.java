package com.employeemanagement.service;

import java.util.List;

import com.employeemanagement.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
}

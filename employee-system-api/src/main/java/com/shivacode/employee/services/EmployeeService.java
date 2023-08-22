package com.shivacode.employee.services;

import java.util.List;

import com.shivacode.employee.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

	boolean deleteEmployee(Long id);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Long id, Employee employee);

}

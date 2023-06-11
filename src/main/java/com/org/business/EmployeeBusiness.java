package com.org.business;

import java.util.List;

import com.org.entity.Employee;

public interface EmployeeBusiness {

	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(Integer empId);
	
	public List<Employee> getAllEmployee();
	
}

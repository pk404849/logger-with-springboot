package com.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.business.EmployeeBusiness;
import com.org.entity.Employee;
import com.org.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeBusiness employeeBusiness;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeBusiness.saveEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		return employeeBusiness.getEmployeeById(empId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeBusiness.getAllEmployee();
	}

}

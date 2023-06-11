package com.org.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.business.EmployeeBusiness;
import com.org.entity.Employee;
import com.org.repository.EmployeeRepository;

@Service
public class EmployeeBusinessImpl implements EmployeeBusiness{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Employee getEmployeeById(Integer empId) {
		return employeeRepository.getOne(empId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

}

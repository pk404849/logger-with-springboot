package com.org.converter;

import java.util.ArrayList;
import java.util.List;

import com.org.entity.Employee;
import com.org.model.EmployeeModel;

public class ApiConverter {

	public static Employee getEmployeeJpaObject(EmployeeModel employeeModel) {

		if (employeeModel != null) {
			Employee employee = new Employee();

			employee.setId(employeeModel.getId());
			employee.setName(employeeModel.getName());
			employee.setSalary(employeeModel.getSalary());
			employee.setDepartment(employeeModel.getDepartment());
			employee.setAddress(employeeModel.getAddress());
			return employee;

		}
		return null;
	}

	public static EmployeeModel getEmployeeModelObject(Employee employee) {
		if (employee != null) {
			EmployeeModel employeeModel = new EmployeeModel();

			employeeModel.setId(employee.getId());
			employeeModel.setName(employee.getName());
			employeeModel.setSalary(employee.getSalary());
			employeeModel.setDepartment(employee.getDepartment());
			employeeModel.setAddress(employee.getAddress());
			return employeeModel;

		}
		return null;
	}

	public static List<EmployeeModel> getEmployeeJpaListObject(List<Employee> employeeList) {
		if (employeeList != null && !employeeList.isEmpty()) {
			List<EmployeeModel> employeeModelList = new ArrayList<>();
			for (Employee employee : employeeList) {
				employeeModelList.add(getEmployeeModelObject(employee));
			}
			return employeeModelList;
		}
		return null;
	}

}

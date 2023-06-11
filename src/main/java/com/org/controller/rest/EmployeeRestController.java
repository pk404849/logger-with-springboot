package com.org.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.controller.BaseController;
import com.org.controller.ResponseMessage;
import com.org.converter.ApiConverter;
import com.org.entity.Employee;
import com.org.model.EmployeeModel;
import com.org.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeRestController extends BaseController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/save-employee")
	public ResponseEntity<?> saveEmployee(@RequestBody EmployeeModel employeeModel) {

		Employee employee = ApiConverter.getEmployeeJpaObject(employeeModel);
		employeeService.saveEmployee(employee);
		ResponseMessage message = new ResponseMessage();
		message.setStatus(true);
		if (employeeModel.getId() == 0) {
			message.setMessage("Employee object saved successfully.");
		} else {
			message.setMessage("Employee object updated successfully.");
		}
		return sendResponse(message);
	}

	@GetMapping(value = "/get-by-id/{employeeId}")
	public ResponseEntity<?> getEmployeeById(@PathVariable(name = "employeeId") Integer employeeId) {
		Employee employee = employeeService.getEmployeeById(employeeId);
		EmployeeModel employeeModel = ApiConverter.getEmployeeModelObject(employee);
		ResponseMessage message = new ResponseMessage();
		message.setStatus(true);
		message.setData(employeeModel);
		return sendResponse(message);
	}

	@GetMapping(value = "/get-all")
	public ResponseEntity<?> getAllEmployee() {
		List<Employee> employeeList = employeeService.getAllEmployee();
		List<EmployeeModel> employeeModelList = ApiConverter.getEmployeeJpaListObject(employeeList);
		ResponseMessage message = new ResponseMessage();
		message.setStatus(true);
		message.setData(employeeModelList);
		return sendResponse(message);
	}
}

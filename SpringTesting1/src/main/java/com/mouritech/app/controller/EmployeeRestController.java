package com.mouritech.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.app.model.Employee;
import com.mouritech.app.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@GetMapping("/")
	public List<Employee> getCustomers() {
		return employeeRepository.findAll();
	}
	

	@PutMapping("/")
	public Employee updateEmployee(@RequestBody Employee employee) {
	    return employeeRepository.save(employee);
	}
	
	@DeleteMapping("/")
	public String deleteCustomers(@RequestBody Employee employee) {
		employeeRepository.delete(employee);
		return "Employee deleted";
	}
}

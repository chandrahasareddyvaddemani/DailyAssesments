package com.mouritech.app.testing;

import org.springframework.stereotype.Service;

import com.mouritech.app.model.Employee;
import com.mouritech.app.repository.EmployeeRepository;

@Service
public class MyService {

	private EmployeeRepository empRepo;
	public Employee addEmployee(Employee employee) {

	    return employee; 
	}
	 
}

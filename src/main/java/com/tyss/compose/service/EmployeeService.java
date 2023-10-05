package com.tyss.compose.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.compose.entity.Employee;
import com.tyss.compose.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public List<Employee> getEmployee() {
		return employeeRepo.findAll();
	}

}

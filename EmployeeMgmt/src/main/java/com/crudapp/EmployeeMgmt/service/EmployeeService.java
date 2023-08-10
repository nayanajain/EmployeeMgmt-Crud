package com.crudapp.EmployeeMgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapp.EmployeeMgmt.model.Employee;
import com.crudapp.EmployeeMgmt.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void saveEmployee(Employee employee)
	{
		employeeRepo.save(employee);
		
	}
	
	public List<Employee> getEmployee() {
		List<Employee> employees = employeeRepo.findAll();
		return employees;
		
	}
	
	public Optional<Employee> getEmployeeById(int id) {
		Optional<Employee> employee = employeeRepo.findById(id);
		return employee;
		
	}
	
	public Optional<Employee> deleteEmployee(int id) {
		Optional<Employee> employee = employeeRepo.findById(id);
		employeeRepo.deleteById(id);
		return employee;
		
	}

}

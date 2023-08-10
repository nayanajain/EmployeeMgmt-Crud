package com.crudapp.EmployeeMgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crudapp.EmployeeMgmt.model.Employee;
import com.crudapp.EmployeeMgmt.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = "/welcome")
	public String demoAPI() {
		return "Welcome to Spring Application";
	}
	
	@PostMapping(value = "/add-employee")
	public String save(@RequestBody Employee employee)
	{
		employeeService.saveEmployee(employee);
		return "employee saved to db";
		
	}
	
	@GetMapping(value = "/view-all-employee")
	public List<Employee> getEmployeeData()
	{
		List employees = employeeService.getEmployee();
		return employees;
		
	}
	
	@GetMapping(value = "/view-employee/{id}")
	public Optional<Employee> getEmployeeDataById(@PathVariable("id") int id)
	{
		Optional<Employee> employees = employeeService.getEmployeeById(id);
		return employees;
		
	}
	
	@DeleteMapping(value = "/delete-employee/{id}")
	public Optional<Employee> deleteEmployeeData(@PathVariable("id") int id)
	{
		Optional<Employee> employee = employeeService.deleteEmployee(id);
		return employee;
		
	}
	
	@PutMapping(value = "/update-employee")
	public String updateEmployee(@RequestBody Employee employee)
	{
		employeeService.saveEmployee(employee);
		return "employee updated to db";
		
	}

}

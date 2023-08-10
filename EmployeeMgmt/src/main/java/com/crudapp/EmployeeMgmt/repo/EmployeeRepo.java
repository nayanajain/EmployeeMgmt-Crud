package com.crudapp.EmployeeMgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapp.EmployeeMgmt.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}

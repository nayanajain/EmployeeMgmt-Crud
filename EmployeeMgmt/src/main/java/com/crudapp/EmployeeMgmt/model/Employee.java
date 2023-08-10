package com.crudapp.EmployeeMgmt.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private int yearsofexp;
	
	public Employee(int id, String name, int age, int yearsofexp) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.yearsofexp = yearsofexp;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYearsofexp() {
		return yearsofexp;
	}
	public void setYearsofexp(int yearsofexp) {
		this.yearsofexp = yearsofexp;
	}
	
	
	
	
	
}

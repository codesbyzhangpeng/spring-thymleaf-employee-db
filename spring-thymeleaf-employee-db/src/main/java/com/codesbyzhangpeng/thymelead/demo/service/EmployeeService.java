package com.codesbyzhangpeng.thymelead.demo.service;

import java.util.List;

import com.codesbyzhangpeng.thymelead.demo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	

}

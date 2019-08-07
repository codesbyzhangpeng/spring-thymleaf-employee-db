package com.codesbyzhangpeng.thymelead.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.codesbyzhangpeng.thymelead.demo.dao.EmployeeJpaRepo;
import com.codesbyzhangpeng.thymelead.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeJpaRepo employeeRepo;

	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeJpaRepo") EmployeeJpaRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	@Override
		public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee findById(int theId) {
		
		Optional<Employee> result = employeeRepo.findById(theId);
		
		if(result.isPresent()) {
			return result.get();
		}else {
			throw new RuntimeException("Id not found");
		}
		
	}

	@Override
	public void save(Employee theEmployee) {
		employeeRepo.save(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		employeeRepo.deleteById(theId);
	}

}

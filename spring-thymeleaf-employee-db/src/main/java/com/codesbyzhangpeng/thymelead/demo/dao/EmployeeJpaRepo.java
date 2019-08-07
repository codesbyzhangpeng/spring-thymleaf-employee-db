package com.codesbyzhangpeng.thymelead.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codesbyzhangpeng.thymelead.demo.entity.Employee;

public interface EmployeeJpaRepo extends JpaRepository<Employee, Integer> {

}

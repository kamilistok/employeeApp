package com.employeesapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeesapplication.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByLastNameAsc();
	
}

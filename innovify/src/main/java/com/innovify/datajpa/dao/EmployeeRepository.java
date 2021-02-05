package com.innovify.datajpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovify.datajpa.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	 List<Employee> findByEaddressContaining(String location);
}

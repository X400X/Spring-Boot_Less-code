package com.smirnovkoss.spring_boot_fast.dao;

import com.smirnovkoss.spring_boot_fast.entity.Employee;
import org.springframework.data.jpa.repository. JpaRepository;
import org.springframework.stereotype. Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
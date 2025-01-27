package com.faang.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faang.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public Optional<Employee> findByEmail(String email);
}

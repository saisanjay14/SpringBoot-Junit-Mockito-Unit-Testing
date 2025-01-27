package com.faang.service;

import java.util.List;
import java.util.Optional;

import com.faang.entity.Employee;
import com.faang.exception.ResourceNotFoundException;

public interface EmployeeService {
	Employee saveEmployee(Employee employee) throws ResourceNotFoundException;
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(long id);
    Employee updateEmployee(Employee updatedEmployee);
    void deleteEmployee(long id);
}

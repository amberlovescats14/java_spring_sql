package com.amber.rest.service;

import com.amber.rest.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    List<Employee> getAllEmployeeList();

    Optional<Employee> getEmployee(Long employeeID);

    void deleteEmployee(Long employeeId);

}

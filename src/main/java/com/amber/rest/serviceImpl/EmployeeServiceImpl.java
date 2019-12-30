package com.amber.rest.serviceImpl;

import com.amber.rest.entity.Employee;
import com.amber.rest.repos.EmployeeRepository;
import com.amber.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    @Override
    public List<Employee> getAllEmployeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployee(Long employeeID) {
        return employeeRepository.findById(employeeID);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}

package com.amber.rest.controller;


import com.amber.rest.entity.Employee;
import com.amber.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("employee")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployeeList();
    }

    @GetMapping("/by/{employeeId}")
    public Optional<Employee> getEmployee(@PathVariable(name = "employeeId") Long employeeId){
        return employeeService.getEmployee(employeeId);
    }

    @DeleteMapping("/delete/{employeeId}")
    public void deleteEmployee(@PathVariable(name="employeeId") Long employeeId){
        employeeService.deleteEmployee(employeeId);
    }
}

package com.amber.rest.controller;


import com.amber.rest.exceptions.EmployeeNotFoundException;
import com.amber.rest.models.Employees;
import com.amber.rest.repos.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeesController {
    @Autowired
    EmployeesRepo employeesRepo;

    //GET ALL
    @GetMapping("/employees")
    public List<Employees> getAllEmployees(){
        return employeesRepo.findAll();
    }

    //GET ONE
    @GetMapping("/employees/{id}")
    public Employees getEmployeeById(@PathVariable(value="id") Long employeeId)
        throws EmployeeNotFoundException {
        return employeesRepo.findById(employeeId)
                .orElseThrow(()-> new EmployeeNotFoundException(employeeId));
    }

    //POST
    @PostMapping("/employees")
    public Employees createEmployee(@Valid @RequestBody Employees employees){
        return employeesRepo.save(employees);
    }

    // PUT
    @PostMapping("/employees/{id}")
    public Employees updateEmployee(@PathVariable(value="id") Long employeeId,
                            @Valid @RequestBody Employees employeesDetails )
                            throws EmployeeNotFoundException {
        Employees employees = employeesRepo.findById(employeeId)
                .orElseThrow(()-> new EmployeeNotFoundException(employeeId));

        employees.setEmployee_name(employeesDetails.getEmployee_name());
        employees.setDesignation(employeesDetails.getDesignation());

        Employees updatedEmployee = employeesRepo.save(employees);

        return updatedEmployee;
    }

    //DELETE
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<?>
    deleteEmployee(@PathVariable(value="id") Long employeeId)
        throws EmployeeNotFoundException {
        Employees employees = employeesRepo.findById(employeeId)
                .orElseThrow(()-> new EmployeeNotFoundException(employeeId));
        employeesRepo.delete(employees);
        return ResponseEntity.ok().build();
    }



}
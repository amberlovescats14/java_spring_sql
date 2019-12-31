package com.amber.rest.exceptions;

public class EmployeeNotFoundException extends Exception {
    private long employee_id;

    public EmployeeNotFoundException(long employee_id) {
        super(String.format("No employee with the id: '%s'", employee_id));
    }
}

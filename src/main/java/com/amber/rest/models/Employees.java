package com.amber.rest.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "hired")
public class Employees {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String employee_name;

    @NotBlank
    private String designation;

    public Employees() {
    }

    public Employees(
            Long id,
            String employee_name,
            String designation
    ) {
        this.id = id;
        this.employee_name = employee_name;
        this.designation = designation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
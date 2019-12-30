package com.amber.rest.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Employee {
    @Table(name = "employee_two")

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @Column(name="employee_name")
    private String employeeName;

    @Column(name="designation")
    private String designation;

    public Employee() {
    }


}

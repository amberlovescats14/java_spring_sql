package com.amber.rest.repos;

import com.amber.rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}


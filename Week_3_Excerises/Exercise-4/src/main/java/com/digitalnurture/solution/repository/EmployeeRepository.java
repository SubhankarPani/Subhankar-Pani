package com.digitalnurture.solution.repository;


import com.digitalnurture.solution.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query method to find employees by name
    List<Employee> findByName(String name);

    // Derived query method to find employees by department id
    List<Employee> findByDepartmentId(Long departmentId);

    // Derived query method to find employee by email
    Employee findByEmail(String email);
}

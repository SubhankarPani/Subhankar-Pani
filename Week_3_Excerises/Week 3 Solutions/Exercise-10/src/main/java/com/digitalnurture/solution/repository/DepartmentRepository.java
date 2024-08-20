package com.digitalnurture.solution.repository;


import com.digitalnurture.solution.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Derived query method to find departments by name
    Department findByName(String name);

    // Derived query method to find all departments with a specific name
    List<Department> findAllByName(String name);
}


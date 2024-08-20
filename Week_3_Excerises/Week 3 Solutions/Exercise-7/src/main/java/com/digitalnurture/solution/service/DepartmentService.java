package com.digitalnurture.solution.service;


import org.springframework.beans.factory.annotation.Autowired;
import com.digitalnurture.solution.entity.Department;
import com.digitalnurture.solution.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Create a new department
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Get all departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Get department by ID
    public Department getDepartmentById(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.orElse(null);
    }

    // Update department by ID
    public Department updateDepartment(Long id, Department department) {
        if (departmentRepository.existsById(id)) {
            department.setId(id);
            return departmentRepository.save(department);
        }
        return null;
    }

    // Delete department by ID
    public boolean deleteDepartment(Long id) {
        if (departmentRepository.existsById(id)) {
            departmentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

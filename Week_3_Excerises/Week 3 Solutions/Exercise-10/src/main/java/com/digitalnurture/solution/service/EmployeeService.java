package com.digitalnurture.solution.service;




import com.digitalnurture.solution.entity.Employee;
import com.digitalnurture.solution.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Create a new employee
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by ID
    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(Long.valueOf(id)).orElse(null);
    }

    // Update employee by ID
    public Employee updateEmployee(String id, Employee employee) {
        if (employeeRepository.existsById(Long.valueOf(id))) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        return null;
    }

    // Delete employee by ID
    public boolean deleteEmployee(String id) {
        if (employeeRepository.existsById(Long.valueOf(id))) {
            employeeRepository.deleteById(Long.valueOf(id));
            return true;
        }
        return false;
    }

    @Transactional
    public void batchInsertEmployees(List<Employee> employees) {
        final int batchSize = 30;
        for (int i = 0; i < employees.size(); i++) {
            employeeRepository.save(employees.get(i));
            if (i % batchSize == 0 && i > 0) {
                employeeRepository.flush();
                employeeRepository.clear();
            }
        }
    }


}

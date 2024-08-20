package com.digitalnurture.solution.repository;



import com.digitalnurture.solution.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Custom query methods using method names
    List<Employee> findByDepartmentName(String departmentName);
    List<Employee> findByName(String name);

    // Custom query methods using @Query annotation
    @Query("SELECT e FROM Employee e WHERE e.email LIKE %:domain")
    List<Employee> findByEmailDomain(@Param("domain") String domain);
    Page<Employee> findAll(Pageable pageable);

    void clear();
}

package com.digitalnurture.solution.repository;





import com.digitalnurture.solution.entity.Employee;
import com.digitalnurture.solution.projection.EmployeeView;
import com.digitalnurture.solution.projection.EmployeeView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e.id AS id, e.name AS name, e.email AS email FROM Employee e")
    List<EmployeeView> findAllEmployeeProjections();

    @Query("SELECT new com.yourname.employeemanagementsystem.projection.EmployeeView(e.id, e.name, e.email) FROM Employee e")
    List<EmployeeView> findAllEmployeeViews();
}


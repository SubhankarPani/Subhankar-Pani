package com.digitalnurture.solution.repository;




import com.digitalnurture.solution.entity.Department;
import com.digitalnurture.solution.projection.DepartmentProjection;
import com.digitalnurture.solution.projection.DepartmentView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("SELECT d.id AS id, d.name AS name FROM Department d")
    List<DepartmentProjection> findAllDepartmentProjections();

    @Query("SELECT new com.yourname.employeemanagementsystem.projection.DepartmentView(d.id, d.name) FROM Department d")
    List<DepartmentView> findAllDepartmentViews();
}



package com.digitalnurture.solution.projection;



import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {

    @Value("#{target.id} as id")
    Long getId();

    @Value("#{target.name} as name")
    String getName();

    @Value("#{target.email} as email")
    String getEmail();
}

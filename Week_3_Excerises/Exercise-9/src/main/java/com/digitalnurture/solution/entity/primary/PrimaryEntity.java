package com.digitalnurture.solution.entity.primary;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PrimaryEntity {
    @Id
    private Long id;
    private String name;

    // Getters and Setters
}

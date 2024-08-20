package com.digitalnurture.solution.entity.secondary;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SecondaryEntity {
    @Id
    private Long id;
    private String description;

    // Getters and Setters
}

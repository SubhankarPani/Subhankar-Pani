package com.digitalnurture.solution.entity;


import jakarta.persistence.*;



import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;



@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")

    private String id;

    private String name;
    private String email;

    public void setId(String id) {

    }

    // Getters and Setters
}


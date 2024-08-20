package com.digitalnurture.solution.entity;


import jakarta.persistence.*;


import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;



@Entity
@Table(name = "departments")
@SQLDelete(sql = "UPDATE departments SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class Department {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String name;
    private boolean deleted;


}


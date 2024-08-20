package com.digitalnurture.solution.projection;



public class DepartmentView {
    private Long id;
    private String name;

    public DepartmentView(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

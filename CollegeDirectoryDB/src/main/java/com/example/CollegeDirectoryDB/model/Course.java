package com.example.CollegeDirectoryDB.model;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name = "course")
public class Course {

    private Long id;

    private String department_id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() { return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }
}

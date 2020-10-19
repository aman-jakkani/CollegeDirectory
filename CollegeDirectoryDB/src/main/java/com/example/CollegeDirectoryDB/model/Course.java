package com.example.CollegeDirectoryDB.model;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name = "course")
public class Course {

    private Long id;

    private String dept;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() { return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

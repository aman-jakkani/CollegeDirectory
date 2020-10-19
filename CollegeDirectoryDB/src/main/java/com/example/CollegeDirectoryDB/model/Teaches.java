package com.example.CollegeDirectoryDB.model;

import javax.persistence.*;

@Entity
@Table(name = "teaches")
public class Teaches {

    private Long id;

    private Long course_id;

    private Long professor_id;


    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(Long prof_id) {
        this.professor_id = prof_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

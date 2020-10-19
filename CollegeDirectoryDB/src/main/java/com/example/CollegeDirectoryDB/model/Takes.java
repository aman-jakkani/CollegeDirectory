package com.example.CollegeDirectoryDB.model;

import javax.persistence.*;

@Entity
@Table(name = "takes")
public class Takes {

    private Long student_id;

    private Long course_id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }
}

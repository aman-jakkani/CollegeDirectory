package com.example.CollegeDirectoryDB.model;

import javax.persistence.*;

@Entity
@Table(name = "mentorships")
public class Mentorships {

    private Long student_id;

    private Long professor_id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getStudent_id() { return student_id;}

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(Long professor_id) {
        this.professor_id = professor_id;
    }
}

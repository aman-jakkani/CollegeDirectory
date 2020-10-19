package com.example.CollegeDirectoryDB.model;

import javax.persistence.*;

@Entity
@Table(name = "teaches")
public class Teaches {

    private Long course_id;

    private Long prof_id;

    private int capacity;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getProf_id() {
        return prof_id;
    }

    public void setProf_id(Long prof_id) {
        this.prof_id = prof_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

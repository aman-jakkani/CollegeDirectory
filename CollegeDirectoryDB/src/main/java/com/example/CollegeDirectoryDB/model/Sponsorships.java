package com.example.CollegeDirectoryDB.model;

import javax.persistence.*;

@Entity
@Table(name = "sponsorships")
public class Sponsorships {

    private Long id;

    private Long sponsor_id;

    private String department_id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public Long getSponsor_id() {
        return sponsor_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public void setSponsor_id(Long sponsor_id) {
        this.sponsor_id = sponsor_id;
    }
}

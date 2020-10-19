package com.example.CollegeDirectoryDB.model;

import javax.persistence.*;

@Entity
@Table(name = "sponsor")
public class Sponsor {

    private Long id;

    private String name;

    private String level;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() { return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }
}

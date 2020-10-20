package com.example.CollegeDirectoryDB.model;

import java.util.List;

public class Mentor {

    private String name;

    private List<String> mentees;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMentees() {
        return mentees;
    }

    public void setMentees(List<String> mentees) {
        this.mentees = mentees;
    }
}

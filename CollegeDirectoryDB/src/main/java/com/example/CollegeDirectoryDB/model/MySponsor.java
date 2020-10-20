package com.example.CollegeDirectoryDB.model;

import java.util.List;

public class MySponsor {

    private String myName;

    private List<String> mySponsors;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public List<String> getMySponsors() {
        return mySponsors;
    }

    public void setMySponsors(List<String> mySponsors) {
        this.mySponsors = mySponsors;
    }
}

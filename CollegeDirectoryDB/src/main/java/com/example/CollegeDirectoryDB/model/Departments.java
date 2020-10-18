package com.example.CollegeDirectoryDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Departments {

    private String name;

    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

}
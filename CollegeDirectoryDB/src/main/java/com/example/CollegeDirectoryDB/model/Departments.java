package com.example.CollegeDirectoryDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
public class Departments {

    private String id;

    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getId(){
        return id;
    }
    public void setId(String name) {
        this.id = name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

}
package com.example.CollegeDirectoryDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {

    private Long id;

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getID(){
        return id;
    }

    public void setID(Long newID){
        this.id = newID;
    }

}

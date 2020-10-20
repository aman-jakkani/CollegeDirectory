package com.example.CollegeDirectoryDB.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "student")
public class Student {

    private Long id;

    private String name;

    private String email;


    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId(){
        return id;
    }

    public void setId(Long newID){
        this.id = newID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

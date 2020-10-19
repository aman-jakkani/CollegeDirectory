package com.example.CollegeDirectoryDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "student")
public class Student {

    private Long id;

    private String name;

    private String email;

    private Date date;

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

    public Date getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

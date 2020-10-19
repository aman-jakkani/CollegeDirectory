package com.example.CollegeDirectoryDB.controller;

import com.example.CollegeDirectoryDB.service.TakesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TakesController {

    @Autowired
    private TakesService service;

    @RequestMapping(value = "/{course_id}")
    public String getAvgGrade(@PathVariable Long course_id){
        Float avg = service.getAverageGrade(course_id);
        System.out.println(avg);
        return "index";
    }
}

package com.example.CollegeDirectoryDB.controller;

import com.example.CollegeDirectoryDB.model.MySponsor;
import com.example.CollegeDirectoryDB.model.Student;
import com.example.CollegeDirectoryDB.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/all")
    public String viewAllPage(Model model) {
        List<Student> listStudents = studentService.listAll();
        model.addAttribute("listStudents", listStudents);
        return "all";
    }

    @RequestMapping("/sponsors/{student_id}")
    public String viewSponsors(@PathVariable Long student_id, Model model){
        List<String> sponsors = studentService.listSponsors(student_id);
        MySponsor m = new MySponsor();
        m.setMyName(studentService.getName(student_id));
        m.setMySponsors(sponsors);
        model.addAttribute("listSponsors", m);
        return "sponsors";
    }

    @RequestMapping("/gpa/{student_id}")
    public String viewGpa(@PathVariable Long student_id, Model model){
        Float gpa = studentService.getGpa(student_id);
        gpa = (gpa / 20) - 1;
        model.addAttribute("gpa", gpa);
        return "gpa";
    }

    @RequestMapping("/busy/{student_id}")
    public String viewBusy(@PathVariable Long student_id, Model model){
        int courses = studentService.getSchedule(student_id);
        //System.out.println(courses);
        model.addAttribute("busyness", courses);
        return "busy";
    }
}

package com.example.CollegeDirectoryDB.controller;

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
}

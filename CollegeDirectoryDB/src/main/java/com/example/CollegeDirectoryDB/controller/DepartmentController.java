package com.example.CollegeDirectoryDB.controller;

import com.example.CollegeDirectoryDB.model.Departments;
import com.example.CollegeDirectoryDB.model.Student;
import com.example.CollegeDirectoryDB.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/dept")
    public String viewDeptPage(Model model) {
        List<Departments> listDepts = departmentService.listAll();
        model.addAttribute("listDepts", listDepts);
        return "dept";
    }
}

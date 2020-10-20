package com.example.CollegeDirectoryDB.controller;

import com.example.CollegeDirectoryDB.model.Departments;
import com.example.CollegeDirectoryDB.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DepartmentsController {

    @Autowired
    private DepartmentsService departmentsService;

    @RequestMapping("/dept")
    public String viewDeptPage(Model model) {
        List<Departments> listDepts = departmentsService.listAll();
        model.addAttribute("listDept", listDepts);
        return "dept";
    }


}

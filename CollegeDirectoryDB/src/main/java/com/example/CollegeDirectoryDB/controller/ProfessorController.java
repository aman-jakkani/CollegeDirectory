package com.example.CollegeDirectoryDB.controller;

import com.example.CollegeDirectoryDB.model.Professor;
import com.example.CollegeDirectoryDB.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @RequestMapping("/profs")
    public String viewProfsPage(Model model){
        List<Professor> professors = service.listAll();
        model.addAttribute("listProfs", professors);
        return "profs";
    }
}

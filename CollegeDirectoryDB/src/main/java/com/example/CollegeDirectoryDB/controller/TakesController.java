package com.example.CollegeDirectoryDB.controller;

import com.example.CollegeDirectoryDB.model.ProfessorAvg;
import com.example.CollegeDirectoryDB.service.ProfessorService;
import com.example.CollegeDirectoryDB.service.TakesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TakesController {

    @Autowired
    private TakesService service;

    @Autowired
    private ProfessorService professorService;

    @RequestMapping(value = "/toughOrNot/{professor_id}")
    public String getAvgGrade(@PathVariable Long professor_id, Model model){
        Float avg = service.getAverageGrade(professor_id);
        ProfessorAvg p = new ProfessorAvg();
        p.setAvg(avg);
        System.out.println(avg);
        model.addAttribute("avgGrade", p);
        return "toughOrNot";
    }
}

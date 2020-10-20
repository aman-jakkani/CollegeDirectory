package com.example.CollegeDirectoryDB.controller;

import com.example.CollegeDirectoryDB.model.Mentor;
import com.example.CollegeDirectoryDB.model.Professor;
import com.example.CollegeDirectoryDB.model.Student;
import com.example.CollegeDirectoryDB.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/mentees/{professor_id}")
    public String viewMenteesPage(@PathVariable Long professor_id, Model model){
        String profName = service.get(professor_id);
        List<String> mentees = service.getMentees(professor_id);
        Mentor m = new Mentor();
        m.setName(profName);
        m.setMentees(mentees);
        model.addAttribute("listMentees", m);
        return "mentees";
    }

    @RequestMapping("/plats/{professor_id}")
    public String viewPlatinums(@PathVariable Long professor_id, Model model){
        List<String> plats = service.getPlats(professor_id);
        model.addAttribute("platinum", plats);
        return "plats";
    }
}

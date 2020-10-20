package com.example.CollegeDirectoryDB.service;

import com.example.CollegeDirectoryDB.model.Professor;
import com.example.CollegeDirectoryDB.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repo;

    public List<Professor> listAll(){
        return repo.findAll();
    }

    public String get(Long professor_id) { return repo.getName(professor_id);}

    public List<String> getMentees(Long professor_id) { return repo.getMentees(professor_id);}

}

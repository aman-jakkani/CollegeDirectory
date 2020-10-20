package com.example.CollegeDirectoryDB.service;

import com.example.CollegeDirectoryDB.repository.ProfessorRepository;
import com.example.CollegeDirectoryDB.repository.TakesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TakesService {


    @Autowired
    private TakesRepository takesRepository;

    public Float getAverageGrade(Long professor_id){
        return takesRepository.getAverageGrade(professor_id);
    }
}

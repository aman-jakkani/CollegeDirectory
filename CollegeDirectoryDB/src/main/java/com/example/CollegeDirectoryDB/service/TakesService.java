package com.example.CollegeDirectoryDB.service;

import com.example.CollegeDirectoryDB.repository.TakesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TakesService {

    @Autowired
    private TakesRepository repo;

    public Float getAverageGrade(Long course_id){
        return repo.getAverageGrade(course_id);
    }
}

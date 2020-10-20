package com.example.CollegeDirectoryDB.service;

import com.example.CollegeDirectoryDB.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepository repo;

}

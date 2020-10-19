package com.example.CollegeDirectoryDB.service;


import com.example.CollegeDirectoryDB.model.Departments;
import com.example.CollegeDirectoryDB.repository.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DepartmentsService {

    @Autowired
    private DepartmentsRepository repo;

    public List<Departments> listAll(){
        return repo.findAll();
    }

}

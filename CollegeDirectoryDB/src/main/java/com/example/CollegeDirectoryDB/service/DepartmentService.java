package com.example.CollegeDirectoryDB.service;


import com.example.CollegeDirectoryDB.model.Departments;
import com.example.CollegeDirectoryDB.model.Student;
import com.example.CollegeDirectoryDB.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DepartmentService {

    @Autowired
    private DepartmentRepository repo;

    public List<Departments> listAll(){
        return repo.findAll();
    }

    public void save(Departments dept) {
        repo.save(dept);
    }

    public Departments get(String name) {
        return repo.findById(name).get();
    }

    public void delete(String name) {
        repo.deleteById(name);
    }
}

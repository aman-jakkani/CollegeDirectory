package com.example.CollegeDirectoryDB.service;

import com.example.CollegeDirectoryDB.model.Student;
import com.example.CollegeDirectoryDB.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> listAll(){
        return repo.findAll();
    }
    public void save(Student student) {
        repo.save(student);
    }

    public Student get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}

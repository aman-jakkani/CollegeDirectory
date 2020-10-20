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

    public List<String> listSponsors(Long student_id){
        return repo.findSponsors(student_id);
    }
    public void save(Student student) {
        repo.save(student);
    }

    public Float getGpa(Long student_id){ return repo.getGpa(student_id);}

    public String getName(long id) {
        return repo.getName(id);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}

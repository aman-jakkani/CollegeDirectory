package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

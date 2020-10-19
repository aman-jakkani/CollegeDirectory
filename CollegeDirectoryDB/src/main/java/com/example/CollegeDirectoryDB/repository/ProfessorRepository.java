package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}

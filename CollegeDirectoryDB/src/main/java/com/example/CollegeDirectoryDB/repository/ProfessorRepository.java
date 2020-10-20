package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    @Query("select p.name from Professor p where p.id=?1")
    String getName(Long professor_id);
}

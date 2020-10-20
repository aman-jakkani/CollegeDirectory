package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Professor;
import com.example.CollegeDirectoryDB.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    @Query("select p.name from Professor p where p.id=?1")
    String getName(Long professor_id);
    @Query("select s.name from Mentorships m join Student s on m.student_id = s.id where m.professor_id = ?1")
    List<String> getMentees(Long professor_id);
}

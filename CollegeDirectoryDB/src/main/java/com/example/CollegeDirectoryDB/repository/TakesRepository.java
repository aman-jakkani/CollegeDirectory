package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Takes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TakesRepository extends JpaRepository<Takes, Long> {
    @Query("select avg(t.grade) FROM Takes t JOIN Teaches x on t.course_id = x.course_id WHERE x.professor_id = ?1")
    Float getAverageGrade(Long professor_id);
}

package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Takes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TakesRepository extends JpaRepository<Takes, Long> {

    @Query("select avg(t.grade) FROM Takes t WHERE t.course_id = ?1")
    Float getAverageGrade(Long course_id);
}

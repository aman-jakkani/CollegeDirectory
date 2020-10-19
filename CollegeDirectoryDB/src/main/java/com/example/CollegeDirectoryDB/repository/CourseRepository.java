package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

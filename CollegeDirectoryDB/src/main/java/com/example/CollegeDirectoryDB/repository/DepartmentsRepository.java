package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Departments, String> {

}
package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentsRepository extends JpaRepository<Departments, String> {

}

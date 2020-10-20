package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentsRepository extends JpaRepository<Departments, String> {

    @Query("select count(t) from Teaches t where t.professor_id = (select p.id from Professor p where p.department_id=?1)")
    int getCourseCount(String department_id);
}

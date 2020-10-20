package com.example.CollegeDirectoryDB.repository;

import com.example.CollegeDirectoryDB.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select s.name from Sponsor s join Sponsorships x on s.id = x.sponsor_id where x.department_id = (select p.department_id from Professor p where p.id = (select m.professor_id from Mentorships m where m.student_id = ?1))")
    List<String> findSponsors(Long student_id);

    @Query("select s.name from Student s where s.id = ?1")
    String getName(Long student_id);

    @Query("select avg(t.grade) from Takes t where t.student_id=?1")
    Float getGpa(Long student_id);
}

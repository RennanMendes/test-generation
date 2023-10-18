package org.generation.generationstudents.domain.repository;

import org.generation.generationstudents.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findByNameContainingIgnoreCase(String name);
    List<Student> findByTeachersNameContainingIgnoreCase(String name);
    List<Student> findByClassroomNumberContainingIgnoreCase(String number);
    List<Student> findByFirstSemesterGreaterThan(double grade);
}

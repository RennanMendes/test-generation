package org.generation.generationstudents.domain.service;

import org.generation.generationstudents.domain.dto.UpdateDto;
import org.generation.generationstudents.domain.dto.StudentRequestDto;
import org.generation.generationstudents.domain.exception.UserNotFoundException;
import org.generation.generationstudents.domain.model.Student;
import org.generation.generationstudents.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student findStudentById(Long id) {
        return this.findById(id);
    }

    public List<Student> findAllByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

    public List<Student> findByTeacher(String name) {
        return repository.findByTeachersNameContainingIgnoreCase(name);
    }

    public List<Student> findByClassroom(String number) {
        return repository.findByClassroomNumberContainingIgnoreCase(number);
    }

    public List<Student> findByFirstSemesterGreaterThan(double grade) {
        return repository.findByFirstSemesterGreaterThan(grade);
    }

    public Student create(StudentRequestDto studentDto) {
        return repository.save(new Student(studentDto));
    }

    @Transactional
    public Student update(Long id, UpdateDto updateDto) {
        Student student = findById(id);
        student.update(updateDto);
        return student;
    }

    public void delete(Long id){
        Student student = findById(id);
        repository.delete(student);
    }

    private Student findById(Long id) {
        return repository.findById(id).orElseThrow(UserNotFoundException::new);
    }

}

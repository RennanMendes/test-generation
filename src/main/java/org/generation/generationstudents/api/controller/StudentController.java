package org.generation.generationstudents.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.generation.generationstudents.domain.dto.UpdateDto;
import org.generation.generationstudents.domain.dto.StudentRequestDto;
import org.generation.generationstudents.domain.model.Student;
import org.generation.generationstudents.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    @Operation(summary = "Lista todos os alunos")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success!")})
    public ResponseEntity<List<Student>> findAll() {
        List<Student> students = studentService.findAll();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca aluno por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success!"),
            @ApiResponse(responseCode = "404", description = "Not Found!")})
    public ResponseEntity<Student> findById(@PathVariable Long id) {
        Student student = studentService.findStudentById(id);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/name/{name}")
    @Operation(summary = "Busca alunos por nome")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success!")})
    public ResponseEntity<List<Student>> findByName(@PathVariable String name) {
        List<Student> students = studentService.findAllByName(name);
        return ResponseEntity.ok(students);
    }

    @GetMapping("/teacher/{name}")
    @Operation(summary = "Busca alunos por professor")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success!")})
    public ResponseEntity<List<Student>> findByTeacher(@PathVariable String name) {
        List<Student> students = studentService.findByTeacher(name);
        return ResponseEntity.ok(students);
    }

    @GetMapping("/classroom/{number}")
    @Operation(summary = "Busca alunos por número da sala")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success!")})
    public ResponseEntity<List<Student>> findByClassroom(@PathVariable String number) {
        List<Student> students = studentService.findByClassroom(number);
        return ResponseEntity.ok(students);
    }

    @GetMapping("/FirstSemesterGrade/{grade}")
    @Operation(summary = "Busca por nota do primeiro semestre maior que")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success!")})
    public ResponseEntity<List<Student>> findByFirstSemesterGrade(@PathVariable double grade) {
        List<Student> students = studentService.findByFirstSemesterGreaterThan(grade);
        return ResponseEntity.ok(students);
    }

    @PostMapping
    @Operation(summary = "Registra um novo aluno")
    @ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Created!")})
    public ResponseEntity<Student> create(@RequestBody @Valid StudentRequestDto requestDto, UriComponentsBuilder uriBuilder) {
        Student response = studentService.create(requestDto);
        URI uri = uriBuilder.path("/students/{id}").buildAndExpand(response.getId()).toUri();
        return ResponseEntity.created(uri).body(response);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza aluno por id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success!"),
            @ApiResponse(responseCode = "404", description = "Not Found!")})
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody UpdateDto updateDto) {
        Student student = studentService.update(id, updateDto);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Apaga registro de aluno por id")
    @ApiResponses(value = {@ApiResponse(responseCode = "204", description = "No Content!")})
    public ResponseEntity delete(@PathVariable Long id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }

}

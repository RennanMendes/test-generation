package org.generation.generationstudents.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.generation.generationstudents.domain.dto.StudentRequestDto;
import org.generation.generationstudents.domain.dto.UpdateDto;

@Entity
@Table(name = "tb_student")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private float firstSemester;
    private float secondSemester;
    private String teachersName;
    private String classroomNumber;

    public Student(StudentRequestDto studentDto) {
        this.name = studentDto.name();
        this.age = studentDto.age();
        this.firstSemester = studentDto.firstSemester();
        this.secondSemester = studentDto.secondSemester();
        this.teachersName = studentDto.teachersName();
        this.classroomNumber = studentDto.classroomNumber();
    }

    public void update(UpdateDto updateDto) {
        this.name = updateDto.name() == null ? this.name : updateDto.name();
        this.age = updateDto.age() == 0.0f ? this.age : updateDto.age();
        this.firstSemester = updateDto.firstSemester() == 0.0f ? this.firstSemester : updateDto.firstSemester();
        this.secondSemester = updateDto.secondSemester() == 0.0f ? this.secondSemester : updateDto.secondSemester();
        this.teachersName = updateDto.teachersName() == null ? this.teachersName : updateDto.teachersName();
        this.classroomNumber = updateDto.classroomNumber() == null ? this.classroomNumber : updateDto.classroomNumber();
    }
}



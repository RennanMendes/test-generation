package org.generation.generationstudents.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record StudentRequestDto(
        
        @NotBlank
        String name,
        
        @NotNull
        int age,
        
        float firstSemester,
        float secondSemester,
        String teachersName,
        String classroomNumber) {
}



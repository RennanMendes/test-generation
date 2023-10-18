package org.generation.generationstudents.domain.dto;

public record UpdateDto(
        String name,
        int age,
        float firstSemester,
        float secondSemester,
        String teachersName,
        String classroomNumber
) {
}

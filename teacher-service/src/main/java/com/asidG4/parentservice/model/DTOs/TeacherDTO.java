package com.asidG4.parentservice.model.DTOs;

import com.asidG4.parentservice.model.DTOs.base.PersonEntityDTO;

import jakarta.validation.constraints.NotNull;

public class TeacherDTO extends PersonEntityDTO {

    @NotNull
    private SubjectDTO subject;

    public SubjectDTO getSubject() {
        return subject;
    }

    public void setSubject(SubjectDTO subject) {
        this.subject = subject;
    }
}

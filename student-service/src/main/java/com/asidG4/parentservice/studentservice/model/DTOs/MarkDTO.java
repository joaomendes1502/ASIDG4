package com.asidG4.parentservice.studentservice.model.DTOs;

import com.asidG4.parentservice.studentservice.model.entity.enums.MarkEnum;

import jakarta.validation.constraints.NotNull;

public class MarkDTO {

    @NotNull
    private MarkEnum mark;

    public MarkEnum getMark() {
        return mark;
    }

    public void setMark(MarkEnum mark) {
        this.mark = mark;
    }
}

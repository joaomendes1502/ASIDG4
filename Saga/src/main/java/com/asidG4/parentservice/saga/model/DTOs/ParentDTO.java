package com.asidG4.parentservice.saga.model.DTOs;

import com.asidG4.parentservice.saga.model.DTOs.base.PersonEntityDTO;

import jakarta.validation.constraints.NotBlank;

public class ParentDTO extends PersonEntityDTO {

    @NotBlank
    //@PhoneNumber
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

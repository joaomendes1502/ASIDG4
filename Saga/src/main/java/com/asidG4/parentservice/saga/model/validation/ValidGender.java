package com.asidG4.parentservice.saga.model.validation;

import com.asidG4.parentservice.saga.model.DTOs.base.GenderEnum;
import jakarta.validation.*;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Constraint(validatedBy = ValidGenderValidator.class)
public @interface ValidGender {
    GenderEnum[] anyOf();

    String message() default "Invalid Gender";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

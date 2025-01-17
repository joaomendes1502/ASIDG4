package com.asidG4.parentservice.studentservice.model.validation;

import jakarta.validation.*;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ValidEGNValidator.class)
public @interface ValidEGN {

    String message() default "Invalid EGN";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

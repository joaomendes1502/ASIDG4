package com.asidG4.parentservice.model.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = UniqueClubNameValidator.class)
public @interface UniqueClubName {

    String message() default "This club name has been already used!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

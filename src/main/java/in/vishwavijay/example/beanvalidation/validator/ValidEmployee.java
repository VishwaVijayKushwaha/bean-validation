package in.vishwavijay.example.beanvalidation.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidEmployeeValidator.class)
public @interface ValidEmployee {
	String message() default "Invalid Employee Data";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}


package com.souche.Annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liuqizhe on 15/9/22.
 */

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneValidator.class)
public @interface Phone {
    //定义message属性，默认值为""
    String message() default "" ;
    Class<?>[] groups() default {} ;
    Class<? extends Payload>[] payload() default {} ;
}

package com.clg.config.annotation;

import java.lang.annotation.*;

/**
 * @Author cailiugen
 * @Date 2019/11/22
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface MethodAnnotation {

    String name();
    int age() default 18;
    int[] score();
}

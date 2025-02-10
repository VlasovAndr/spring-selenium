package com.udemy.spring.spring_selenium.autoframework.annotation;

import java.lang.annotation.*;

@Page
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TakeScreenshot {
}

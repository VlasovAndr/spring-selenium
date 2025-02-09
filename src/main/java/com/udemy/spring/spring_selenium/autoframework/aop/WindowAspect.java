package com.udemy.spring.spring_selenium.autoframework.aop;

import com.udemy.spring.spring_selenium.autoframework.annotation.Window;
import com.udemy.spring.spring_selenium.autoframework.service.WindowsSwitchService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WindowAspect {
    @Autowired
    private ApplicationContext ctx;

    @Autowired
    private WindowsSwitchService switchService;

    @Before("@target(window) && within(com.udemy.spring.spring_selenium.autoframework..*)")
    public void before(Window window) {
        this.switchService.switchByTitle(window.value());
    }

    @After("@target(window) && within(com.udemy.spring.spring_selenium.autoframework..*)")
    public void after(Window window) {
        this.switchService.switchByIndex(0);
    }
}

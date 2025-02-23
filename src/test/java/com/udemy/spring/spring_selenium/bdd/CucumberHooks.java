package com.udemy.spring.spring_selenium.bdd;

import com.udemy.spring.spring_selenium.autoframework.annotation.LazyAutowired;
import com.udemy.spring.spring_selenium.autoframework.service.ScreenShotService;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.context.ApplicationContext;

public class CucumberHooks {

    @LazyAutowired
    private ScreenShotService screenShotService;

    @LazyAutowired
    protected ApplicationContext ctx;

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(this.screenShotService.getScreenShot(), "image/png", scenario.getName());
        }
    }

    @After
    public void afterScenario() {
        this.ctx.getBean(WebDriver.class).quit();
    }
}

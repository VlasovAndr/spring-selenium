package com.udemy.spring.spring_selenium.bdd;

import com.udemy.spring.spring_selenium.autoframework.service.ScreenShotService;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.springframework.beans.factory.annotation.Autowired;

public class CucumberHooks {

    @Autowired
    private ScreenShotService screenShotService;

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(screenShotService.getScreenShot(), "image/png", scenario.getName());
        }
    }
}

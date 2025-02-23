package com.udemy.spring.spring_selenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        strict = true,
        features = "classpath:features",
        glue = "com.udemy.spring.spring_selenium.bdd",
        tags = {"@smoke"},
        plugin = {
                "pretty",
                "html:D:\\JavaProjects\\Output"
        }
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

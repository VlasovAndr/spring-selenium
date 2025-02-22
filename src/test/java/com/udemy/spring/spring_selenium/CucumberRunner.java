package com.udemy.spring.spring_selenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.udemy.spring.spring_selenium.bdd",
        plugin = {
                "pretty",
                "html:D:\\JavaProjects\\Output"
        }

)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}

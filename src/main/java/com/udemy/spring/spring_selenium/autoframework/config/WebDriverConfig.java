package com.udemy.spring.spring_selenium.autoframework.config;

import com.udemy.spring.spring_selenium.autoframework.annotation.LazyConfiguration;
import com.udemy.spring.spring_selenium.autoframework.annotation.ThreadScopeBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;

@LazyConfiguration
@Profile("!remote")
public class WebDriverConfig {

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefoxDriver() {
        return new FirefoxDriver();
    }

    @ThreadScopeBean
    @ConditionalOnMissingBean()
    public WebDriver chromeDriver() {
        return new ChromeDriver();
    }

}

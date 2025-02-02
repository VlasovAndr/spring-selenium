package com.udemy.spring.spring_selenium.autoframework.config;

import com.github.javafaker.Faker;
import com.udemy.spring.spring_selenium.autoframework.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class FakerConfig {

    @Bean
    public Faker getFaker() {
        return new Faker();
    }

}

package com.udemy.spring.spring_selenium.flights;

import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = "app.locale=ru")
public class FlightRuTest extends FlightTest {
}

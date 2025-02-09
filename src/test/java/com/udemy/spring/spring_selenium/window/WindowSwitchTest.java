package com.udemy.spring.spring_selenium.window;

import com.udemy.spring.spring_selenium.SpringBaseTestNGTest;
import com.udemy.spring.spring_selenium.autoframework.service.WindowsSwitchService;
import com.udemy.spring.spring_selenium.page.window.MainPage;
import com.udemy.spring.spring_selenium.page.window.PageA;
import com.udemy.spring.spring_selenium.page.window.PageB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@TestPropertySource(properties = "browser=firefox")
public class WindowSwitchTest extends SpringBaseTestNGTest {

    @Autowired
    private MainPage mainPage;

    @Autowired
    private PageA pageA;

    @Autowired
    private PageB pageB;

    @Autowired
    private WindowsSwitchService windowsSwitchService;

    @BeforeClass
    public void setup() {
        this.mainPage.goTo();
        this.mainPage.isAt();
        this.mainPage.launchAllWindows();
    }

    @Test
    public void switchWindowTest() {
        windowsSwitchService.switchByTitle("Page A");
        this.pageA.addToArea("Hi page A");

        windowsSwitchService.switchByIndex(2);
        this.pageB.addToArea("Hi page B");
    }

}

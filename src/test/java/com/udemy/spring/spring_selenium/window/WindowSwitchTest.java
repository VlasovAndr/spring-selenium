package com.udemy.spring.spring_selenium.window;

import com.udemy.spring.spring_selenium.SpringBaseTestNGTest;
import com.udemy.spring.spring_selenium.page.window.MainPage;
import com.udemy.spring.spring_selenium.page.window.PageA;
import com.udemy.spring.spring_selenium.page.window.PageB;
import com.udemy.spring.spring_selenium.page.window.PageC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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
    private PageC pageC;

    @BeforeClass
    public void setup() {
        this.mainPage.goTo();
        this.mainPage.isAt();
        this.mainPage.launchAllWindows();
    }

    @Test
    public void switchWindowTest() {
        this.pageA.addToArea("Hi page A");
        this.pageB.addToArea("Hi page B");
        this.pageC.addToArea("Hi page C");
    }

    @Test(dataProvider = "getData")
    public void switchWindowTest2(int index) {
        this.pageA.addToArea(index + "\n");
        this.pageB.addToArea((index) * 2 + "\n");
        this.pageC.addToArea((index) * 3 + "\n");
    }

    @DataProvider
    public Object[] getData() {
        return new Object[]{
                3,
                4,
                1,
                5,
                6,
                2
        };
    }

}

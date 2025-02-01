package com.udemy.spring.spring_selenium.googletest;

import com.udemy.spring.spring_selenium.SpringBaseTestNGTest;
import com.udemy.spring.spring_selenium.page.google.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Test
    public void googleTest() {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

//        this.googlePage.getSearchComponent().search("spring boot");
//        Assert.assertTrue(this.googlePage.getSearchResultComponent().isAt());
//        Assert.assertTrue(this.googlePage.getSearchResultComponent().getCount() > 2);
    }
}

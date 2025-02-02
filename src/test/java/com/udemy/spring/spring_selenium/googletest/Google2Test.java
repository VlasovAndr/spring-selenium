package com.udemy.spring.spring_selenium.googletest;

import com.udemy.spring.spring_selenium.SpringBaseTestNGTest;
import com.udemy.spring.spring_selenium.autoframework.annotation.LazyAutowired;
import com.udemy.spring.spring_selenium.page.google.GooglePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google2Test extends SpringBaseTestNGTest {

    @LazyAutowired
    private GooglePage googlePage;

    @Test
    public void googleTest() {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.close();

//        this.googlePage.getSearchComponent().search("spring boot");
//        Assert.assertTrue(this.googlePage.getSearchResultComponent().isAt());
//        Assert.assertTrue(this.googlePage.getSearchResultComponent().getCount() > 2);
    }
}

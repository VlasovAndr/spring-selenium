package com.udemy.spring.spring_selenium.visa;

import com.udemy.spring.spring_selenium.SpringBaseTestNGTest;
import com.udemy.spring.spring_selenium.entity.Customer;
import com.udemy.spring.spring_selenium.page.visa.VisaRegistrationPage;
import com.udemy.spring.spring_selenium.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserVisaTest extends SpringBaseTestNGTest {

    private static final Logger logger = LoggerFactory.getLogger(UserVisaTest.class);

    @Autowired
    private UserRepository repository;

    @Autowired
    private VisaRegistrationPage registrationPage;

    @Test(dataProvider = "getData")
    public void visaTest(Customer u) {
        this.registrationPage.goTo();
        this.registrationPage.setNames(u.getFirstName(), u.getLastName());
        this.registrationPage.setCountryFromAndTo(u.getFromCountry(), u.getToCountry());
        this.registrationPage.setBirthDate(u.getDob().toLocalDate());
        this.registrationPage.setContactDetails(u.getEmail(), u.getPhone());
        this.registrationPage.setComments(u.getComments());
        this.registrationPage.submit();

        logger.info("Request confirmation : " + this.registrationPage.getConfirmationNumber());
    }

    @DataProvider
    public Object[] getData() {
        return this.repository.findAll()
                .stream()
                .limit(3)
                .toArray();
    }

}

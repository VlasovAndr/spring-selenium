package com.udemy.spring.spring_selenium.page.window;

import com.udemy.spring.spring_selenium.autoframework.annotation.Window;
import com.udemy.spring.spring_selenium.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Window("Page C")
public class PageC extends Base {

    @FindBy(id = "area")
    private WebElement textArea;


    public void addToArea(final String message) {
        this.textArea.sendKeys(message);
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> !this.textArea.isDisplayed());
    }
}

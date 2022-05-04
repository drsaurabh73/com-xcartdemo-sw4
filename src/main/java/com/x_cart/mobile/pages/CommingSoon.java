package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CommingSoon extends Utility {

    By CommingsoonLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Coming soon')]");
    By actualMessage = By.xpath("//h1[@class='title']");

    public void clickOnCommingSoon() {
        clickOnElement(CommingsoonLink);
    }
    public String verifyTextCommingSoon() {
        return getTextFromElement(actualMessage);
    }
}

package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewPage extends Utility {
    By newLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'New!')]");
    By actualMessage = By.xpath("//h1[@id='page-title']");

    public void clickNew () {
        clickOnElement(newLink);
    }
    public String verifyTextNew() {
        return getTextFromElement(actualMessage);
    }
}

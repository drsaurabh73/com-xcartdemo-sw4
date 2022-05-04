package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUs extends Utility {

    By contactus = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Contact us')]");
    By actualMessage = By.xpath("//h1[@id='page-title']");

    public void clickOnContactUs(){
        clickOnElement(contactus);
    }
    public String verifyContactUs() {
        return getTextFromElement(actualMessage);
    }
}

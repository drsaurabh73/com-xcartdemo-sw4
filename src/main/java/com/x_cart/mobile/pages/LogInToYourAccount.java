package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class LogInToYourAccount extends Utility {

    By actualMessage = By.xpath("//h3[text()='Log in to your account']");
    By emailad = By.xpath("//input[@name='email']");
    By continueButton = By.xpath("//button[@class='btn  regular-button anonymous-continue-button submit']");
    By acutalMessage1 = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]");

    public String verifyLoginToYourAccount() {
        return getTextFromElement(actualMessage);
    }
    public void emailaddress(String text) {
        sendTextToElement(emailad,text);
    }
    public void getContinueButton() {
        clickOnElement(continueButton);
    }
    public String verifySecureCheckout() {
        return getTextFromElement(acutalMessage1);
    }
}

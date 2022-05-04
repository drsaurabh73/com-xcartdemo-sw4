package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SecureCheckOut extends Utility {
    By actualMessageSecure = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]");
    By firstname = By.xpath("//input[@name='shippingAddress[firstname]']");
    By lastname = By.xpath("//input[@name='shippingAddress[lastname]']");
    By streetname = By.xpath("//input[@name='shippingAddress[street]']");
    By cityname = By.xpath("//input[@name='shippingAddress[city]']");
    By state = By.xpath("//input[@name='shippingAddress[custom_state]']");
    By zipcode = By.xpath("//input[@name='shippingAddress[zipcode]']");

    By email = By.xpath("//input[@name='email']");
    By creataccount = By.xpath("//input[@id='create_profile']");
    By password = By.xpath("//input[@name='password']");
    By localShipping = By.xpath("//input[@value='128']");
    By paymentMethod = By.xpath("//input[@value='6']");
    By actualMessage9_1 = By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-prefix']");
    By actualMessage9_2 = By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-integer']");
    By actualMessage9_3 = By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-decimalDelimiter']");
    By actualMessage9_4 = By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-decimal']");
    By placeyourorder = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]");
    By actualMessage15 = By.xpath("//h1[text()='Thank you for your order']");

public void mouseHoverLocalShipping() { mouseHoverToElement(localShipping);}
    public void mouseHoverPaymentMethod() { mouseHoverToElement(paymentMethod);}
    public String verifySecureCheckout() {
        return getTextFromElement(actualMessageSecure);
    }

    public String verifyThankYouForYourOrder() {
        return getTextFromElement(actualMessage15);
    }


    public void enterPlaceOrder() {
        clickOnElement(placeyourorder);
    }
    public void enterPassword(String text) {
        sendTextToElement(password,text);
    }

    public void getLocalShipping() {
        clickOnElement(localShipping);
    }
    public void getPaymentMethod() {
        clickOnElement(paymentMethod);
    }
    public String acutalMessage10() {
        return getTextFromElement(actualMessage9_1);
    }
    public String acutalMessage11() {
        return getTextFromElement(actualMessage9_2);
    }
    public String acutalMessage12() {
        return getTextFromElement(actualMessage9_3);
    }
    public String acutalMessage13() {
        return getTextFromElement(actualMessage9_4);
    }

    public void enterYourFirstName(String text) {
        sendTextToElement(firstname, text);
    }

    public void enterYourLastName(String text) {
        sendTextToElement(lastname, text);
    }

    public void enterStreetName(String text) {
        sendTextToElement(streetname, text);
    }

    public void enterCityName(String text) {
        sendTextToElement(cityname, text);
    }

    public void enterStateName(String text) {
        sendTextToElement(state, text);
    }

    public void enterZipcode(String text) {
        sendTextToElement(zipcode, text);
    }

    public void clearEmail() {
        sendTextToElement(email );
    }
    public void enterEmail(String text) {
        sendTextToElement(email, text);
    }

    public void getCreateAccount() {
        clickOnElement(creataccount);
    }


}

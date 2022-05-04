package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {

    By shoppingLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Shipping')]");
    By actualMessage = By.xpath("//h1[@id='page-title']");

    public void clickOnShoppingLink() {
        clickOnElement(shoppingLink);
    }
    public String verifyTextShopping() {
        return getTextFromElement(actualMessage);
    }
}

package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingItem extends Utility {

    By actualMessage = By.xpath("//h1[text()='Your shopping cart - 1 item']");
    By actualMessage5_1 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[1]");
    By actualMessage5_3 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[3]");
   By actualMessage5_2 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[2]");
   By actualMessage5_4 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[4]");

    By actualMessage6_1 = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-prefix']");
   By actualMessage6_2 = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-integer']");
   By actualMessage6_3 = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-decimalDelimiter']");
   By actualMessage6_4 = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-decimal']");
   By gotocheckout = By.xpath("//button[@class='btn  regular-button regular-main-button checkout']");
   By emptyYourCart = By.xpath("//a[@class='clear-bag']");
   By actualMessage15 = By.xpath("//h1[text()='Your cart is empty']");

   public void  emptyCart() {
       clickOnElement(emptyYourCart);
   }
   public String verifyYourCartIsEmpty() {
       return getTextFromElement(actualMessage15);
   }


   public void setGotoCheckout() {
       clickOnElement(gotocheckout);
   }

    public String getactualMessage5(){
        return getTextFromElement(actualMessage6_1);
    }
    public String getactualMessage6(){
        return getTextFromElement(actualMessage6_2);
    }
    public String getactualMessage7(){
        return getTextFromElement(actualMessage6_3);
    }
    public String getactualMessage8(){
        return getTextFromElement(actualMessage6_4);
    }


    public String verifyShoppingItem() {
        return getTextFromElement(actualMessage);
    }
    public String getactualMessage1(){
        return getTextFromElement(actualMessage5_1);
    }
    public String getactualMessage2() {
        return getTextFromElement(actualMessage5_2);
    }
    public String getactualMessage3() {
        return getTextFromElement(actualMessage5_3);
    }
    public String getactualMessage4() {
        return getTextFromElement(actualMessage5_4);
    }
}

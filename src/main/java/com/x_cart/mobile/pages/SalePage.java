package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {

    By actualMessage = By.xpath("//h1[text()='Sale']");
    By sortBylink = By.xpath("//span[text()='Sort by:']");
    By actualMessage1 = By.xpath("//span[text()='Name A - Z']");
    By actualMessage2 = By.xpath("//span[text()='Price High - Low']");
    By clickHightoLow = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
    By clickRates = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]");
    By actualMessage3 = By.xpath("//span[text()='Rates ']");
    By clickOnAtoZ = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");

    public String verifyTextSale() {
        return getTextFromElement(actualMessage);
    }
    public void setClickOnAtoZ() {
        clickOnElement(clickOnAtoZ);
    }
    public void mouseHoverOnSortBy () {
        mouseHoverToElement(sortBylink);
    }
    public String verifyTextArrangeAToZ() {
        return getTextFromElement(actualMessage1);
    }
    public String verifyTextArrangeHighToLow() {
        return getTextFromElement(actualMessage2);
    }
    public void clickOnHighToLow() {
        clickOnElement(clickHightoLow);
    }
    public void clickOnRates() {
        clickOnElement(clickRates);
    }
    public String verifyTextRates() {
        return getTextFromElement(actualMessage3);
    }
}

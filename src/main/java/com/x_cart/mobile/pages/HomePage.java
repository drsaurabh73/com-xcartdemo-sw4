package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By HotdealLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']");
    By SaleLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Sale']");
    By clicksale = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Sale']");
    By bestSeller = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//span[text()='Bestsellers']");


public void mouseHoverBestSeller() {
    mouseHoverToElement(bestSeller);
}
public void clickOnBestseller() {
    clickOnElement(bestSeller);
}

    public void mouseHoverOnHotDeals() {
        mouseHoverToElement(HotdealLink);
    }
    public void mouseHoverOnSale() {
        mouseHoverToElement(SaleLink);
    }


    public void clickOnSale() {
        clickOnElement(clicksale);
    }
}

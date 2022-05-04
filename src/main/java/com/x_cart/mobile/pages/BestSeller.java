package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSeller extends Utility {

    By actualMessage = By.xpath("//h1[text()='Bestsellers']");
    By sortBy = By.xpath("//span[text()='Sort by:']");
    By clickOnZtoA = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='desc']");
    By actualMessage1 = By.xpath("//span[text()='Name Z - A']");
    By actualMessage2 = By.xpath("//span[text()='Price High - Low']");
    By actualMessage3 = By.xpath("//span[text()='Rates ']");
    By clickOnHightoLow = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By clickRates = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]");
    By sortAToZ = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='asc']");
    By addToCart = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-42']");
    By mouseHoverAdd1 = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']");
    By addToCart1 = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]");
    By actualMessage4 = By.xpath("//li[text()='Product has been added to your cart']");
    By MessageBox = By.xpath("//a[@class='close']");
    By yourCart = By.xpath("//div[@title='Your cart']");
    By viewCart  = By.xpath("//span[text()='View cart']");


public void mouseHoverOnAddToCart() {
    mouseHoverToElement(addToCart);
}
public void setMouseHoverAdd1() {
    mouseHoverToElement(mouseHoverAdd1);
}
public void setAddToCart1() {
    clickOnElement(addToCart1);
}

    public void setYourCart() {
        clickOnElement(yourCart);
    }
    public void setViewCart() {
        clickOnElement(viewCart);
    }

    public void CloseTheMessageBoxProductadd() {
        clickOnElement(MessageBox);
    }


    public String verifyProductAddedToTheCart() {
        return getTextFromElement(actualMessage4);
    }

    public void setSortAToZ() {
        clickOnElement(sortAToZ);
    }
    public void setAddToCart() {
        clickOnElement(addToCart);
    }
    public void clickOnRates() {
        clickOnElement(clickRates);
    }
    public void setClickOnHightoLow() {
        clickOnElement(clickOnHightoLow);
    }

    public String verifyTheTextBestseller() {
        return getTextFromElement(actualMessage);
    }
    public void mouseHoverOnSortBy() {
        mouseHoverToElement(sortBy);
    }

    public void setClickOnZtoA() {
        clickOnElement(clickOnZtoA);
    }
    public String verifysortByZtoA() {
        return getTextFromElement(actualMessage1);
    }
    public String verifySortByHighToLow() {
        return getTextFromElement(actualMessage2);
    }
    public String verifySortByRates() {
        return getTextFromElement(actualMessage3);
    }

}

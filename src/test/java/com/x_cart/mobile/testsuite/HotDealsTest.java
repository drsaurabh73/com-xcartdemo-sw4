package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSeller;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SalePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {

HomePage homePage = new HomePage();
SalePage salePage = new SalePage();
BestSeller bestSeller = new BestSeller();

@Test
public void verifySaleProudctsArrangeAlphabetically() throws InterruptedException {
homePage.mouseHoverOnHotDeals();
homePage.mouseHoverOnSale();
homePage.clickOnSale();

    Assert.assertEquals(salePage.verifyTextSale(),"Sale","");
    salePage.mouseHoverOnSortBy();
    salePage.setClickOnAtoZ();
    Thread.sleep(1000);
    Assert.assertEquals(salePage.verifyTextArrangeAToZ(),"Name A - Z","");

}
@Test
public void verifySaleProudctsPriceArrangeLowTOHigh() throws InterruptedException {
    homePage.mouseHoverOnHotDeals();
    homePage.mouseHoverOnSale();
    homePage.clickOnSale();
    Thread.sleep(1000);
    Assert.assertEquals(salePage.verifyTextSale(),"Sale","");
    salePage.mouseHoverOnSortBy();
    salePage.clickOnHighToLow();
    Thread.sleep(1000);
    Assert.assertEquals(salePage.verifyTextArrangeHighToLow(),"Price High - Low","");

}
@Test
public void verifySaleProudctsArrangeByRates() throws InterruptedException {
    homePage.mouseHoverOnHotDeals();
    homePage.mouseHoverOnSale();
    homePage.clickOnSale();
    Thread.sleep(1000);
    Assert.assertEquals(salePage.verifyTextSale(),"Sale","");
    salePage.mouseHoverOnSortBy();
    salePage.clickOnRates();
    Assert.assertEquals(salePage.verifyTextRates(),"Rates","");

}
@Test
public void verifyBestSellerProudctsArrangeByZToA() throws InterruptedException {
    homePage.mouseHoverOnHotDeals();
    homePage.mouseHoverBestSeller();
    homePage.clickOnBestseller();
    Assert.assertEquals(bestSeller.verifyTheTextBestseller(),"Bestsellers","");
    bestSeller.mouseHoverOnSortBy();
    bestSeller.setClickOnZtoA();
    Assert.assertEquals(bestSeller.verifysortByZtoA(),"Name Z - A","");

}
@Test
public void verifyBestSellersProductsPriceArrangeHighTOLow() {
    homePage.mouseHoverOnHotDeals();
    homePage.mouseHoverBestSeller();
    homePage.clickOnBestseller();
    Assert.assertEquals(bestSeller.verifyTheTextBestseller(),"Bestsellers","");
    bestSeller.mouseHoverOnSortBy();
    bestSeller.setClickOnHightoLow();
    Assert.assertEquals(bestSeller.verifySortByHighToLow(),"Price High - Low","");
}
@Test
public void verifyBestSellerProductsArrangeByRates() {
    homePage.mouseHoverOnHotDeals();
    homePage.mouseHoverBestSeller();
    homePage.clickOnBestseller();
    Assert.assertEquals(bestSeller.verifyTheTextBestseller(),"Bestsellers","");
    bestSeller.mouseHoverOnSortBy();

    Assert.assertEquals(bestSeller.verifySortByRates(),"//span[text()='Rates ']","");
}

}



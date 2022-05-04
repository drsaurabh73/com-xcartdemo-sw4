package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homePage = new HomePage();
    SalePage salePage = new SalePage();
    BestSeller bestSeller = new BestSeller();
    ShoppingItem shoppingItem = new ShoppingItem();
    SecureCheckOut secureCheckOut = new SecureCheckOut();
    LogInToYourAccount logInToYourAccount = new LogInToYourAccount();


    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {
        homePage.mouseHoverOnHotDeals();
       Thread.sleep(500);
        homePage.mouseHoverBestSeller();
        homePage.clickOnBestseller();
        Thread.sleep(1000);
        Assert.assertEquals(bestSeller.verifyTheTextBestseller(), "Bestsellers", "");
        bestSeller.mouseHoverOnSortBy();
        bestSeller.setSortAToZ();
        Thread.sleep(1000);
        bestSeller.mouseHoverOnAddToCart();
        Thread.sleep(1000);
        bestSeller.setAddToCart();
        Assert.assertEquals(bestSeller.verifyProductAddedToTheCart(), "Product has been added to your cart", "");
        bestSeller.CloseTheMessageBoxProductadd();
        bestSeller.setYourCart();
        Thread.sleep(1000);
        bestSeller.setViewCart();
        Assert.assertEquals(shoppingItem.verifyShoppingItem(), "Your shopping cart - 1 item", "");
        Assert.assertEquals(shoppingItem.getactualMessage1() + shoppingItem.getactualMessage2() +
                shoppingItem.getactualMessage3() + shoppingItem.getactualMessage4(), "$299.00", "");

        Assert.assertEquals(shoppingItem.getactualMessage5() + shoppingItem.getactualMessage6() +
                shoppingItem.getactualMessage7() + shoppingItem.getactualMessage8(), "$309.73", "");
        Thread.sleep(2000);
        shoppingItem.setGotoCheckout();
        Assert.assertEquals(logInToYourAccount.verifyLoginToYourAccount(),"Log in to your account","");
        logInToYourAccount.emailaddress("sam1Patel@gmail.com");
        logInToYourAccount.getContinueButton();
        Assert.assertEquals(secureCheckOut.verifySecureCheckout(),"Secure Checkout","");

        secureCheckOut.enterYourFirstName("sam");
        secureCheckOut.enterYourLastName("Patil");
        secureCheckOut.enterStreetName("chore gali");
        secureCheckOut.enterCityName("Mumbai");
        secureCheckOut.enterStateName("Gujarat");
        secureCheckOut.enterZipcode("90005");

       // secureCheckOut.clearEmail();
     //   secureCheckOut.enterEmail("sampatil@gmail.com");
        secureCheckOut.getCreateAccount();
        Thread.sleep(1000);
        secureCheckOut.enterPassword("123456@");
        secureCheckOut.mouseHoverLocalShipping();
        secureCheckOut.getLocalShipping();
        secureCheckOut.mouseHoverPaymentMethod();
        secureCheckOut.getPaymentMethod();
        Assert.assertEquals(secureCheckOut.acutalMessage10()+secureCheckOut.acutalMessage11()
        +secureCheckOut.acutalMessage12()+secureCheckOut.acutalMessage13(),"$311.03","");
        Thread.sleep(1000);
        secureCheckOut.enterPlaceOrder();
        Thread.sleep(1000);
        Assert.assertEquals(secureCheckOut.verifyThankYouForYourOrder(),"Thank you for your order","");


    }
    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnHotDeals();
        homePage.mouseHoverBestSeller();
        homePage.clickOnBestseller();
        Thread.sleep(1000);
        Assert.assertEquals(bestSeller.verifyTheTextBestseller(), "Bestsellers", "");
        //	1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestSeller.mouseHoverOnSortBy();
        Thread.sleep(1000);
        bestSeller.setSortAToZ();
        //	1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
        bestSeller.setMouseHoverAdd1();
        bestSeller.setAddToCart1();
        Assert.assertEquals(bestSeller.verifyProductAddedToTheCart(), "Product has been added to your cart", "");
        bestSeller.setYourCart();
        Thread.sleep(1000);
        bestSeller.setViewCart();
        Assert.assertEquals(shoppingItem.verifyShoppingItem(), "Your shopping cart - 1 item", "");
        Assert.assertEquals(shoppingItem.alertText(),"Are you sure you want to clear your cart?","");
        alertHandle();
        Assert.assertEquals(shoppingItem.verifyYourCartIsEmpty(),"Your cart is empty","");



    }

}

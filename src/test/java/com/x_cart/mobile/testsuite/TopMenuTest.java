package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.CommingSoon;
import com.x_cart.mobile.pages.ContactUs;
import com.x_cart.mobile.pages.NewPage;
import com.x_cart.mobile.pages.ShippingPage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
ShippingPage shippingPage = new ShippingPage();
NewPage newPage = new NewPage();
CommingSoon commingSoon = new CommingSoon();
ContactUs contactUs = new ContactUs();

@Test
public void verifyUserShouldNavigateToShippingPageSuccessfully() {
shippingPage.clickOnShoppingLink();
    Assert.assertEquals(shippingPage.verifyTextShopping(),"Shipping","");

}
@Test
public void verifyUserShouldNavigateToNewPageSuccessfully() {
    newPage.clickNew();
    Assert.assertEquals(newPage.verifyTextNew(),"New arrivals","");

}
@Test
public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {

    commingSoon.clickOnCommingSoon();
    Assert.assertEquals(commingSoon.verifyTextCommingSoon(),"Coming soon");
}
@Test
public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
contactUs.clickOnContactUs();
Assert.assertEquals(contactUs.verifyContactUs(),"Contact us","");

}


}

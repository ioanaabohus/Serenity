package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa1.fasttrackit.org:8008/cart/")
public class CartPage extends PageObject {
    @FindBy (css="a.checkout-button")
    private WebElementFacade proceedToCheckoutButton;

    public void clickOnCheckoutButton () {
        clickOn(proceedToCheckoutButton);
    }
}

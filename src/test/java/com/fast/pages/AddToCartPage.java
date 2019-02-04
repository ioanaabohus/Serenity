package com.fast.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa1.fasttrackit.org:8008/shop/")
public class AddToCartPage extends PageObject {
    @FindBy (css="a[data-product_sku='Woo-beanie-logo']")
    private WebElementFacade product;
    @FindBy (css="a.added_to_cart")
    private WebElementFacade addedToCart;

    public void addToCart () {
        clickOn(product);
    }
    public void viewCart () {
        clickOn(addedToCart);
    }



}

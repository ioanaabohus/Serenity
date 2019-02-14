package com.fast.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://qa1.fasttrackit.org:8008/shop/")
public class AddToCartPage extends PageObject {
    @FindBy(css = "a[data-product_sku='Woo-beanie-logo']")
    private WebElementFacade product;
    @FindBy(css = "a.added_to_cart")
    private WebElementFacade addedToCart;
    @FindBy(css = ".product")
    List<WebElementFacade> listOfProducts;

    public boolean selectProduct(String text) {
        for (WebElementFacade product : listOfProducts) {
            if (product.getText().contains(text)) {
                product.findElement(By.cssSelector(".add_to_cart_button")).click();
                return true;
            }
        }
        return false;
    }

    public void viewCart() {
        clickOn(addedToCart);
    }
}





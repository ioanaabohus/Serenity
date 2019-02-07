package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.fasttrackit.org:8008/cart/")
public class CartPage extends PageObject {
    @FindBy(css = "a.checkout-button")
    private WebElementFacade proceedToCheckoutButton;
    @FindBy(css = ".product-price .amount")
    private WebElementFacade productPriceSpan;
    @FindBy(css = ".product-subtotal .amount")
    private WebElementFacade priceTotal;
    @FindBy(css = "button[name='update_cart']")
    private WebElementFacade updateButton;
    @FindBy(css = "input.input-text.qty")
    private WebElementFacade quantityUPButton;

    public void addQuantity() {
        for (int i = 0; i < 12; i++) {
            clickOn(quantityUPButton);
        }
    }

    public void checkProductQuantity() {
        String price = productPriceSpan.getText().trim();
        String priceFinal = price.replace(",", "").replace(" lei", "");

        waitABit(5000);
        int pricex = Integer.valueOf(priceFinal);

        int priceTotalFinal = Integer.valueOf(priceTotal.getText().trim().replace(",", "").replace(" lei", ""));

        int subtotal = pricex * 12;

        System.out.println("subtotal: " + subtotal);
        System.out.println("priceTotalFinal: " + priceTotalFinal);
        if (subtotal == priceTotalFinal) {
            System.out.println("This is correct");
        } else {
            System.out.println("Try again");
        }
    }

    public void clickOnUpdateCart() {
        clickOn(updateButton);
    }

    public void clickOnCheckoutButton() {
        clickOn(proceedToCheckoutButton);
    }
}

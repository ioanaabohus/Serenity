package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/product/beanie-with-logo/")
public class SearchResultPage extends PageObject {
    @FindBy (css="h1.entry-title a")
    private WebElementFacade beanieProduct;

    public void clickOnResultedProduct() {
        clickOn(beanieProduct);
    }
}

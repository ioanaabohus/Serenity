package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = "li.menu-item-58 a")
    private WebElementFacade myAccountButton;

    public void clickMyAccountButton(){
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(myAccountButton);
        clickOn(myAccountButton);
    }

}

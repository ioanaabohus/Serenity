package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/")
public class ShopPage extends PageObject {

    @FindBy(css="li.menu-item-60 a")
    private WebElementFacade shopButton;

    public void clickOnShopButton () {
        clickOn(shopButton);
    }
}

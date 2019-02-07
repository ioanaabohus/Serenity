package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.fasttrackit.org:8008/checkout/")
public class CheckoutPage extends PageObject {
    @FindBy(id = "billing_first_name")
    private WebElementFacade firstName;
    @FindBy(id = "billing_last_name")
    private WebElementFacade lastName;
    @FindBy(id = "billing_country")
    private WebElementFacade country;
    @FindBy(id = "billing_adress_1")
    private WebElementFacade adress;
    @FindBy(id = "billing_city")
    private WebElementFacade city;
    @FindBy(id = "billig_postcode")
    private WebElementFacade postcode;
    @FindBy(id = "billing_phone")
    private WebElementFacade telephone;
    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;

    public void setFirstFiled() {
        typeInto(firstName, "Ioana");
    }

    public void setLastField() {
        typeInto(lastName, "Bohus");
    }

    public void setCountry() {
        country.selectByVisibleText("Romania");
    }

    public void setAdress() {
        typeInto(adress, "Buna ziua 35");
    }

    public void setCity() {
        typeInto(city, "Cluj-Napoca");
    }

    public void setPostcode() {
        typeInto(postcode, "400498");
    }

    public void setPhone() {
        typeInto(telephone, "0712345678");
    }

    public void clickOnOrderButton() {
        clickOn(placeOrderButton);
    }
}

package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.fasttrackit.org:8008/checkout/")
public class CheckoutPage extends PageObject {
    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNameField;
    @FindBy(id = "billing_last_name")
    private WebElementFacade lastNameField;
    @FindBy(id = "billing_country")
    private WebElementFacade countryField;
    @FindBy(id = "billing_address_1")
    private WebElementFacade adressField;
    @FindBy(id = "billing_city")
    private WebElementFacade cityField;
    @FindBy(id = "billing_postcode")
    private WebElementFacade postcodeField;
    @FindBy(id = "billing_phone")
    private WebElementFacade telephoneField;
    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;
    @FindBy(css = "ul.woocommerce-error li")
    private WebElementFacade phoneErrorMessage;

    public void setFirstFiled(String firstname) {
        typeInto(firstNameField, firstname);
    }

    public void setLastField(String lastname) {
        typeInto(lastNameField, lastname);
    }

    public void setCountry(String country) {
        countryField.selectByVisibleText(country);
    }

    public void setAdress(String adress) {
        waitFor(adressField);
        typeInto(adressField, adress);
    }

    public void setCity(String city) {
        typeInto(cityField, city);
    }

    public void setPostcode(String postcode) {
        typeInto(postcodeField, postcode);
    }

    public void setPhone(String phone) {
        typeInto(telephoneField, phone);
    }

    public boolean checkPhoneNumber(String errorMessage) {
        System.out.println(phoneErrorMessage.getText());
        return phoneErrorMessage.containsText(errorMessage);
    }

    public void clickOnOrderButton() {
        clickOn(placeOrderButton);
    }
}

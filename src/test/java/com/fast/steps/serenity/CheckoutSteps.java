package com.fast.steps.serenity;

import com.fast.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckoutSteps extends ScenarioSteps {
    CheckoutPage checkoutPage;

    @Step
    public void setFirstName () {
        checkoutPage.setFirstFiled();
    }
    @Step
    public void setLastName () {
        checkoutPage.setLastField();
    }
    @Step
    public void selectCountry () {
        checkoutPage.setCountry();
    }
    @Step
    public void fillAdress () {
        checkoutPage.setAdress();
    }
    @Step
    public void fillCity () {
        checkoutPage.setCity();
    }
    @Step
    public void fillPostcode () {
        checkoutPage.setPostcode();
    }
    @Step
    public void fillPhone () {
        checkoutPage.setPhone();
    }
    @Step
    public void clickOrderButton () {
        checkoutPage.clickOnOrderButton();
    }
    @StepGroup
    public void validPlaceOrder () {
        setFirstName();
        setLastName();
        selectCountry();
        fillAdress();
        fillCity();
        fillPostcode();
        fillPhone();
        clickOrderButton();
    }
}

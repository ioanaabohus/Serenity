package com.fast.steps.serenity;

import com.fast.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CheckoutSteps extends ScenarioSteps {
    CheckoutPage checkoutPage;

    @Step
    public void setFirstName () {
        checkoutPage.setFirstFiled("Ioana");
    }
    @Step
    public void setLastName () {
        checkoutPage.setLastField("Bohus");
    }
    @Step
    public void selectCountry () {
        checkoutPage.setCountry("Romania");
    }
    @Step
    public void fillAdress () {
        checkoutPage.setAdress("Buna ziua 35");
    }
    @Step
    public void fillCity () {
        checkoutPage.setCity("Cluj-Napoca");
    }
    @Step
    public void fillPostcode () {
        checkoutPage.setPostcode("400498");
    }
    @Step
    public void completeValidPhone () {
        checkoutPage.setPhone("0712345678");
    }
    @Step
    public void completeInvalidPhone () {
        checkoutPage.setPhone("blabla");
    }
    @Step
    public void checkPhoneNumberError () {
        Assert.assertTrue(checkoutPage.checkPhoneNumber("Billing Phone is not a valid phone number."));
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
        completeValidPhone();
        clickOrderButton();
    }
    @StepGroup
    public void invalidPlaceOrder () {
        setFirstName();
        setLastName();
        selectCountry();
        fillAdress();
        fillCity();
        fillPostcode();
        completeInvalidPhone();
        clickOrderButton();
        checkPhoneNumberError();
    }
}

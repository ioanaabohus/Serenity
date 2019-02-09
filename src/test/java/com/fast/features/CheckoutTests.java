package com.fast.features;

import com.fast.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    ShopSteps shopSteps;
    @Steps
    AddToCartSteps addToCartSteps;
    @Steps
    CartSteps cartSteps;
    @Steps
    CheckoutSteps checkoutSteps;
    @Test
    public void validProcceedCheckout () {
        loginSteps.validLogin();
        shopSteps.validShoping();
        addToCartSteps.validAdd();
        cartSteps.validProceedToCheckout();
        checkoutSteps.validPlaceOrder();
    }
    @Test
    public void invalidProceedCheckout () {
        loginSteps.validLogin();
        shopSteps.validShoping();
        addToCartSteps.validAdd();
        cartSteps.validProceedToCheckout();
        checkoutSteps.invalidPlaceOrder();
    }
}

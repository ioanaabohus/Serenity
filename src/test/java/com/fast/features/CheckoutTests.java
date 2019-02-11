package com.fast.features;

import com.fast.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
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
    AddToCartSteps addToCartSteps;
    @Steps
    CartSteps cartSteps;
    @Steps
    CheckoutSteps checkoutSteps;
    @Before
    public void maximizePage () {
        driver.manage().window().maximize();
    }
    @Test
    public void validProcceedCheckout () {
        loginSteps.goToShop();
        addToCartSteps.validAdd();
        cartSteps.validProceedToCheckout();
        checkoutSteps.validPlaceOrder();
    }
    @Test
    public void invalidProceedCheckout () {
       loginSteps.goToShop();
        addToCartSteps.validAdd();
        cartSteps.validProceedToCheckout();
        checkoutSteps.invalidPlaceOrder();
    }
}

package com.fast.features;

import com.fast.steps.serenity.AddToCartSteps;
import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;
    @Steps
    AddToCartSteps addToCartSteps;
    @Steps
    CartSteps cartSteps;
    @Before
    public void maximizePage () {
        driver.manage().window().maximize();
    }
    @Test
    public void validProcceedCheckout () {
        loginSteps.goToShop();
        addToCartSteps.validAdd();
        cartSteps.validProceedToCheckout();
    }

}

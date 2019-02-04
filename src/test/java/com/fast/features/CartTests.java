package com.fast.features;

import com.fast.steps.serenity.AddToCartSteps;
import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.ShopSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
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
    ShopSteps shopSteps;
    @Steps
    AddToCartSteps addToCartSteps;
    @Steps
    CartSteps cartSteps;
    @Test
    public void validProcceedCheckout () {
        loginSteps.validLogin();
        shopSteps.validShoping();
        addToCartSteps.validAdd();
        cartSteps.validProceedToCheckout();
    }

}

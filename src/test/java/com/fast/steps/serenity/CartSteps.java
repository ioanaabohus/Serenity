package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CartSteps extends ScenarioSteps {
    CartPage cartPage;
    public void clickCheckoutButton () {
        cartPage.clickOnCheckoutButton();
    }
    @Step
    public void validProceedToCheckout () {
        clickCheckoutButton();
    }
}

package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {
    CartPage cartPage;
    @Step
    public void changeQuantity() {
        cartPage.addQuantity();
    }
    @Step
    public void checkQuantity () {
        Assert.assertTrue(cartPage.checkProductQuantity());
    }
    @Step
    public void clickUpdateButton (){
        cartPage.clickOnUpdateCart();
    }
    @Step
    public void clickCheckoutButton () {
        cartPage.clickOnCheckoutButton();
    }

    @StepGroup
    public void validProceedToCheckout () {
        changeQuantity();
        clickUpdateButton();
        checkQuantity();
        clickCheckoutButton();
    }
}

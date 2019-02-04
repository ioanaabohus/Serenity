package com.fast.steps.serenity;

import com.fast.pages.AddToCartPage;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class AddToCartSteps extends ScenarioSteps {
    AddToCartPage addToCartPage;

    public void addToCart () {
        addToCartPage.addToCart();
    }
    public void viewCart () {
        addToCartPage.viewCart();
    }
    @StepGroup
    public void validAdd () {
        addToCart();
        viewCart();
    }
}

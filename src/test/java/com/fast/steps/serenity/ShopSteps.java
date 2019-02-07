package com.fast.steps.serenity;

import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class ShopSteps extends ScenarioSteps {
    ShopPage shopPage;

    public void clickOnShopButton() {
        shopPage.clickOnShopButton();
    }

    public void selectFromProducts() {
        shopPage.selectProduct();
    }

    @StepGroup
    public void validShoping() {
        clickOnShopButton();
        selectFromProducts();
    }

}
package com.fast.steps.serenity;

import com.fast.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductSteps extends ScenarioSteps {
    ProductPage productPage;

    @Step
   public void clickReviewButton () {
        productPage.clickOnReviewButton();
    }
    @Step
    public void selectRating () {
        productPage.selectRating();
    }
    @Step
    public void writeComment () {
        productPage.writeComment();
    }
    @Step
    public void clickSubmitButton () {
        productPage.clickOnSubmitButton();
    }
    @StepGroup
    public void writeReview () {
        clickReviewButton();
        selectRating();
        writeComment();
        clickSubmitButton();
    }
}

package com.fast.steps.serenity;

import com.fast.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchResultSteps extends ScenarioSteps {
    SearchResultPage searchResultPage;

    @Step
    public void clickResultedProduct () {
        searchResultPage.clickOnResultedProduct();
    }
    @StepGroup
    public void selectResultedProduct () {
        clickResultedProduct();
    }
}

package com.fast.features;

import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.SearchResultSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchResultTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    LoginSteps loginSteps;
    @Steps
    SearchResultSteps searchResultSteps;
    @Before
    public void maximizePage () {
        driver.manage().window().maximize();
    }
    @Test
    public void selectFromResults () {
        loginSteps.useSearchBar();
        searchResultSteps.clickResultedProduct();
    }
}

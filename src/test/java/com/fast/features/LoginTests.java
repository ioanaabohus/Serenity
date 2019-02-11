package com.fast.features;

import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    LoginSteps loginSteps;
    @Before
    public void maximizePage () {
        driver.manage().window().maximize();
    }
    @Test
    public void validLogin () {
        loginSteps.validLogin();
    }
    @Test
    public void invalidLogin () {
        loginSteps.invalidLogin();
    }
    @Test
    public void viewOrders () {
        loginSteps.goToOrders();
    }
    @Test
    public void successfulLogout () {
        loginSteps.logout();
    }
    @Test
    public void checkSearchBar () {
        loginSteps.useSearchBar();
    }
    @Test
    public void clickSearchButton () {
        loginSteps.goToShop();
    }


}

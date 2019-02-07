package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
    HomePage homePage;
    LoginPage loginPage;

    @Step
    public void navigateToHomePage() {
        homePage.open();
    }

    @Step
    public void goToMyAccountButton() {
        homePage.clickMyAccountButton();
    }

    @Step
    public void loginWithValidCredentials() {
        loginPage.trueCredentialsLogin();
    }

    @Step
    public void loginWithInvalidCredentials() {
        loginPage.invalidCredentialsLogin();
    }

    @Step
    public void checkLoggedIn() {
        loginPage.checkLoggedIn();
    }

    @Step
    public void checkErrorMessage() {
        loginPage.checkFailedLogin();
    }

    @StepGroup
    public void validLogin() {
        navigateToHomePage();
        goToMyAccountButton();
        loginWithValidCredentials();
        checkLoggedIn();
    }

    @StepGroup
    public void invalidLogin() {
        navigateToHomePage();
        goToMyAccountButton();
        loginWithInvalidCredentials();
        checkErrorMessage();
    }

}

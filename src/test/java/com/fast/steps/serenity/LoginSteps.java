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
    public void navigateToHomePage () {
        homePage.open();
    }
    @Step
    public void goToMyAccountButton() {
        homePage.clickMyAccountButton();
    }
    @Step
    public void setEmailField () {
        loginPage.setEmailField();
    }
    @Step
    public void setPasswordField () {
        loginPage.setPasswordField();
    }
    @Step
    public void clickLoginButton () {
        loginPage.clickLoginButton();
    }
    @Step
    public void checkLoggedIn () {
        loginPage.checkLoggedIn();
    }
    @StepGroup
    public void validLogin () {
        navigateToHomePage();
        goToMyAccountButton();
        setEmailField();
        setPasswordField();
        clickLoginButton();
        checkLoggedIn();
    }

}

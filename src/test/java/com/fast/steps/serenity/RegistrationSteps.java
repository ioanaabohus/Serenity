package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.RegistrationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class RegistrationSteps extends ScenarioSteps {

    HomePage homePage;
    RegistrationPage registrationPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void goToMyAccountButton() {
        homePage.clickMyAccountButton();
    }

    @Step
    public void setRegistrationEmail() {
        registrationPage.setRegistrationEmail();
    }

    @Step
    public void setRegistrationPassword() {
        registrationPage.setRegistrationPassword();
    }

    @Step
    public void clickOnRegisterButton() {
        registrationPage.clickOnRegisterButton();
    }

    @StepGroup
    public void registration() {
        navigateToHomepage();
        goToMyAccountButton();
        setRegistrationEmail();
        setRegistrationPassword();
        clickOnRegisterButton();
    }
}

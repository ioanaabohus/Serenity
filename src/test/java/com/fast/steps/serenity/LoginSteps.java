package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

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
        loginPage.trueCredentialsLogin("ioanaa.bohus@gmail.com", "parolaParola11");
    }

    @Step
    public void loginWithInvalidCredentials() {
        loginPage.trueCredentialsLogin("blabla@whatever.com", "ihavenoidea");
    }

    @Step
    public void checkLoggedIn() {
        Assert.assertTrue(loginPage.checkLoggedIn("ioanaa.bohus"));
    }

    @Step
    public void checkErrorMessage() {
        loginPage.checkFailedLogin();
    }
    @Step
    public void clickOnOrders () {
        loginPage.clickOnOrdersButton();
    }
    @Step
    public void clickLogout () {
        loginPage.clickOnLogoutButton();
    }
    @Step
    public void clickSearchBar () {
        loginPage.clickOnSearchBar();
    }
    @Step
    public void searchBeanie () {
        loginPage.searchProduct();
    }
    @Step
    public void clickShopButton () {
        loginPage.clickOnShopButton();
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
    @StepGroup
    public void goToOrders () {
        navigateToHomePage();
        goToMyAccountButton();
        loginWithValidCredentials();
        clickOnOrders();
    }
    @StepGroup
    public void logout () {
        navigateToHomePage();
        goToMyAccountButton();
        loginWithValidCredentials();
        clickLogout();

    }
    @StepGroup
    public void useSearchBar () {
        navigateToHomePage();
        goToMyAccountButton();
        loginWithValidCredentials();
        clickSearchBar();
        searchBeanie();
    }
    @StepGroup
    public void goToShop (){
        navigateToHomePage();
        goToMyAccountButton();
        loginWithValidCredentials();
        clickShopButton();
    }

}

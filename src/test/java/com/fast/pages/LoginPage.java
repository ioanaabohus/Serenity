package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = "button[name='login']")
    private WebElementFacade loginButton;

    public void setEmailField() {
        typeInto(emailField, "ioanaa.bohus@gmail.com");
    }

    public void setPasswordField() {
        typeInto(passwordField, "parolaParola11");
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    @FindBy(css = "p strong")
    private WebElementFacade helloIoana;

    public boolean checkLoggedIn() {
        waitFor(helloIoana);
        return helloIoana.containsText("Hello ioanaa.bohus");

    }
}


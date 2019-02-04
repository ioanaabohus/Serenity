package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/")
public class RegistrationPage extends PageObject {

    @FindBy(id = "reg_email")
    private WebElementFacade registrationEmail;
    @FindBy(id = "reg_password")
    private WebElementFacade registrationPassword;
    @FindBy(css = "p.woocommerce-FormRow button")
    private WebElementFacade registerButton;

    public void setRegistrationEmail() {
        typeInto(registrationEmail, "ioanaa.bohus@gmail.com");
    }

    public void setRegistrationPassword() {
        typeInto(registrationPassword, "parolaParola11");
    }

    public void clickOnRegisterButton() {
        clickOn(registerButton);
    }
}


package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa1.fasttrackit.org:8008/wp-login.php?loggedout=true")
public class LogoutPage extends PageObject {
    @FindBy (css="p.message")
    private WebElementFacade logoutMessage;

    public boolean checkLogoutMessage (String loggedout) {
        System.out.println(logoutMessage.getText());
        return logoutMessage.containsText(loggedout);
    }
}

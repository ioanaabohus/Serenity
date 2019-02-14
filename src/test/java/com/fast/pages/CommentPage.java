package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa1.fasttrackit.org:8008/product/beanie-with-logo/#comment-48")
public class CommentPage extends PageObject {
    @FindBy (css="em.woocommerce-review__awaiting-approval")
    private WebElementFacade approvalMessage;

    public boolean checkConfirmation (String approval) {
        return approvalMessage.containsText(approval);

    }
}

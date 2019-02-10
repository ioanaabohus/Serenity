package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/orders/")
public class OrdersPage extends PageObject {
    @FindBy (css="td.woocommerce-orders-table__cell-order-number a")
    private WebElementFacade orderNumber;

    public boolean checkExistingOrder (String number) {
        System.out.println(orderNumber.getText());
        return orderNumber.containsText(number);
    }
}

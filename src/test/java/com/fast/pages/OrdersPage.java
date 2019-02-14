package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/orders/")
public class OrdersPage extends PageObject {
    @FindBy(css = "td.woocommerce-orders-table__cell.woocommerce-orders-table__cell-order-number")
    List<WebElementFacade> listOfOrders;
    @FindBy(css = "td.woocommerce-orders-table__cell-order-number a")
    private WebElementFacade orderNumber;

    public boolean checkExistingOrder(String text) {
        for (WebElementFacade orderNumber : listOfOrders) {
            if (orderNumber.getText().contains(text)) {
                return true;
            }
        }
        return false;
    }

}


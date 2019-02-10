package com.fast.steps.serenity;

import com.fast.pages.OrdersPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class OrdersSteps extends ScenarioSteps {
    OrdersPage ordersPage;
    @Step
    public void checkExistingOrders () {
        Assert.assertTrue(ordersPage.checkExistingOrder("#117"));
    }
    @StepGroup
    public void checkOrders () {
        checkExistingOrders();
    }
}

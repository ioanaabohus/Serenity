package com.fast.steps.serenity;

import com.fast.pages.LogoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LogoutSteps extends ScenarioSteps {
    LogoutPage logoutPage;
    @Step
    public void checkLogout () {
        Assert.assertTrue(logoutPage.checkLogoutMessage("You are now logged out."));
    }
    @StepGroup
    public void checkLogoutMessage () {
        checkLogout();
    }


}

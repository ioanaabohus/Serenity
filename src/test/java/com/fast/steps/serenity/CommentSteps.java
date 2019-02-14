package com.fast.steps.serenity;

import com.fast.pages.CommentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CommentSteps extends ScenarioSteps {
    CommentPage commentPage;
    @Step
    public void checkApproval () {
        Assert.assertTrue(commentPage.checkConfirmation("Your review is awaiting approval"));
    }
    @StepGroup
    public void approvalMessage () {
        checkApproval();
    }
}

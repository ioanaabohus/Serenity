package com.fast.features;

import com.fast.steps.serenity.RegistrationSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegistrationTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    RegistrationSteps registrationSteps;

    @Test
    public void validRegistration(){
       registrationSteps.navigateToHomepage();
       registrationSteps.goToMyAccountButton();
       registrationSteps.setRegistrationEmail();
       registrationSteps.setRegistrationPassword();
       registrationSteps.clickOnRegisterButton();
    }


}

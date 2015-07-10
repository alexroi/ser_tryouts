package net.serenitybdd.demo;

import net.serenitybdd.demo.steps.ContactSteps;
import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.runner.RunWith;

/**
 * Created by HooT on 27.06.2015.
 */
public class AcceptanceTestSuite {
    @Steps
    ContactSteps contactSteps;

    @Given("Main page is opened")
    public void givenMainPageIsOpened() {
        contactSteps.openMainPage();
    }

    @When("user clicks create new contact button")
    public void whenUserClicksCreateNewContactButton() {
        contactSteps.clickCreateButton();
    }

    @When("user fills fields with title <title> email <email> phone number <phone>")
    public void whenUserFillsFieldsWithTitletitleEmailemailPhoneNumberphone(String title, String email, String phone) {
        contactSteps.fillInForm(title, email, phone);
    }

    @When("submits create form")
    public void whenSubmitsCreateForm() {
        contactSteps.submitForm();
    }

    @Then("Contact with title <title> displayed on main page")
    public void thenContactWithTitletitleDisplayedOnMainPage(String title) {
        contactSteps.isContactPresent(title);
    }
}

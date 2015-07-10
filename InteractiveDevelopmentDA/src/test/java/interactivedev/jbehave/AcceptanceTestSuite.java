package interactivedev.jbehave;

import interactivedev.steps.ContactSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

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

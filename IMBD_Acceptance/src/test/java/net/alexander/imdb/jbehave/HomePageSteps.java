package net.alexander.imdb.jbehave;

import net.alexander.imdb.steps.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by HooT on 30.06.2015.
 */
public class HomePageSteps {
    @Steps
    UserSteps userSteps;
    
    @Given("Home page is opened")
    public void givenHomePageIsOpened() {
        userSteps.openMainPage();
    }

    @When("I click login link")
    public void iClickLoginLink(){
        userSteps.clickLogin();
    }

    @When("I authorise with username '$login' and pass '$password'")
    public void whenIAuthoriseWithUsernamehootuagmailcomAndPassfnscar16s(String login, String password) {
        userSteps.clickIMBD();
        userSteps.enterLoginInfo(login, password);
    }

    @When("I submit login")
    public void whenISubmitLogin() {
        userSteps.submitLogin();
    }

    @Then("I see message '$problemWithLoginMessage'")
    public void thenISeeMessageThereWasAProblemWithYourLogInInformationPleaseTryAgain(String problemWithLoginMessage) {
        userSteps.shouldSeeMessage(problemWithLoginMessage);
    }
}

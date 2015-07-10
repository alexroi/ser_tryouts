package net.alexander.imdb.jbehave;

import net.alexander.imdb.steps.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by HooT on 30.06.2015.
 */
public class SearchSteps {
    @Steps
    UserSteps userSteps;

    @When("I enter search phrase '$searchPhrase'")
    public void whenIEnterSearchPhraseBlackHawkDown(String searchPhrase) {
        userSteps.enterSearchPhrase(searchPhrase);
    }

    @When("press submit search")
    public void whenPressSubmitSearch() {
        userSteps.submitSearchRequest();
    }

    @When("i see '$searchPhrase' in search results and click on it")
    public void whenISeePhraseInSearchResults(String searchPhrase) {
        userSteps.clickDesiredSearchResult(searchPhrase);
    }

    @Then("I am on page with title '$title'")
    public void thenIAmOnPageWithTitleBlackHawkDown(String title) {
        userSteps.shouldSeeTitle(title);
        userSteps.addMovieToWatchList();
    }

}

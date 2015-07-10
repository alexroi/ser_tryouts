package net.alexander.imdb.steps;

import net.alexander.imdb.pages.HomePage;
import net.alexander.imdb.pages.MoviePage;
import net.alexander.imdb.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by HooT on 30.06.2015.
 */
public class UserSteps extends ScenarioSteps {
    HomePage homePage;
    SearchPage searchPage;
    MoviePage moviePage;

    @Step
    public void openMainPage() {
        homePage.open();
    }

    @Step
    public void clickLogin() {
        homePage.clickLoginLink();
    }

    @Step
    public void clickIMBD() {
        homePage.checkIMDBService();
    }

    @Step
    public void enterLoginInfo(String login, String password) {
        homePage.enterLogin(login);
        homePage.enterPass(password);
    }

    @Step
    public void submitLogin() {
        homePage.submitLogin();
    }

    @Step
    public void shouldSeeMessage(String problemWithLoginMessage) {
        homePage.seeMessage(problemWithLoginMessage);
    }

    @Step
    public void enterSearchPhrase(String searchPhrase) {
        homePage.enterSearchWord(searchPhrase);
    }

    @Step
    public void submitSearchRequest() {
        homePage.submitSearchWord();
    }

    @Step
    public void clickDesiredSearchResult(String searchPhrase) {
        searchPage.chooseLinkWithPhrase(searchPhrase);
    }

    @Step
    public void shouldSeeTitle(String title) {
        moviePage.shouldSeeTitle(title);
    }

    @Step
    public void addMovieToWatchList() {
        moviePage.addToWishlist();
    }
}

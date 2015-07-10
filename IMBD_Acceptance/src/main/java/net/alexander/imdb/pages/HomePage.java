package net.alexander.imdb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by HooT on 30.06.2015.
 */
@DefaultUrl("http://www.imdb.com")
public class HomePage extends PageObject {
    @FindBy(xpath = "//ul[@id='consumer_user_nav']/span[@class='downArrow']")
    private WebElementFacade loginArrow;

    @FindBy(xpath = "//a[@id='nblogin']")
    private WebElementFacade loginLink;

    @FindBy(xpath = "//input[@id='navbar-query']")
    private WebElementFacade searchField;

    @FindBy(xpath = "//button[@id='navbar-submit-button']")
    private WebElementFacade seacrhButton;

    private WebDriver driver = getDriver();

    @WhenPageOpens
    public void whenPageOpens(){
        loginLink.waitUntilVisible();
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    public void checkIMDBService() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement imdbIcon = wait.until(ExpectedConditions.elementToBeClickable(By.id("imdb-toggle")));
        imdbIcon.click();
    }

    public void enterSearchWord(String searchKey){
        searchField.type(searchKey);
    }

    public void submitSearchWord(){
        seacrhButton.click();
    }

    public void enterLogin(String login) {
        //loginField.type(login);
    }

    public void enterPass(String password) {
        //passwordField.type(password);
    }

    public void submitLogin() {
        //loginSubmitButton.click();
    }

    public void seeMessage(String problemWithLoginMessage) {

    }
}

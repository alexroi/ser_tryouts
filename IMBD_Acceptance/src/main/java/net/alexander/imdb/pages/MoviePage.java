package net.alexander.imdb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by HooT on 30.06.2015.
 */
public class MoviePage extends PageObject {
    @FindBy(xpath = "//a[contains(@class, 'wlb_watchlist_btn')]/a[1]")
    private WebElementFacade watchListLink;

    @FindBy(xpath = "//h1[contains(@class, 'header')]/span[1]")
    private WebElementFacade movieTitle;

    private static final String MOVIETITLE = "//h1[contains(@class, 'header')]/span[text()='%s']";

    public boolean shouldSeeTitle(String desiredTitle) {
        return movieTitle.getText().equals(desiredTitle);
    }

    public void addToWishlist(){
        watchListLink.click();
    }

}

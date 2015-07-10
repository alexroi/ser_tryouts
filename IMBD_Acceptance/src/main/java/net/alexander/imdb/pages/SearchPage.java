package net.alexander.imdb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

/**
 * Created by HooT on 30.06.2015.
 */
public class SearchPage extends PageObject{
    //@FindBy(xpath = "//table[@class='findList']/td[@class='result_text'][1]/a")
    //private List<WebElementFacade> searchResultList;

    //@FindBy(xpath = "//td[@class, 'result_text']/a")
    //@FindBy(xpath = "/html/body/div[1]/div/div[4]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[2]/a")
    @FindBy(xpath = "//table[@class, 'findList']//tr[contains(@class, 'findResult')]//td[@class, 'result_text'][1]/a")
    private WebElementFacade resLink;

    public void chooseLinkWithPhrase(String searchPhrase) {
        resLink.click();
        /*for(WebElementFacade resultLink: searchResultList){
            resultLink.click();
        }*/
    }
}

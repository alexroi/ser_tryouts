package interactivedev.pages;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HooT on 27.06.2015.
 */
@DefaultUrl("http://automated-testing.info")
public class MainPage extends PageObject {

    @FindBy(xpath="//ul[contains(@class, 'contact-list')]")
    private WebElementFacade contactList;

    @FindBy(xpath="//div[contains(@class, 'navbar')//a[contains(text(), 'Create')]]")
    private WebElementFacade createNewContactButton;

    @WhenPageOpens
    public void whenPageOpens(){
        contactList.waitUntilVisible();
    }

    public void clickCreateNewContactButton() {
        createNewContactButton.click();
    }

    public boolean isContactWithTitlePresent(String title) {

        return findAll(String.format(TITLE, title)).size()>0;
    }

    private static final String TITLE = "//li/h2[text()='%s']";
}

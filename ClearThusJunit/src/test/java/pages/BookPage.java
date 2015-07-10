package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HooT on 29.06.2015.
 */
@DefaultUrl("http://m.megafonpro.ru")
public class BookPage extends PageObject {
    WebDriver driver;

    @FindBy(linkText = "Все книги")
    WebElement allBooksButton;

    @FindBy(linkText = "Поиск")
    WebElement searchButton;

    @FindBy(name = "query")
    WebElement searchField;

    @FindBy(css = "button")
    WebElement searchBegin;

    @Before
    public void openPage(String url){
        driver.get(url);
    }

    public void allBooks(){
        allBooksButton.click();
    }

    public void search(String searchWord){
        searchButton.click();
        searchField.sendKeys(searchWord);
        searchBegin.click();
    }

    public boolean catalog(){
        return true;
    }
}

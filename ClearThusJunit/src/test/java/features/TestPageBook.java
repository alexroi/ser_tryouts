package features;

import net.thucydides.core.annotations.*;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import requirements.Application;
import steps.StepsInBook;

/**
 * Created by HooT on 29.06.2015.
 */
@RunWith(ThucydidesRunner.class)
@Story(Application.TestPageBook.class)
public class TestPageBook {
    @Managed
    WebDriver driver;

    @Steps
    public StepsInBook book;

    @Test
    public void testBook() throws Exception{
        book.getMain("http://m.megafonpro.ru");
        book.allBooks();
        book.search("Книга");
        book.catalog();
    }

    @Pending @Test
    public void testBuyBook(){}
}

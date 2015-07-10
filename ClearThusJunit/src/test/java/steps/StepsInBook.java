package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.BookPage;

/**
 * Created by HooT on 29.06.2015.
 */
public class StepsInBook extends ScenarioSteps {

    public BookPage bookPage;

    @Step
    public void getMain(String url){
        bookPage.open(url);
    }

    @Step
    public void allBooks(){
        bookPage.allBooks();
    }

    @Step
    public void search(String word){
        bookPage.search(word);
    }

    @Step
    public void catalog(){
        bookPage.catalog();
    }
}

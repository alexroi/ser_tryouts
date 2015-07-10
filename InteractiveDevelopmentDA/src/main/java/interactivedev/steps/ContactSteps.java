package interactivedev.steps;

import interactivedev.pages.CreateContactPage;
import interactivedev.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by HooT on 27.06.2015.
 */
public class ContactSteps extends ScenarioSteps{
    MainPage mainPage;
    CreateContactPage createContactPage;

    @Step
    public void openMainPage(){
        mainPage.open();
    }

    @Step
    public void clickCreateButton(){
        mainPage.clickCreateNewContactButton();
    }

    @Step
    public void fillInForm(String title, String email, String phone){
        createContactPage.fillForm(title,email,phone);
    }

    @Step
    public void submitForm() {
        createContactPage.submitForm();
    }

    @Step
    public void isContactPresent(String title) {
        mainPage.isContactWithTitlePresent(title);
    }
}

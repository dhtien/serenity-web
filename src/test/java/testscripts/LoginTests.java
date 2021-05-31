package testscripts;


import base.AbstractTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import web.question.companies.LoginDetail;
import web.tasks.login.Login;
import web.ui.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class LoginTests extends AbstractTest {

    Actor adminUser = Actor.named("Tien");

    @Managed
    private WebDriver driver;

    @Before
    public void admin_user_browse_the_web() {
        adminUser.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void create_company_test() {
        givenThat(adminUser).attemptsTo(Open.browserOn().the(LoginPage.class));
        when(adminUser).attemptsTo(Login.withCredential("demo", "demo"));
        then(adminUser).should(seeThat(LoginDetail.displayedOfSuccessfulLogin(), Matchers.is("Login Successfully")));
    }
}

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
import web.menu.OnTheMenu;
import web.question.companies.CompanyDetail;
import web.tasks.companies.CreateCompany;
import web.tasks.login.Login;
import web.ui.CompaniesPage;
import web.ui.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class CompaniesTests extends AbstractTest {

    Actor adminUser = Actor.named("tobias");

    @Managed
    private WebDriver driver;

    @Before
    public void admin_user_browse_the_web() {
        adminUser.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void create_company_test() {
        givenThat(adminUser).attemptsTo(Open.browserOn().the(LoginPage.class));
        and(adminUser).has(Login.withCredential("admin@vmodev.com", "SuperSecretKeyPassword1"));
        when(adminUser).attemptsTo(OnTheMenu.clickOnCompany(),
                CreateCompany.withName("Auto Test C1ompany"));
        then(adminUser).should(seeThat(CompanyDetail.displayedOfHeading(), Matchers.is(true)));
    }
}

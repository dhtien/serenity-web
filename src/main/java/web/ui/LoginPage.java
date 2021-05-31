package web.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("page:login.url")
public class LoginPage extends PageObject {
    public static final Target EMAIL_INPUT = Target.the("Email field").locatedBy("//input[@name='userName']");
    public static final Target PASS_INPUT = Target.the("Password field").locatedBy("//input[@name='password']");
    public static final Target SUBMIT_LOGIN = Target.the("Login button").locatedBy("//input[@name='submit']");
    public static final Target LOGIN_HEADING = Target.the("Login message").locatedBy("//h3");
}
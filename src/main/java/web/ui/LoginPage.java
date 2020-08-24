package web.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("page:login.url")
public class LoginPage extends PageObject {
    public static final Target EMAIL_INPUT = Target.the("Email field").locatedBy("//input[@type='email']");
    public static final Target PASS_INPUT = Target.the("Password field").locatedBy("//input[@type='password']");
    public static final Target SUBMIT_LOGIN = Target.the("Login button").locatedBy("//button[@type='submit']");

}

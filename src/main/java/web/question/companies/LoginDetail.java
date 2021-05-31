package web.question.companies;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static web.ui.LoginPage.LOGIN_HEADING;

public class LoginDetail {
    public static Question<String> displayedOfSuccessfulLogin() {
        return actor -> {
            WaitUntil.the(LOGIN_HEADING, isVisible());
            return Text.of(LOGIN_HEADING).viewedBy(actor).asString();
        };
    }
}

package web.question.companies;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static web.ui.CompaniesPage.COMPANY_HEADING;

public class CompanyDetail {
    public static Question<Boolean> displayedOfHeading() {
        return actor -> {
            WaitUntil.the(COMPANY_HEADING, isVisible());
            return Visibility.of(COMPANY_HEADING).viewedBy(actor).asBoolean();
        };
    }
}

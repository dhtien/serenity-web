package web.menu;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static web.ui.MenuBarPage.COMPANIES_MENU;
import static web.ui.MenuBarPage.MENU_BAR;

public class CompanyMenu implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(JavaScriptClick.on(MENU_BAR));
        t.attemptsTo(Click.on(COMPANIES_MENU));
    }
}

package web.tasks.companies;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static web.ui.CompaniesPage.*;

public class CreateCompany {


    public static Task withName(String comapnyName) {
        return Task.where("{0} create company name #comapnyName",
                Click.on(CREATE_BUTTON),
                Enter.theValue(comapnyName).into(COMAPNY_NAME_INPUT),
                Click.on(SAVE_BUTTON));
    }
}

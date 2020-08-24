package web.menu;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OnTheMenu {

    public static CompanyMenu clickOnCompany(){
        return instrumented(CompanyMenu.class);
    }
}

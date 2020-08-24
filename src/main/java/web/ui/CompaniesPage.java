package web.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:companies.url")
public class CompaniesPage extends PageObject {
    public static final Target CREATE_BUTTON = Target.the("Create company button").locatedBy("//span[text()='+ CREATE']/parent::button");
    public static final Target COMAPNY_NAME_INPUT = Target.the("Company name field").locatedBy("//label[text()='Name']//following::div/input");
    public static final Target SAVE_BUTTON = Target.the("Save change company").locatedBy("//span[text()='SAVE CHANGES']/parent::button");
    public static final Target COMPANY_HEADING = Target.the("Save change company").locatedBy("//h1[text()='Company Details']");

}

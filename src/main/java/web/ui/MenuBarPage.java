package web.ui;

import net.serenitybdd.screenplay.targets.Target;

public class MenuBarPage {
    public static final Target MENU_BAR = Target.the("menu bar").locatedBy("//div[@class='menu']/img");
    public static final Target COMPANIES_MENU = Target.the("companies menu bar").locatedBy("//a[text()='Companies']");

}

package net.serenitybdd.demos.todos.saucelabsdemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SauceLabsHomePage extends PageObject {
    public static final Target APP_LOGO = Target.the("app logo").locatedBy("//div[@class = 'app_logo']");
    //public static final Target PRODUCTS = Target.the("products").locatedBy("//span[@class='title']");
}
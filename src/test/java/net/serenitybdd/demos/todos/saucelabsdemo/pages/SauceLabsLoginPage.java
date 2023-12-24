package net.serenitybdd.demos.todos.saucelabsdemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SauceLabsLoginPage extends PageObject {

    public static final Target USER_INPUT = Target.the("username").locatedBy("//input[@id='user-name']");
    public static final Target PASSWORD_INPUT = Target.the("password").locatedBy("//input[@id='password']");
    public static final Target LOGIN_BUTTON = Target.the("login button").locatedBy("//input[@id='login-button']");
    public static final Target LOGIN_LOGO = Target.the("login logo").locatedBy("//div[@class = 'login_logo']");
}

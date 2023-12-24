package net.serenitybdd.demos.todos.saucelabsdemo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.demos.todos.saucelabsdemo.pages.SauceLabsLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AccessToSauceDemo implements Task {

    public AccessToSauceDemo(String username, String password){
        this.username = username;
        this.password = password;
    }


    private String username;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(username).into(SauceLabsLoginPage.USER_INPUT).thenHit(Keys.TAB));
        actor.attemptsTo(Enter.theValue(password).into(SauceLabsLoginPage.PASSWORD_INPUT).thenHit(Keys.TAB));
        actor.attemptsTo(Click.on(SauceLabsLoginPage.LOGIN_BUTTON));
    }

    public static Task withCredentials(String username, String password){
        return Instrumented.instanceOf(AccessToSauceDemo.class).withProperties(username, password);
    }
}
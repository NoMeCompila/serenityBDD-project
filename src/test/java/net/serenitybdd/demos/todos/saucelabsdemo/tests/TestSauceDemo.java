package net.serenitybdd.demos.todos.saucelabsdemo.tests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.demos.todos.browserstack.model.DashboardInformation;
import net.serenitybdd.demos.todos.browserstack.questions.Dashboard;
import net.serenitybdd.demos.todos.browserstack.tasks.LoginToBstack;
import net.serenitybdd.demos.todos.saucelabsdemo.tasks.AccessToSauceDemo;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestSauceDemo {
    private Actor demoUser = Actor.named("standard_user");

    @Managed
    private WebDriver hisBrowser;

    @BeforeEach
    public void demoUserCanBrowseTheWeb(){
        demoUser.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    @WithTag("sauceDemo")
    public void browseTheWebAsDemoUser() {
        demoUser.attemptsTo(Open.browserOn().thePageNamed("pages.sauceDemo"));
        givenThat(demoUser).attemptsTo(AccessToSauceDemo.withCredentials("standard_user", "secret_sauce"));

        then(demoUser).should(seeThat(Dashboard.information(),
                displays("title", equalTo("Swag Labs")))
        );
    }
}
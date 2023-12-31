package net.serenitybdd.demos.todos.saucelabsdemo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.demos.todos.browserstack.questions.Dashboard;
import net.serenitybdd.demos.todos.saucelabsdemo.tasks.AccessToSauceDemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CucumberSauceDemo {
    private Actor demoUser = Actor.named("demmo user");

    @Managed
    private WebDriver hisBrowser;

    @Given("^dado que ingreso a la web de sauce demo$")
    public void dadoQueIngresoALaWebDeSauceDemo() {
        demoUser.can(BrowseTheWeb.with(hisBrowser));
        givenThat(demoUser)
                .attemptsTo(Open.browserOn()
                        .thePageNamed("pages.sauceDemo"));
    }
    @When("^ingreso usuario (.*) contrasenia (.*) y presiono el boton login$")
    public void ingresoLasCredencialesYPresionoElBotonLogin(String user, String pass) {
        when(demoUser)
                .attemptsTo(AccessToSauceDemo.withCredentials(user, pass));
    }
    @Then("^verifico el titulo de la web$")
    public void verificoElTituloDeLaWeb() {
        then(demoUser)
                .should(seeThat(Dashboard.information(),
                        displays("title", equalTo("Swag Labs"))));
    }
}
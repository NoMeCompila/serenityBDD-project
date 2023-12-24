package net.serenitybdd.hoteles.tests;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.demos.todos.browserstack.questions.Dashboard;
import net.serenitybdd.hoteles.pages.HotelesHome;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValueIntoElement;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import java.security.PrivilegedAction;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.questions.targets.TheTarget.textOf;
import static org.hamcrest.Matchers.equalTo;


@RunWith(SerenityRunner.class)
public class HotelesTest {
    Actor actor;
    private HotelesHome hotelesHome;

    public HotelesHome getHotelesHome() {
        return hotelesHome;
    }

    //ul//li[@data-index='0']
    ////button[@data-stid='destination_form_field-menu-trigger']
    ////input[@id='destination_form_field']
    @Managed
    WebDriver browser;

    @Before
    public void setUp(){
        actor = Actor.named("Fer");
        actor.whoCan(BrowseTheWeb.with(browser));
    }

    @Test
    public void completeForm() throws InterruptedException {

        actor.attemptsTo(Open
                .browserOn()
                .thePageNamed("pages.hoteles"));

        //then(actor).should(seeThat(textOf(getHotelesHome().getTitulo()), equalTo("¿A dónde vas?")));

        actor.attemptsTo(Click
                .on(getHotelesHome().getBotonDestino()));

        actor.attemptsTo(Enter
                .theValue("San Carlos de Bariloche, Río Negro, Argentina")
                .into(getHotelesHome().getTextoDestino())
                .thenHit(Keys.ENTER));

//        actor.attemptsTo(Enter
//                .theValue("San Carlos de Bariloche, Río Negro, Argentina")
//                .into(TXT_DESTINO)
//                .thenHit(Keys.TAB)
//                .thenHit(Keys.TAB)
//                .thenHit(Keys.ENTER));



        //actor.attemptsTo(Click.on(FIRST_OPTION));
        //Thread.sleep(3000);
    }
}

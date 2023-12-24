package net.serenitybdd.demos.todos.saucelabsdemo.questions;

import net.serenitybdd.demos.todos.saucelabsdemo.model.HomeInformation;
import net.serenitybdd.demos.todos.saucelabsdemo.pages.SauceLabsHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

import java.util.stream.Stream;

public class HomeQuestion implements Question<HomeInformation> {

    @Override
    public HomeInformation answeredBy(Actor actor){
        String appLogo = BrowseTheWeb.as(actor).getTitle();
        //String products = Text.of(SauceLabsHomePage.APP_LOGO).answeredBy(actor);

        return new HomeInformation(appLogo);
    }

    public static HomeQuestion information(){
        return new HomeQuestion();
    }
}

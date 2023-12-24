package net.serenitybdd.hoteles.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.hoteles.pages.HotelesHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class BookingDataTask implements Task {

    private String destiny;
    private HotelesHome hotelesHome;

    public HotelesHome getHotelesHome(){
        return this.hotelesHome;
    }

    public BookingDataTask(String destiny){
        this.destiny = destiny;
    }

    public String getDestiny(){
        return this.destiny;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click
                .on(getHotelesHome().getBotonDestino()));

        actor.attemptsTo(Enter
                .theValue("San Carlos de Bariloche, Río Negro, Argentina")
                .into(getHotelesHome().getTextoDestino())
                .thenHit(Keys.ENTER));
    }

    public static Task withData(String destiny){
        return Instrumented.instanceOf(BookingDataTask.class).withProperties(destiny);
    }
}

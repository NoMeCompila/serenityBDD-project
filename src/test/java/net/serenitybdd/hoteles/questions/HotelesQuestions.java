package net.serenitybdd.hoteles.questions;

import com.vladsch.flexmark.ext.tables.TableExtractingVisitor;
import net.serenitybdd.hoteles.models.HotelesInformation;
import net.serenitybdd.hoteles.pages.HotelesHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

public class HotelesQuestions implements Question<HotelesInformation> {

    private HotelesHome hotelesHome;
    public HotelesHome getHotelesHome(){
        return this.hotelesHome;
    }

    @Override
    public HotelesInformation answeredBy(Actor actor) {

        String titulo = Text
                .of(getHotelesHome().getTitulo())
                .answeredBy(actor);

        return new HotelesInformation(titulo);
    }

    public static HotelesQuestions information(){
        return new HotelesQuestions();
    }
}

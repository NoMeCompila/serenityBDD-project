package net.serenitybdd.hoteles.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HotelesHome extends PageObject {
    private  Target botonDestino = net.serenitybdd.screenplay.targets.Target
            .the("boton de busqueda de destino")
            .locatedBy("//button[@data-stid='destination_form_field-menu-trigger']");

    private Target textoDestino = net.serenitybdd.screenplay.targets.Target
            .the("caja de bsuqueda de destino")
            .locatedBy("//input[@id='destination_form_field']");

    private Target titulo = Target
            .the("Titulo de la página")
            .locatedBy("//div[@class='uitk-spacing SimpleContainer']//h1");

    //    private static final net.serenitybdd.screenplay.targets.Target FIRST_OPTION = net.serenitybdd.screenplay.targets.Target
    //            .the("primer elemento")
    //            .locatedBy("//ul//li[@data-index='0']//div[@class='uitk-typeahead-result-item-container']");

    public Target getBotonDestino() {
        return this.botonDestino;
    }

    public Target getTextoDestino(){
        return this.textoDestino;
    }

    public Target getTitulo(){
        return this.titulo;
    }
}
package co.com.sofka.pruebapractica.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class DevolverMarco implements Interaction {

    public static DevolverMarco con() {
        return Tasks.instrumented(DevolverMarco.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().parentFrame();
    }
}

package co.com.sofka.pruebapractica.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;


public class CambiarDeMarco implements Interaction {
    private Target target;

    public CambiarDeMarco(Target target) {
        this.target = target;
    }

    public static CambiarDeMarco con(Target target) {
        return Tasks.instrumented(CambiarDeMarco.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().frame(target.resolveFor(actor));
    }
}

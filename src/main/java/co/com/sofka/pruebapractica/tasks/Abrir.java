package co.com.sofka.pruebapractica.tasks;

import co.com.sofka.pruebapractica.userinterface.AbrirNavegadorPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task {
    private AbrirNavegadorPagina abrirNavegadorPagina;

    public static Abrir elNavegador() {
        return Tasks.instrumented(Abrir.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirNavegadorPagina));
    }

}

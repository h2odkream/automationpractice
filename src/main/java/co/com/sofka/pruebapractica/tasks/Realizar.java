package co.com.sofka.pruebapractica.tasks;

import co.com.sofka.pruebapractica.interaction.DevolverMarco;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.pruebapractica.userinterface.RealizarLaCompraPagina.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Realizar implements Task {
    public static Realizar laCompra() {
        return Tasks.instrumented(Realizar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DevolverMarco.con(),
                WaitUntil.the(PROCEDER_CON_PAGO,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PROCEDER_CON_PAGO),
                Click.on(PROCEDER_CON_PAGO_1 ),
                Click.on(PROCEDER_CON_PAGO_2 ),
                Click.on(TERMINOS ),
                Click.on(PROCEDER_CON_PAGO_3 ),
                Click.on(MEDIO_PAGO ),
                Click.on(CONFIRMAR_PAGO ),
                Scroll.to(MENSAJE_COMPRA_EXITOSA)
        );
    }
}

package co.com.sofka.pruebapractica.tasks;

import co.com.sofka.pruebapractica.interaction.CambiarDeMarco;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.pruebapractica.userinterface.ComprarProductosPage.*;
import static co.com.sofka.pruebapractica.util.Constantes.TALLAJE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDelCatalogo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_MUJER),
                Click.on(CATEGORIA_TOP),
                Click.on(PRENDA),
                Click.on(PRENDA_ENTRAR),
                CambiarDeMarco.con(IFRAME),
                Click.on(TIPO_COLOR),
                Click.on(CANTIDAD_PRENDA),
                SelectFromOptions.byVisibleText(TALLAJE).from(TALLA),
                Click.on(AGREGAR_CARRITO));

    }

    public static SeleccionarDelCatalogo losProductos() {
        return instrumented(SeleccionarDelCatalogo.class);
    }
}

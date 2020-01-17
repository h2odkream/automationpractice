package co.com.sofka.pruebapractica.tasks;

import co.com.sofka.pruebapractica.model.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static co.com.sofka.pruebapractica.userinterface.IniciarSesionPage.*;
import static co.com.sofka.pruebapractica.util.Constantes.CERO;

public class IniciarSesion implements Task {
    private List<DatosUsuario> datosUsuario;

    public IniciarSesion(List<DatosUsuario> datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    public static IniciarSesion con(List<DatosUsuario> datosUsuario) {
        return Tasks.instrumented(IniciarSesion.class, datosUsuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INICIAR_SESION),
                Scroll.to(USUARIO),
                Enter.theValue(datosUsuario.get(CERO).getUsuario()).into(USUARIO),
                Enter.theValue(datosUsuario.get(CERO).getContrasena()).into(CONTRASENA),
                Click.on(BTN_INICIAR_SESION)
        );

    }
}

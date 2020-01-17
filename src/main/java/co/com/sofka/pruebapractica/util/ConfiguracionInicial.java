package co.com.sofka.pruebapractica.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ConfiguracionInicial {
    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());

    }
}

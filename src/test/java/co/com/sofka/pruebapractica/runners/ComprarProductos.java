package co.com.sofka.pruebapractica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static co.com.sofka.pruebapractica.util.Constantes.COMPRAR_PRODUCTOS;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = COMPRAR_PRODUCTOS,
        glue={"co.com.sofka.pruebapractica.stepdefinitions","co.com.sofka.pruebapractica.util"},
        snippets = SnippetType.CAMELCASE)

public class ComprarProductos {
}

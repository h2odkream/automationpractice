package co.com.sofka.pruebapractica.stepdefinitions;


import co.com.sofka.pruebapractica.exceptions.CompraNoExitosaException;
import co.com.sofka.pruebapractica.model.DatosUsuario;
import co.com.sofka.pruebapractica.questions.LaCompraRealizada;
import co.com.sofka.pruebapractica.tasks.Abrir;
import co.com.sofka.pruebapractica.tasks.IniciarSesion;
import co.com.sofka.pruebapractica.tasks.Realizar;
import co.com.sofka.pruebapractica.tasks.SeleccionarDelCatalogo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static co.com.sofka.pruebapractica.exceptions.CompraNoExitosaException.MENSAJE_COMPRA_NO_EXITOSA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarProductosStepDefinitions {

    @Dado("^que karen ingresa a la pagina automation practice$")
    public void queKarenIngresaALaPaginaAutomationPractice(List<DatosUsuario> datosUsuario)  {
        theActorCalled("karen").wasAbleTo(Abrir.elNavegador()
        , IniciarSesion.con(datosUsuario)
        );

    }

    @Cuando("^agrego los productos al carrito y realizo la compra$")
    public void agregoLosProductosAlCarritoYRealizoLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarDelCatalogo.losProductos(),
                Realizar.laCompra()
        );
    }

    @Entonces("^verificar que compra fue exitosa(.*)$")
    public void verificarCompraExitosa(String msgEsperado) {
       theActorInTheSpotlight().
                should(seeThat(LaCompraRealizada.tieneElMensaje(msgEsperado)).  orComplainWith(CompraNoExitosaException.class, MENSAJE_COMPRA_NO_EXITOSA)
                );


    }

}

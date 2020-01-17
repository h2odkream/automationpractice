package co.com.sofka.pruebapractica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.sofka.pruebapractica.userinterface.RealizarLaCompraPagina.MENSAJE_COMPRA_EXITOSA;


public class LaCompraRealizada implements Question<Boolean> {

    private String msgEsperado;

    private LaCompraRealizada(String msgEsperado) {
        this.msgEsperado = msgEsperado;
    }

    public static LaCompraRealizada tieneElMensaje(String esperado) {
        return new LaCompraRealizada(esperado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return msgEsperado.trim().equals(Text.of(MENSAJE_COMPRA_EXITOSA).viewedBy(actor).asString().trim());
    }
}

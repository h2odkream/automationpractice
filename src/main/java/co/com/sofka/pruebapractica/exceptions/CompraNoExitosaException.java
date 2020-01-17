package co.com.sofka.pruebapractica.exceptions;

public class CompraNoExitosaException extends AssertionError {

    public static final String MENSAJE_COMPRA_NO_EXITOSA ="La compra no fue exitosa";

    public CompraNoExitosaException(String mensaje, Throwable causa){
        super(mensaje,causa);
    }

}

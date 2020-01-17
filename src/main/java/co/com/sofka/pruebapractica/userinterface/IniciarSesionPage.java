package co.com.sofka.pruebapractica.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionPage {
    public static final Target INICIAR_SESION = Target.the("Boton iniciar sesion").locatedBy(("//a[@class='login']"));
    public static final Target USUARIO = Target.the("Campo usuario").locatedBy("//input[@id='email']");
    public static final Target CONTRASENA = Target.the("Campo contraseña").locatedBy("//input[@id='passwd']");
    public static final Target BTN_INICIAR_SESION = Target.the("Boton iniciar sesion").locatedBy("//p[@class='submit']//span[1]");
    public static final Target INFO_CUENTA = Target.the("Contiene informacion de la cuenta").locatedBy("//p[@class='info-account']");

    private IniciarSesionPage() {
    }
}

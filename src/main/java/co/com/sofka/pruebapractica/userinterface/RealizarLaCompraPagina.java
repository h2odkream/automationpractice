package co.com.sofka.pruebapractica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RealizarLaCompraPagina {
    public static final Target PROCEDER_CON_PAGO = Target.the("Boton para validar productos").located(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
    public static final Target PROCEDER_CON_PAGO_1 = Target.the("Boton de pago uno").located(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]"));
    public static final Target PROCEDER_CON_PAGO_2 = Target.the("Boton de pago dos").located(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]"));
    public static final Target TERMINOS = Target.the("Terminos y condiciones").located(By.id("cgv"));
    public static final Target PROCEDER_CON_PAGO_3 = Target.the("Boton de pago tres").located(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"));
    public static final Target MEDIO_PAGO = Target.the("Medio de pago").locatedBy("//a[@class='bankwire']");
    public static final Target CONFIRMAR_PAGO = Target.the("Confirmar pago").locatedBy("//span[contains(text(),'I confirm my order')]");
    public static final Target MENSAJE_COMPRA_EXITOSA = Target.the("Mensaje compra exitosa").locatedBy("//strong[contains(text(),'Your order on My Store is complete.')]");

    private RealizarLaCompraPagina() {
    }
}

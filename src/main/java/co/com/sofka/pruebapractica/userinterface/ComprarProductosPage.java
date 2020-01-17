package co.com.sofka.pruebapractica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarProductosPage {

    public static final Target OPCION_MUJER = Target.the("Tipo de ropa femenina").locatedBy("//a[@class='sf-with-ul'][contains(text(),'Women')]");
    public static final Target CATEGORIA_TOP = Target.the("Categoria top").locatedBy("//div[@id='categories_block_left']//li[1]//span[1]");
    public static final Target PRENDA = Target.the("Tipo de prenda a escoger").locatedBy("//div[@class='block_content']//ul//a[contains(text(),'T-shirts')]");
    public static final Target PRENDA_ENTRAR= Target.the("Tipo de prenda a escoger").locatedBy("(//img[@class='replace-2x img-responsive'])[2]");
    public static final Target IFRAME = Target.the("Escoger el color de la prenda").locatedBy("//iframe[@class='fancybox-iframe']");
    public static final Target TIPO_COLOR = Target.the("Escoger el color de la prenda").locatedBy("//a[@id='color_14']");
    public static final Target CANTIDAD_PRENDA = Target.the("Cantidad de prenda a escoger").locatedBy("//a[@class='btn btn-default button-plus product_quantity_up']//span");
    public static final Target TALLA = Target.the("Escoge talla del catalogo de talla").located(By.id("group_1"));
    public static final Target AGREGAR_CARRITO = Target.the("Escoge talla del catalogo de talla").located(By.name("Submit"));

    private ComprarProductosPage() {
    }
}

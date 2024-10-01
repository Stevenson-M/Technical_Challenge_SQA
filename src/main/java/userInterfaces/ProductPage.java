package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ProductPage extends PageObject {

    public static final Target BTN_ADD_PRODUCT_QUANTITY = Target.the("Add product quantity")
            .locatedBy("//div[@class='comet-v2-input-number-btn comet-v2-input-number-btn-increase']\n");

    public static final Target BTN_ADD_TO_CART = Target.the("Add product to the shopping cart")
            .locatedBy("//span[text()='Añadir a la cesta']");

    public static final Target BTN_GO_TO_SHOPPING_CART = Target.the("Go to the shopping cart")
            .locatedBy("//a[@class='cart-summary-tocart']");

}

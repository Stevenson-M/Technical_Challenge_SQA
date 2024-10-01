package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject {

    public static final Target PRODUCT_QUANTITY = Target.the("Product quantity")
            .locatedBy("//input[@class='comet-v2-input-number-input']\n");

    public static final Target PRODUCT_TOTAL_PRICE = Target.the("Product price")
            .locatedBy("//span[@data-spm-anchor-id='a2g0o.cart.0.i11.68e27a9dJVcqbI']\n");
}

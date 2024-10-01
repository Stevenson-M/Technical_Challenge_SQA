package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class HomePage extends PageObject {

    public static final Target SEARCH_INPUT = Target.the("Search input")
            .locatedBy("//input[@id='search-words']");
    public static final Target RANDOM_PRODUCT_CART = Target.the("boton de carrito programado para escoger producto al azar")
            .locatedBy("//div[@class='multi--shopCart--darm7xs multi--shopLtr--1kiOXiJ multi--shopCartImage--2DX88PV']");
}

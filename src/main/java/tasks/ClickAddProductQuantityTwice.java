package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static userInterfaces.ProductPage.BTN_ADD_PRODUCT_QUANTITY;

public class ClickAddProductQuantityTwice implements Task {

    public static ClickAddProductQuantityTwice twice() {
        return new ClickAddProductQuantityTwice();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADD_PRODUCT_QUANTITY),
                Click.on(BTN_ADD_PRODUCT_QUANTITY)
        );
    }
}
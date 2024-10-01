package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userInterfaces.ShoppingCartPage.*;

public class ProductDetails implements Question<Boolean> {

    private final String expectedQuantity;
    private final String expectedPrice;

    public ProductDetails(String expectedQuantity, String expectedPrice) {
        this.expectedQuantity = expectedQuantity;
        this.expectedPrice = expectedPrice;
    }

    public static ProductDetails are(String expectedQuantity, String expectedPrice) {
        return new ProductDetails(expectedQuantity, expectedPrice);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String actualQuantity = Text.of(PRODUCT_QUANTITY).answeredBy(actor);
        String actualPrice = Text.of(PRODUCT_TOTAL_PRICE).answeredBy(actor);
        return actualQuantity.equals(expectedQuantity) && actualPrice.equals(expectedPrice);
    }
}
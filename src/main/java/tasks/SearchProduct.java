package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterfaces.HomePage.*;

public class SearchProduct implements Task {

    private final String searchTerm;

    public SearchProduct(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public static SearchProduct withTerm(String searchTerm) {
        return new SearchProduct(searchTerm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Switch.toDefaultContext(),
                WaitUntil.the(SEARCH_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(searchTerm).into(SEARCH_INPUT),
                Enter.keyValues(Keys.ENTER).into(SEARCH_INPUT)

        );
    }
}

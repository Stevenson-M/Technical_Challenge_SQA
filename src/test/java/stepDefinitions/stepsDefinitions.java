package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import questions.ProductDetails;
import tasks.OpenWebsite;
import tasks.SearchProduct;
import userInterfaces.HomePage;
import userInterfaces.ProductPage;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static userInterfaces.HomePage.RANDOM_PRODUCT_CART;
import static userInterfaces.ProductPage.BTN_ADD_PRODUCT_QUANTITY;
import static userInterfaces.ProductPage.BTN_ADD_TO_CART;


public class stepsDefinitions {


    private Actor actor = Actor.named("User");

    @Given("User is on the Aliexpress homepage")
    public void userIsOnTheAliexpressHomepage() {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        actor.whoCan(BrowseTheWeb.with(chromeDriver));
        String pageURL = "https://es.aliexpress.com/";
        actor.attemptsTo(OpenWebsite.at(pageURL));
    }

    @When("I search for the product {string}")
    public void iSearchForTheProduct(String productName) {
        actor.attemptsTo(SearchProduct.withTerm(productName));
    }


@And("User add 3 quantities of the product to the cart")
 public void userAddQuantitiesOfTheProductToTheCart() {

    actor.attemptsTo(
            Click.on(RANDOM_PRODUCT_CART),
            Click.on(BTN_ADD_PRODUCT_QUANTITY),
            Click.on(BTN_ADD_PRODUCT_QUANTITY),
            Click.on(BTN_ADD_TO_CART)
    );
}

    @And("go to the shopping cart")
    public void goToTheShoppingCart() {
        actor.attemptsTo(
                Click.on(ProductPage.BTN_GO_TO_SHOPPING_CART )
        );
    }

    @Then("User should see the correct price in the cart")
    public void userShouldSeeTheCorrectPriceInTheCart() {
        String expectedQuantity = "3";
        String expectedPrice = "COP20,336.61";

        actor.should(
                seeThat(ProductDetails.are(expectedQuantity, expectedPrice))
        ); //No lo pude arreglar :c
    }
}




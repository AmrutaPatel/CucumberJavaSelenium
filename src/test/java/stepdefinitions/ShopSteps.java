package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobjects.BasePage;
import pageobjects.HomePage;
import pageobjects.ShopPage;
import products.MatchByTitle;
import products.Products;

public class ShopSteps extends HomePage {

    private HomePage page;
    private BasePage basePage;
    private ShopPage shopPage;
    private Products product;

    public ShopSteps (HomePage page){
        this.page = page;
    }

    @Given("^the user is on Shop page$")
    public void theUserIsOnShopPage() throws Throwable {
        basePage = new BasePage(page.driver);
        shopPage = basePage.clickShop();
    }

    @When("^the user finds the \"([^\"]*)\" product$")
    public void theUserFindsTheProduct(String productTitle) throws Throwable {
        product = shopPage.getProduct(new MatchByTitle(productTitle));
    }

    @Then("^verify that the price is \"([^\"]*)\"$")
    public void verifyThatThePriceIs(String productPrice) throws Throwable {
        Assert.assertEquals("Fluffy Bunny price is correct", Double.parseDouble(productPrice), product.getPrice(),0);
    }

    @When("^the user adds \"([^\"]*)\" to the cart$")
    public void theUserAddsToTheCart(String productTitle) throws Throwable {
        product = shopPage.getProduct(new MatchByTitle(productTitle));
        product.clickBuyButton();
    }

}

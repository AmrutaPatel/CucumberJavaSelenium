package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.BasePage;
import pageobjects.CartPage;
import pageobjects.HomePage;
import pageobjects.ShopPage;
import products.MatchByTitle;
import products.Products;


public class CartSteps extends HomePage {

    private HomePage page;
    private BasePage basePage;
    private CartPage cartPage;
    private Products product;
    private ShopPage shopPage;

    public CartSteps( HomePage page){
        this.page = page;
        basePage = new BasePage(page.driver);
    }

    @Given("^the cart count is \"([^\"]*)\"$")
    public void theCartCountIs(String cartCount) throws Throwable {
        Assert.assertEquals("Cart count is as expected", Integer.parseInt(cartCount), basePage.getCartCount());
    }



    @Then("^verify that the cart count is \"([^\"]*)\"$")
    public void verifyThatTheCartCountIs(String cartCount) throws Throwable {
        Assert.assertEquals("Cart count is as expected", Integer.parseInt(cartCount), basePage.getCartCount());
    }

    @When("^the user is on Cart Page$")
    public void theUserIsOnCartPage() throws Throwable {
       cartPage = basePage.clickCart();
    }

    @And("^the user clicks Empty Cart$")
    public void theUserClicksEmptyCart() throws Throwable {
        cartPage.clickEmptyCart();
    }

    @And("^clicks \"([^\"]*)\" to confirm to empty the cart$")
    public void clicksToConfirmToEmptyTheCart(String confirmation) throws Throwable {
       if (confirmation.equals("yes")) {
           cartPage.clickYesButton();
       }
    }
}

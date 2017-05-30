package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobjects.BasePage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginSteps extends HomePage {

    private HomePage page;
    private BasePage basePage;
    private LoginPage loginPage;
    public LoginSteps(HomePage page){
        this.page = page;
    }

    @Given("^the user is on Login pge$")
    public void theUserIsOnLoginPge() throws Throwable {
        basePage = new BasePage(page.driver);
        loginPage = basePage.clickLogin();
    }

    @When("^the user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void theUserEntersUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        loginPage.setUserName(username);
        loginPage.setPassword(password);
    }

    @And("^the user clicks the Login button$")
    public void theUserClicksTheLoginButton() throws Throwable {
        loginPage.clickLoginButton();
    }

    @Then("^verify that \"([^\"]*)\" error message is displayed$")
    public void verifyThatErrorMessageIsDisplayed(String errMessage) throws Throwable {
        Assert.assertEquals("Error message is displayed", errMessage, loginPage.getErrorMessage());
    }

    @Then("^verify that \"([^\"]*)\" welcome message is displayed$")
    public void verifyThatWelcomeMessageIsDisplayed(String welcomeMessage) throws Throwable {
        Assert.assertEquals("Welcome message is displayed", welcomeMessage, loginPage.getWelcomeMessage());
    }
}

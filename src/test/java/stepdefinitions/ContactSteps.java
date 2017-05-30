package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.BasePage;
import pageobjects.ContactPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class ContactSteps extends HomePage{

    private HomePage page;
    private BasePage basePage;
    private ContactPage contactPage;

    public ContactSteps(HomePage page){
        this.page = page;
    }

    @Given("^the user is on Contact page$")
    public void theUserIsOnContactPage() throws Throwable {
        basePage = new BasePage(page.driver);
        contactPage = basePage.clickContact();
    }

    @When("^the user clicks Submit button$")
    public void theUserClicksSubmitButton() throws Throwable {
        contactPage.clickSubmit();
    }

    @Then("^verify that the following error messages are displayed$")
    public void verifyThatTheFollowingErrorMessagesAreDisplayed(DataTable errMsgsTbl) throws Throwable {
        List<ErrorMessages> errMsgs = new ArrayList<ErrorMessages>();
        errMsgs = errMsgsTbl.asList(ErrorMessages.class);
        for (ErrorMessages errMsg: errMsgs) {
            if (errMsg.fieldname.equals("forename")) {
                org.junit.Assert.assertEquals("Forename required error message is displayed.", errMsg.errormessage, contactPage.getFirstNameError());
            }
            if (errMsg.fieldname.equals("email")) {
                org.junit.Assert.assertEquals("Email required error message is displayed.", errMsg.errormessage, contactPage.getEmailError());
            }
            if (errMsg.fieldname.equals("message")) {
                org.junit.Assert.assertEquals("Message required error message is displayed.", errMsg.errormessage, contactPage.getMessageError());
            }
            if (errMsg.fieldname.equals("telephone")) {
                org.junit.Assert.assertEquals("Please enter a valid telephone number", errMsg.errormessage, contactPage.getTelephoneError());
            }
        }
    }

    @Then("^verify that the following error messages are not displayed$")
    public void verifyThatTheFollowingErrorMessagesAreNotDisplayed(DataTable errMsgsTbl) throws Throwable {
        verifyThatTheFollowingErrorMessagesAreDisplayed(errMsgsTbl);
    }

    @When("^the user enters following values for the fields$")
    public void theUserEntersFollowingValuesForTheFields(DataTable validValuesTbl) throws Throwable {
        List<ValidValues> validVals = new ArrayList<ValidValues>();
        validVals = validValuesTbl.asList(ValidValues.class);
        for (ValidValues validVal: validVals){
            if(validVal.fieldname.equals("forename"))
            {contactPage.setFirstName(validVal.fieldvalue);}
            if(validVal.fieldname.equals("message"))
            {contactPage.setMessage(validVal.fieldvalue);}
            if(validVal.fieldname.equals("telephone"))
            {contactPage.setTelephone(validVal.fieldvalue);}
            if(validVal.fieldname.equals("email"))
            {contactPage.setEmail(validVal.fieldvalue);}
        }
    }

    @Then("^verify that \"([^\"]*)\" message is displayed$")
    public void verifyThatMessageIsDisplayed(String welcomeMsg) throws Throwable {
        org.junit.Assert.assertEquals("Welcome message is displayed", welcomeMsg, contactPage.getSuccessMessage());
    }
}

class ErrorMessages{
     public String fieldname;
     public String errormessage;
     public ErrorMessages(String fieldName, String errorMessage){
         fieldname = fieldName;
         errormessage = errorMessage;
     }
}

class ValidValues{
    public String fieldname;
    public String fieldvalue;
    public ValidValues(String fieldName, String fieldValue){
        fieldname = fieldName;
        fieldvalue = fieldValue;
    }
}

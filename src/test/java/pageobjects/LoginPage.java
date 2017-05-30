package pageobjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//extends BasePage {

    public LoginPage(WebDriver driver){
       // super(driver);
        //this.driver = driver;
        PageFactory.initElements (driver,this);
    }

    @FindBy(id="loginUserName")
    WebElement txtUserName;

    @FindBy(id="loginPassword")
    WebElement txtPassword;

    @FindBy(css="button.btn.btn-primary")
    WebElement btnLogin;

    @FindBy(css="button.btn.btn-cancel")
    WebElement btnCancel;

    @FindBy(id="login-error")
    WebElement errMessage;

    @FindBy(id="nav-user")
    WebElement navigateUser;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/p[1]")
    WebElement msgWelcome;

    public void setUserName(String userName){
        txtUserName.clear();
        txtUserName.sendKeys(userName);
    }

    public void setPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickLoginButton(){
        btnLogin.click();
    }

    public void clickCancelButton(){
        btnCancel.click();
    }

    public String getErrorMessage(){
        try{
            return errMessage.getText();
        }catch(NoSuchElementException e){
            return "";
        }
    }

    public void ClickUser(){
        navigateUser.click();
    }

    public String getWelcomeMessage(){
        try{
            return msgWelcome.getText();
        }catch(NoSuchElementException e){
            return "";
        }
    }
}

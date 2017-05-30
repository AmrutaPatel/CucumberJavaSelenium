package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import static pageobjects.BasePage.driver;


public class ContactPage {

    public ContactPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id= "forename")
    WebElement txtForename;

    @FindBy(id = "surname")
    WebElement txtSurname;

    @FindBy(id = "email")
    WebElement txtEmail;

    @FindBy(id = "telephone")
    WebElement txtTelephone;

    @FindBy(id = "message")
    WebElement txtMessage;

   // @FindBy(css = "body > div.container-fluid > div > form > div > a")
    @FindBy(linkText = "Submit")
//    WebElement btnSubmit;
    By btnSubmit;

    @FindBy(id= "forename-err")
    WebElement errForeName;

    @FindBy(id = "email-err")
    WebElement errEmail;

    @FindBy(id = "telephone-err")
    WebElement errTelephone;

    @FindBy(id = "message-err")
    WebElement errMessage;

    @FindBy(xpath = "html/body/div[2]/div/a")
    WebElement btnGoBack;

    @FindBy(css =".alert-success")
    WebElement msgSuccess;

    public String getFirstNameError(){
        return (elementExists(errForeName)) ? errForeName.getText() : "";
    }
    public String getEmailError(){
        return (elementExists(errEmail)) ? errEmail.getText() : "";
    }
    public String getTelephoneError(){
        return (elementExists(errTelephone)) ? errTelephone.getText() : "";
    }
    public String getMessageError(){
        return (elementExists(errMessage)) ? errMessage.getText() : "";
    }
    public void setFirstName(String name){
        txtForename.clear();
        txtForename.sendKeys(name);
    }
    public void setLastName(String name){
        txtSurname.clear();
        txtSurname.sendKeys(name);
    }
    public void setEmail(String email){
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }
    public void setTelephone (String phone){
        txtTelephone.clear();
        txtTelephone.sendKeys(phone);
    }
    public void setMessage (String msg){
        txtMessage.clear();
        txtMessage.sendKeys(msg);
    }
//    public void clickSubmit(){
//        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
//        //   btnSubmit.click();
//         driver.findElement(btnSubmit).click();
//         driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);
//    }

    public WebElement getSubmitElement() {
        return driver.findElement(By.linkText("Submit"));
      }

    public void clickSubmit() {
        this.getSubmitElement().click();
    }

    public void clickGoBack(){
        btnGoBack.click();
    }

    public String getSuccessMessage(){
        (new WebDriverWait(driver, 60))
                .until(ExpectedConditions.elementToBeClickable(msgSuccess));
        return msgSuccess.getText();
    }

    public boolean elementExists(WebElement ele){
        try{
            ele.isDisplayed();
            return true;
        }catch(NoSuchElementException e){
            return false;
        }
    }
}

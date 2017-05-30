package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {

    private String mainWindowHandle;
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        mainWindowHandle = getMainWindowHandle();
    }

    @FindBy(linkText = "Empty Cart")
    WebElement btnEmptyCart;

    @FindBy(linkText ="Yes")
    WebElement btnEmptyCartYes;

    @FindBy(className = "btn.btn-cancel.btn-danger")
    WebElement btnEmptyCartNo;

    private String getMainWindowHandle(){
        return BasePage.driver.getWindowHandle();
    }

    private  String getPopUpWindownHandle(){
        return BasePage.driver.getWindowHandle();
    }

    private void switchWindow(String switchToWindow){
        BasePage.driver.switchTo().window(switchToWindow);
    }

    public void clickEmptyCart(){
        btnEmptyCart.click();
    }

    public void clickYesButton(){
        String switchToPopUpWindow = getPopUpWindownHandle();
        switchWindow(switchToPopUpWindow);
        btnEmptyCartYes.click();
        switchWindow(mainWindowHandle);
    }

}

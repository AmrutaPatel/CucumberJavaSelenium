package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import products.Products;

public class BasePage {

    protected static WebDriver driver;
    public BasePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //variables
    @FindBy(id = "nav-home")
    public WebElement linkHome;

    @FindBy(id = "nav-shop")
    public WebElement linkShop;

    @FindBy(id = "nav-contact")
    public WebElement linkContact;

    @FindBy(id = "nav-login")
    public WebElement linkLogin;

    @FindBy(id = "nav-cart")
    public WebElement linkCart;

    @FindBy(className = "cart-count")
    public WebElement cartCount;

    //Login Page
    public LoginPage clickLogin(){
        linkLogin.click();
        return new LoginPage(this.driver);
    }

    //Home Page
//    public HomePage ClickHome(){
//        linkHome.click();
//        return new HomePage(this.driver);
//    }

    //Products Page
    public ShopPage clickShop(){
        linkShop.click();
        return new ShopPage(this.driver);
    }

    //Contact Page
    public ContactPage clickContact(){
        linkContact.click();
        return new ContactPage(this.driver);
    }

    public CartPage clickCart(){
        linkCart.click();
        return new CartPage(this.driver);
    }

    public int getCartCount(){
        return  Integer.parseInt(cartCount.getText());
    }

}

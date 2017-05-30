package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import products.IMatchStrategy;
import products.Products;

import java.lang.ref.WeakReference;
import java.util.List;


public class ShopPage {

    public ShopPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "product")
    List<WebElement> productElements;

    public Products getProduct(IMatchStrategy strategy) throws Exception{
        for (WebElement element : productElements){
            Products product = new Products(element);
            if (strategy.matchProduct(product)){
                return product;
            }
        }
        throw new Exception("No product found");
    }

}

package products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Products {
    private WebElement element;

    public Products(WebElement element) {
        this.element = element;
    }

    public String getTitle(){
        return element.findElement(By.className("product-title")).getText();
    }

    public Double getPrice(){
        return Double.parseDouble(element.findElement(By.className("product-price")).getText().replace("$", ""));
    }

    public void clickBuyButton(){
        element.findElement(By.className("btn-success")).click();
    }
}


//    public Products(WebDriver driver){
//        PageFactory.initElements(driver, this);
//    }
//    @FindBy(className = "product-title")
//    WebElement productTitle;
//    @FindBy(className = "product-price")
//    WebElement productPrice;
//    @FindBy(className = "btn-success")
//    WebElement btnBuy;
//    public String getTitle(){
//        return productTitle.getText();
//    }
//    public Double getPrice(){
//        return Double.parseDouble(productPrice.getText().replace("$",""));
//    }
//    public void clickBuyButton(){
//        btnBuy.click();
//    }
package stepdefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.HomePage;

import java.util.concurrent.TimeUnit;

public class Hook extends HomePage {

    private HomePage page;

    public Hook(HomePage page){
        this.page = page;
    }

    @Before
    public void InitialiseTest(){
        System.out.println("Open browser here .... ");
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\drivers\\chromedriver.exe");
        page.driver = new ChromeDriver();
        page.driver.navigate().to("http://jupiter.cloud.planittesting.com");
        page.driver.manage().window().maximize();
        page.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void TearDownTest(){
        System.out.println("Close browser here .... ");
        page.driver.quit();
    }

}

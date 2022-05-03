import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static java.lang.Thread.sleep;

public class TestInit {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void sleep(int secconds){
        try {
            sleep(secconds * 1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @AfterMethod
    public void after(){
        driver.quit();
    }

    public void openUrl(String site){
        driver.get(site);
    }
}



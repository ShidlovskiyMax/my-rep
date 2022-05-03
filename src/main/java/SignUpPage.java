import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
    public SignUpPage (WebDriver driver){
        super(driver);
    }

    public WebElement inputEmailBtn() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    }

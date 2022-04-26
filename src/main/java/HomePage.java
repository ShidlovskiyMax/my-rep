import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage  extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }
    public WebElement getGotIt() {
       return driver.findElement(By.xpath("//button[contains(text(), 'Got it')]"));
    }
    public WebElement getSingIn() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }
    public WebElement getMyAccount() {
        return driver.findElement(By.xpath("//a[@id='menu-my-account']"));
    }
}

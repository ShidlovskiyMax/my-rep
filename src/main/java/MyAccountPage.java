import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage  extends BasePage{
    public MyAccountPage(WebDriver driver) {super(driver);
    }
    public WebElement getDeleteAccount() {
        return driver.findElement(By.xpath("//a[@role='button' and text()='Delete Account']"));
    }
    public WebElement getDeleteYourAccount() {
        return driver.findElement(By.xpath("//a[(text()='Yes')]"));
    }
    public WebElement getAccountBeenDeleted() {
        return driver.findElement(By.xpath("//a[(text()='Okay')]"));
    }
    public WebElement getSignOut() {
        return driver.findElement(By.xpath("//a[@id='signout']"));
    }
}

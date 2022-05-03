import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage extends BasePage {
    public CreateAccountPage(WebDriver driver){
        super(driver);
    }

    public WebElement getYourName() {
        return driver.findElement(By.xpath("//input [@id='ap_customer_name']"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.xpath("//input [@id='ap_email']"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//input [@id='ap_password']"));

    }

    public WebElement getPasswordCheck() {
        return driver.findElement(By.xpath("//input [@id='ap_password_check']"));
    }

    public WebElement getContinue() {
        return driver.findElement(By.xpath("//input [@id='continue']"));
    }
}

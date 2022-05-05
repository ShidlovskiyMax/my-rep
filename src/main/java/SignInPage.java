import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage{
    public Object getSign;

    public SignInPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getSingUp() {
        return driver.findElement(By.xpath("//a[(text()='Sign Up')]"));}
    public WebElement getSingInWithGoogle() {
        return driver.findElement(By.xpath("//div[@id='uniqueid']"));}
    public WebElement getGooglEmail() {
        return driver.findElement(By.xpath("//input[@type='email']"));}
    public WebElement getEmailBtn() {
        return driver.findElement(By.xpath("//input[@name='email']"));}
    public WebElement getPasswordBtn() {
        return driver.findElement(By.xpath("//input[@name='password']"));}
    public WebElement getSignIn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));}

    public WebElement getCreateAmazonAccount() {
        return driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
    }

    public WebElement getLoginEmail() {
        return driver.findElement(By.xpath("//input[@id='ap_email']"));
    }

    public WebElement getContinue() {
        return driver.findElement(By.xpath("//input[@id='continue']"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//input[@id='ap_password']"));
    }

    public WebElement getSignInBtn() {
        return driver.findElement(By.xpath("//input[@id='signInSubmit']"));
    }
}

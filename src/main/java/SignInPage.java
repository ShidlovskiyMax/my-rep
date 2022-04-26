import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage{
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
}

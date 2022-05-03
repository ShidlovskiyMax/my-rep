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

    public WebElement getMainPage() {
        return driver.findElement(By.xpath("//li[@id='n-mainpage-description']"));

    }

    public WebElement getContents() {
        return driver.findElement(By.xpath("//li[@id='n-mainpage-description']"));
    }

    public WebElement getCurrentEvents() {
        return driver.findElement(By.xpath("//li[@id='n-currentevents']"));
    }

    public WebElement getRandomArticle() {
        return driver.findElement(By.xpath("//li[@id='n-randompage']"));
    }

    public WebElement getAboutWikipedia() {
        return driver.findElement(By.xpath("//li[@id='n-aboutsite']"));
    }

    public WebElement getContactUs() {
        return driver.findElement(By.xpath("//li[@id='n-contactpage']"));
    }

    public WebElement getDonate() {
        return driver.findElement(By.xpath("//li[@id='n-sitesupport']"));}

    public WebElement getHelp() {
        return driver.findElement(By.xpath("//li[@id='n-help']"));
    }

    public WebElement getAccountList() {
        return driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
    }

    public WebElement getHelloShidlovskiyMax() {
        return driver.findElement(By.xpath("//div//a[@id='nav-link-accountList']"));
    }
}

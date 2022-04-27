import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestOne extends TestInit {

    @Test
    public void testone() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");


    }

    @Test
    public void testLogInAndExit() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGotIt().click();
        homePage.getSingIn().click();
        SignInPage singInPage = new SignInPage(driver);
        singInPage.getEmailBtn().sendKeys("xamccb@mail.ru");
        singInPage.getPasswordBtn().sendKeys("Maks123098456");
        singInPage.getSignIn().click();
        sleep(5000);
        homePage.getMyAccount().click();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        sleep(2000);
        myAccountPage.getSignOut().click();
        sleep(2000);
        Assert.assertTrue(homePage.getSingIn().isDisplayed());
    }

    @Test
    public void testCheakGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
    }
}

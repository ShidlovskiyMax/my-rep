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
        sleep(5);
        homePage.getMyAccount().click();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        sleep(2);
        myAccountPage.getSignOut().click();
        sleep(2);
        Assert.assertTrue(homePage.getSingIn().isDisplayed());
    }
    @Test
    public void testChetakGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
    }
    @Test
    public void tesGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
    }
    @Test
    public void testWikipediaWatch(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://en.wikipedia.org/wiki/English_Wikipedia");
        homePage.getMainPage().click();
        homePage.getContents().click();
        homePage.getCurrentEvents().click();
        homePage.getRandomArticle().click();
        homePage.getAboutWikipedia().click();
        homePage.getContactUs().click();
        homePage.getDonate().click();
        homePage.getHelp().click();
        homePage.getMainPage();

        ContentsPage contentsPage = new ContentsPage(driver);
        contentsPage.getSearchInput().sendKeys("Elon Musk");
        contentsPage.getEarchButton().click();
    }
    @Test
    public void TestRegisterAmazon(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.amazon.com/");
        homePage.getAccountList().click();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.getCreateAmazonAccount().click();

        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.getYourName().sendKeys("ShidlovskiyMax");;
        createAccountPage.getEmail().sendKeys("xamccb@gmail.com");
        createAccountPage.getPassword().sendKeys("Maks123098");
        createAccountPage.getPasswordCheck().sendKeys("Maks123098");
        Assert.assertTrue(createAccountPage.getContinue().isDisplayed());
    }
    @Test
    public void TestProductSearch(){
        HomePage homePage  = new HomePage(driver);
        openUrl("https://www.amazon.com/ref=nav_lo");
        homePage.getFieldKeywords().sendKeys("gaming keyboard");
        homePage.getFind().click();

        FindPage findPage = new FindPage(driver);
        findPage.getFeaturedBrands().click();
        findPage.getPriceMin().sendKeys("50");
        findPage.getPriceMax().sendKeys("450");
        findPage.getAccept().click();
        Assert.assertTrue(findPage.getAccept().isDisplayed());
    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindPage extends BasePage {
    public FindPage(WebDriver driver){
        super(driver);
    }

    public WebElement getFeaturedBrands () {
        return driver.findElement(By.xpath("//li[@id='p_89/Razer']"));
    }

    public WebElement getPriceMin() {
        return driver.findElement(By.xpath("//input[@id='low-price']"));
    }

    public WebElement getPriceMax() {
        return driver.findElement(By.xpath("//input[@id='high-price']"));
    }

    public WebElement getAccept() {
        return driver.findElement(By.xpath("//span[@id='a-autoid-1']"));
    }
}

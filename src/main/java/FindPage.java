import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindPage extends BasePage {
    public FindPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFeaturedBrands() {
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

    public WebElement getDeliverTo() {
        return driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']"));
    }

    public WebElement getlocation() {
        return driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']"));
    }

    public WebElement getDone() {
        return driver.findElement(By.xpath("//button[text()= 'Done']"));
    }

    public WebElement getlocationChange() {
        return driver.findElement(By.xpath("//a[@id='GLUXCountryList_232']"));
    }

    public List<WebElement> getListGoods() {
        return driver.findElements(By.xpath("//*[@class=\"a-section a-spacing-base\"]"));
    }

    public WebElement getBuyNow() {
        return driver.findElement(By.xpath("//input[@id='buy-now-button']"));
    }

    public WebElement shippingPayment() {
        return driver.findElement(By.xpath("//div[@id='nav-inner']"));
    }

    public WebElement getResult() {
        return driver.findElement(By.xpath("//span[contains(text(), 'RESULTS')]"));
    }

    public WebElement getFeaturedBrandsProduct() {
        return driver.findElement(By.xpath("//li[@id='p_89/BLACK+DECKER']"));
    }
}

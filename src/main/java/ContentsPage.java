import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContentsPage extends BasePage {
    public ContentsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchInput() {
        return driver.findElement(By.xpath("//input[@id='searchInput']"));
    }

    public WebElement getEarchButton() {
        return driver.findElement(By.xpath("//input[@id='searchButton']"));
    }
}

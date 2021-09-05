import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
 public BasePage(WebDriver driver){
    this.driver = driver;
     PageFactory.initElements(driver, 30);
 }
public void explicitWait(WebElement e1){
    WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.visibilityOf(e1));
}
public void sleep() throws InterruptedException {
     Thread.sleep(3000);
}
}

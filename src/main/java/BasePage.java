import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
/*
 *base page which would be exended by all the pages
 *
 * @author VanajaGorantla
 */

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, 30);
    }
}

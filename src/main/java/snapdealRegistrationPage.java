import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class snapdealRegistrationPage extends BasePage {
    snapdealRegistrationPage(WebDriver driver) {
        super(driver);

    }

    public void register() throws InterruptedException {
        sleep();

        text_search.sendKeys("Mobile Phone");
        sleep();
        btn_search.click();

    }

    /* Element locators*/
    @FindBy(xpath = "//input[@id='inputValEnter']")
    WebElement text_search;
    @FindBy(xpath = "//button[contains(@class,'searchformButton')]")
    WebElement btn_search;


}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class searchPage extends BasePage {
    searchPage(WebDriver driver) {
        super(driver);

    }
    public void search(String item) throws InterruptedException {
        Thread.sleep(5000);
      driver.findElement(By.xpath("//div[contains(@class,search-box-wrapper)]//input[@id='inputValEnter' and @name='keyword']")).sendKeys(item);
      Thread.sleep(5000);
        //btn_search.click();
        driver.findElement(By.xpath("//button[contains(@class,'searchformButton')]//span")).click();
    }

    public void clickOnCart() throws InterruptedException{
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(@class,'cartContainer')]/div/span")).click();
    }




}

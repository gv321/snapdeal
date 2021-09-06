import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page objects for the homePage
 *
 * @author VanajaGorantla
 */
public class searchPage extends BasePage {
    searchPage(WebDriver driver) {
        super(driver);

    }

    /* search for the item in snapdeal
     * @parameter -item
     * */
    public void search(String item) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(@class,search-box-wrapper)]//input[@id='inputValEnter' and @name='keyword']")).sendKeys(item);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(@class,'searchformButton')]//span")).click();
    }

    /* checkout the cart
     * @parameter -item
     */
    public void clickOnCart() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(@class,'cartContainer')]/div/span")).click();
    }


}

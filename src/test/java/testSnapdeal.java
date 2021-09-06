import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*secenarios for snapdeal
 *  @author Vanaja Gorantla
 * */
public class testSnapdeal extends BaseTest {
    public WebDriver driver;
    searchPage smp;
    String text;

    /*
    search for mobile phone in snapdeal
    */
    @Test
    public void testSnapdealSearch() throws InterruptedException {
        driver = super.getDriver();
        smp = new searchPage(driver);
        String item = "mobile phone";
        smp.search(item);
        text = driver.findElement(By.xpath("//div[@id='searchMessageContainer']")).getText();
        Assert.assertTrue(text.contains(item), "mobile phone search results getting dispalyed");
    }

    /*
 verify the checkout page from cart icon
 */
    @Test
    public void testVerifyCart() throws InterruptedException {
      /*  driver=super.getDriver();
        smp= new searchPage(driver);*/
        smp.clickOnCart();
        text = driver.findElement(By.xpath("//div[contains(@class,'cart-buy-now-wrapper')]//a")).getAttribute("class");
        System.out.println("text is:" + text);
        Assert.assertTrue(text.contains("cart"), "Star Shoping button is visible");
    }
}

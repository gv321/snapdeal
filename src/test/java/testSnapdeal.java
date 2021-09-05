import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class testSnapdeal extends BaseTest {
    public WebDriver driver;
    searchPage smp;
    String text;

    @Test
    public void testSnapdealSearch() throws InterruptedException {
     driver=super.getDriver();
     smp= new searchPage(driver);
     String item="mobile phone";
     smp.search(item);
     text=driver.findElement(By.xpath("//div[@id='searchMessageContainer']")).getText();
     Assert.assertTrue(text.contains(item),"mobile phone search results getting dispalyed");
    }
    @Test
    public void testVerifyCart() throws InterruptedException {
        driver=super.getDriver();
        smp= new searchPage(driver);
        smp.clickOnCart();
        text=driver.findElement(By.xpath("//div[contains(@class,'cart-buy-now-wrapper')]//a")).getAttribute("class");
        System.out.println("text is:"+text);
        Assert.assertTrue(text.contains("cart"),"Star Shoping button is visible");
    }
}

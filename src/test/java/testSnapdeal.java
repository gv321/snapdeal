import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class testSnapdeal extends BaseTest {
    public WebDriver driver;
    snapdealRegistrationPage sr;

    @Test
    public void testSnapdealRegistration() throws InterruptedException {
     driver=super.getDriver();
     sr= new snapdealRegistrationPage(driver);
     sr.register();
    }

}

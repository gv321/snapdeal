import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    @BeforeTest
    public void beforeTest() throws IOException,FileNotFoundException {
        FileReader propertiesFile=new FileReader("C:\\Users\\Vanajag\\git\\snapdeal\\src\\test\\Props.properties");
        Properties p =new Properties();
        p.load(propertiesFile);
        String browser=p.get("browser").toString();
        String url= p.getProperty("url");
        driver= Driver.createDriver(browser);
        driver.get(url);
        WebDriverWait wait =new WebDriverWait(driver,30);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    }
    @AfterTest
    public void tearDown(){
       driver.quit();
    }
    public WebDriver getDriver(){
        return driver;
    }
}

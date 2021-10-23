import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*secenarios for BestMatch
 *  @author Vanaja Gorantla
 * */
public class testBestMatch extends BaseTest {
    public WebDriver driver;
    UploadDocPage  udp;
    String text;

    /*to verify the upload document functionality

    */
    @Test
    public void testUploadDocument() throws InterruptedException {
        driver = super.getDriver();
        udp = new UploadDocPage(driver);
        udp.clickOnUploaResume();
    }
}

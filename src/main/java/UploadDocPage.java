import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Page objects for the UploadDocumentPage
 *
 * @author VanajaGorantla
 */
public class UploadDocPage extends BasePage {
    UploadDocPage(WebDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /* to upload the resume*/

    public void clickOnUploaResume() throws InterruptedException {
        System.out.println("res:"+btn_uploadResume.getText());
        waitForPageToLoad();

    }


    /*************** uploadDocumentPage***************/
    @FindBy(xpath="//*[text()='Upload Resume']")
    public WebElement btn_uploadResume;
    @FindBy(xpath="//*[text()='Upload Job Description']")
    public WebElement btn_uploadJobDescription;

}

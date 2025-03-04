package pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    public BasePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void handleAlert() {
        try
        {
            Thread.sleep(3000);
            alert=driver.switchTo().alert();
            System.out.println("Alert text : " + alert.getText());
            alert.accept();
            System.out.println("Alert handles successfully");
        }
        catch (Exception e)
        {
            System.out.println("No Pop-Up displaying");
        }
    }

}

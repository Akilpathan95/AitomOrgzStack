package pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class PopUps extends BasePage {

    public PopUps(WebDriver driver)
    {
        super(driver);
    }

    public void handleAlert() {
        try
        {
            Thread.sleep(3000);
            Alert alert=driver.switchTo().alert();
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

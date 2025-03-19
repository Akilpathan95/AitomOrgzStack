package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftMenuPage extends BasePage {

    public LeftMenuPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='jss92']//div[contains(text(), 'Requisition')]")
    WebElement btnRequisition;

    public void clkRequisition()
    {
        btnRequisition.click();
    }
}

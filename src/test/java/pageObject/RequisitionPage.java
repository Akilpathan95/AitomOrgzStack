package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequisitionPage extends BasePage {

    public RequisitionPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='jss92']//div[contains(text(), 'Requisition')]")
    WebElement btnRequisition;

    @FindBy(xpath = "//div[normalize-space()='REQUISITION']")
    WebElement btnRequisition_Option;

    @FindBy(xpath = "//div[normalize-space()='My Requisition']")
    WebElement btnMy_Requisition;

    public void clkRequisition()
    {
        btnRequisition.click();
    }

    public void clkRequisition_Option()
    {
        btnRequisition_Option.click();
    }

    public void clkMy_Requisition()
    {
        btnMy_Requisition.click();
    }

}

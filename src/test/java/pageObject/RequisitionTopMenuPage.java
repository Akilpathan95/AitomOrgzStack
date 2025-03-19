package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequisitionTopMenuPage extends BasePage {

    public RequisitionTopMenuPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[normalize-space()='REQUISITION']")
    WebElement btnRequisition_Option;

    @FindBy(xpath = "//div[normalize-space()=\"RECRUITMENT\"]")
    WebElement btnRecruitment;

    public void clkRequisition_Option()
    {
        btnRequisition_Option.click();
    }

    public void clkRecruitment()
    {
        btnRecruitment.click();
    }
}

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

    @FindBy(xpath = "//div[contains(text(),\"Organisation Setup\")]")
    WebElement btnOrganisationSetup;

    @FindBy(xpath = "//div[contains(text(),\"Org. Info\")]")
    WebElement btnOrgInfo;

    @FindBy(xpath = "//div[contains(text(),'Reimbursement')]")
    WebElement btnReimbursement;

    public void clkRequisition()
    {
        btnRequisition.click();
    }

    public void clkOrganisationSetup()
    {
        btnOrganisationSetup.click();
    }

    public void clkOrgInfo()
    {
        btnOrgInfo.click();
    }

    public void clkReimbursement()
    {
        btnReimbursement.click();
    }
}

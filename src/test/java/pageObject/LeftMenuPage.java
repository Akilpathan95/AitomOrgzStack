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

    @FindBy(xpath = "//li/div[contains(text(), 'ZONE')]")
    WebElement btnZone;

    @FindBy(xpath = "//div[text()='BRANCHES']")
    WebElement btnBranch;

    @FindBy(xpath = "//div[text()='DIVISION']")
    WebElement btnDivision;

    @FindBy(xpath = "//div[text()='DEPARTMENT']")
    WebElement btnDepartment;

    @FindBy(xpath = "//div[text()='DESIGNATION']")
    WebElement btnDesignation;

    @FindBy(xpath = "//div[text()='CLIENT']")
    WebElement btnClient;

    @FindBy(xpath = "//li/div[contains(text(), 'LOCATION')]")
    WebElement btnLocation;

    @FindBy(xpath = "//div[text()='GRADE']")
    WebElement btnGrade;

    @FindBy(xpath = "//div[text()=\"Business Unit\"]")
    WebElement btnBusinessUnit;

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

    public void clkZone()
    {
        btnZone.click();
    }

    public void clkReimbursement()
    {
        btnReimbursement.click();
    }

    public void clkBranch()
    {
        btnBranch.click();
    }

    public void clkDivision()
    {
        btnDivision.click();
    }

    public void clkDepartment()
    {
        btnDepartment.click();
    }

    public void clkDesignation()
    {
        btnDesignation.click();
    }

    public void clkClient()
    {
        btnClient.click();
    }

    public void clkLocation()
    {
        btnLocation.click();
    }

    public void clkGrade()
    {
        btnGrade.click();
    }

    public void clkBusinessUnit()
    {
        btnBusinessUnit.click();
    }
}

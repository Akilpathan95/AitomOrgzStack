package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BusinessUnitPage extends BasePage {

    public BusinessUnitPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[text()=\"Add Bussiness Unit\"]")
    WebElement btnAddBusinessUnit;

    @FindBy(xpath = "//span[normalize-space()=\"BASIC INFO\"]")
    WebElement btnBasicInfo;

    @FindBy(xpath = "//span[normalize-space()=\"CONTACTS\"]")
    WebElement btnContacts;

    @FindBy(xpath = "//span[normalize-space()=\"EMPLOYEES\"]")
    WebElement btnEmployees;

    @FindBy(xpath = "//span[normalize-space()=\"HOLIDAYS\"]")
    WebElement btnHolidays;

    @FindBy(xpath = "//span[normalize-space()=\"LEAVES\"]")
    WebElement btnLeaves;

    @FindBy(xpath = "//span[normalize-space()=\"SHIFTS\"]")
    WebElement btnShifts;

    @FindBy(xpath = "//span[normalize-space()=\"LOCATION\"]")
    WebElement btnLocation;

    @FindBy(xpath = "//span[normalize-space()=\"ATTENDANCE\"]")
    WebElement btnAttendance;

    @FindBy(xpath = "//span[normalize-space()=\"APPROVAL SETUP\"]")
    WebElement btnApprovalSetup;

    @FindBy(xpath = "//span[normalize-space()=\"SALARY STRUCTURE\"]")
    WebElement btnSalaryStructure;

    @FindBy(xpath = "//span[normalize-space()=\"CLIENTACTIVITYLOG\"]")
    WebElement btnClientActivityLog;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    WebElement txtSearch;

    public WebElement getEditIconByBUName(String buName)
    {
        String buXpath="//table//tr[td[3][normalize-space()='"+ buName + "']]//button//*[name()='svg']";
        return driver.findElement(By.xpath(buXpath));
    }

    public void clkAddBusinessUnit()
    {
        btnAddBusinessUnit.click();
    }

    public void clkBsicInfo()
    {
        btnBasicInfo.click();
    }

    public void clkContacts()
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(btnContacts));
        btnContacts.click();
    }

    public void clkEmployees()
    {
        btnEmployees.click();
    }

    public void clkHolidays()
    {
        btnHolidays.click();
    }

    public void clkLeaves()
    {
        btnLeaves.click();
    }

    public void clkShifts()
    {
        btnShifts.click();
    }

    public void clkLocation()
    {
        btnLocation.click();
    }

    public void clkAttendance()
    {
        btnAttendance.click();
    }

    public void clkApprovalSetup()
    {
        btnApprovalSetup.click();
    }

    public void clkSalaryStructure()
    {
        btnSalaryStructure.click();
    }

    public void clkClientActivityLog()
    {
        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='90%';");
        btnClientActivityLog.click();
    }

    public void enterSearch(String search)
    {
        txtSearch.sendKeys(search);
    }

    public void clkEditIcon()
    {
        WebElement editIcon=getEditIconByBUName("Testing Te");
        editIcon.click();
    }
}

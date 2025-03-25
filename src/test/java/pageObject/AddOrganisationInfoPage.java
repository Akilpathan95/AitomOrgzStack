package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddOrganisationInfoPage extends BasePage{

    BasePage bp;

    public AddOrganisationInfoPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div//input[@placeholder='Organisation Name']")
    WebElement txtOrganisationName;

    @FindBy(xpath = "//div//input[@placeholder='Organisation Code']")
    WebElement txtOrganisationCode;

    @FindBy(xpath = "//div//input[@placeholder='Number of Employees']")
    WebElement txtNumberOfEmployee;

    @FindBy(xpath = "//input[@type='file']")
    WebElement addImage;

    @FindBy(xpath = "//div//input[@placeholder='Email Address']")
    WebElement txtEmailAddress;

    @FindBy(xpath = "//div//input[@placeholder='Phone Number']")
    WebElement txtMobileNumber;

    @FindBy(xpath = "//div//input[@placeholder='Address']")
    WebElement txtAddress;

    @FindBy(xpath = "//input[@name=\"address2\"]")
    WebElement txtAddress2;

    @FindBy(xpath = "//input[@name=\"org_city\"]")
    WebElement txtCity;

    @FindBy(xpath = "//label[contains(text(),'State')]/following-sibling::div")
    WebElement drpState;

    @FindBy(xpath = "//label[contains(text(),'Country')]/following-sibling::div")
    WebElement drpCountry;

    @FindBy(xpath = "//input[@name='org_pincode']")
    WebElement txtPincode;

    @FindBy(xpath = "//input[@name='org_pan']")
    WebElement txtOrganisationNumber;

    @FindBy(xpath = "//label[contains(text(),'Legal status of organisation')]/following-sibling::div")
    WebElement drpLegalStatus;

    @FindBy(xpath = "//input[@name='gstin']")
    WebElement txtGstIn;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    public void enterOrganisationName(String organisationName)
    {
        txtOrganisationName.sendKeys(Keys.CONTROL + "a");
        txtOrganisationName.sendKeys(Keys.DELETE);
        txtOrganisationName.sendKeys(organisationName);
    }

    public void enterOrganisationCode(String organisationCode)
    {
        txtOrganisationCode.sendKeys(Keys.CONTROL + "a");
        txtOrganisationCode.sendKeys(Keys.DELETE);
        txtOrganisationCode.sendKeys(organisationCode);
    }

    public void enterNumberOfEmployee(String numberOfEmployee)
    {
        txtNumberOfEmployee.sendKeys(Keys.CONTROL + "a");
        txtNumberOfEmployee.sendKeys(Keys.DELETE);
        txtNumberOfEmployee.sendKeys(numberOfEmployee);
    }

    public void selectImage()
    {
        addImage.sendKeys("C:\\Users\\IPSL\\Downloads\\ipsImage.jfif");
        bp=new BasePage(driver);
        bp.handleAlert();
    }

    public void enterEmailAddress(String emailAddress)
    {
        txtEmailAddress.sendKeys(Keys.CONTROL + "a");
        txtEmailAddress.sendKeys(Keys.DELETE);
        txtEmailAddress.sendKeys(emailAddress);
    }

    public void enterMobileNumber(String mobileNumber)
    {
        txtMobileNumber.sendKeys(Keys.CONTROL + "a");
        txtMobileNumber.sendKeys(Keys.DELETE);
        txtMobileNumber.sendKeys(mobileNumber);
    }

    public void enterAddress(String address)
    {
        txtAddress.sendKeys(Keys.CONTROL + "a");
        txtAddress.sendKeys(Keys.DELETE);
        txtAddress.sendKeys(address);
    }

    public void enterAddress2(String address2)
    {
        txtAddress2.sendKeys(Keys.CONTROL + "a");
        txtAddress2.sendKeys(Keys.DELETE);
        txtAddress2.sendKeys(address2);
    }

    public void enterCity(String city)
    {
        txtCity.sendKeys(Keys.CONTROL + "a");
        txtCity.sendKeys(Keys.DELETE);
        txtCity.sendKeys(city);
    }

    public void selectState() throws InterruptedException {
        drpState.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[normalize-space()='Meghalaya']")));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Meghalaya']")));
        element.click();
        System.out.println("State Selected: Meghalaya");
    }

    public void selectCountry()
    {
        drpCountry.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()=\"India\"]")));
        element.click();
        System.out.println("Country Selected: India");
    }

    public void enterPincode(String pincode)
    {
        txtPincode.sendKeys(Keys.CONTROL + "a");
        txtPincode.sendKeys(Keys.DELETE);
        txtPincode.sendKeys(pincode);
    }

    public void entertxtOrganisationNumber(String organisationNumber)
    {
        txtOrganisationNumber.sendKeys(Keys.CONTROL + "a");
        txtOrganisationNumber.sendKeys(Keys.DELETE);
        txtOrganisationNumber.sendKeys(organisationNumber);
    }

    public void selectLegalStatus()
    {
        drpLegalStatus.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()=\"Ltd Company\"]")));
        element.click();
        System.out.println("Legal status of organisation: Ltd Company");
    }

    public void enterGstIn(String gstIn)
    {
        txtGstIn.sendKeys(Keys.CONTROL + "a");
        txtGstIn.sendKeys(Keys.DELETE);
        txtGstIn.sendKeys(gstIn);
    }

    public void clkSave()
    {
        btnSave.click();
        bp=new BasePage(driver);
        bp.handleAlert();
    }
}

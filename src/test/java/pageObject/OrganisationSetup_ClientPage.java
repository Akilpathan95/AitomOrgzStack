package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class OrganisationSetup_ClientPage extends BasePage{

    public OrganisationSetup_ClientPage(WebDriver driver)
    {
        super(driver);
    }

    WebDriverWait wait;

    @FindBy(xpath = "//input[@placeholder=\"Search by client name\"]")
    WebElement txtSearchClient;

    @FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[5]")
    WebElement btnEditAction;

    @FindBy(xpath = "//input[@name=\"client_code\"]")
    WebElement txtClientCode;

    @FindBy(xpath = "//input[@name=\"address1\"]")
    WebElement txtAddress;

    @FindBy(xpath = "//input[@type='file']")
    List<WebElement> addLogo;

    @FindBy(xpath = "//label[text()='Country']/following::div[@id='demo-simple-select'][1]")
    WebElement drpCountry;

    @FindBy(xpath = "//label[text()='State']/following::div[@id='demo-simple-select'][1]")
    WebElement drpState;

    @FindBy(xpath = "//input[@name=\"city\"]")
    WebElement txtCity;

    @FindBy(xpath = "//input[@name=\"phone_number\"]")
    WebElement txtPhoneNumber;

    @FindBy(xpath = "//input[@name=\"mobile_number\"]")
    WebElement txtMobileNumber;

    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement txtEmail;

    @FindBy(xpath = "//div[@class=\"w-1/3 ml-2 -mt-2\"]//div[@id=\"demo-simple-select\"]")
    WebElement drpSegment;

    @FindBy(xpath = "//input[@name=\"website\"]")
    WebElement txtWebsite;

    @FindBy(xpath = "//div[@class=\" w-1/3 mt-4\"]//div[@id=\"demo-simple-select\"]")
    WebElement drpServices;

    @FindBy(xpath = "//input[@name=\"gstin\"]")
    WebElement txtGST;

    @FindBy(xpath = "//input[@name=\"pan\"]")
    WebElement txtPan;

    @FindBy(xpath = "//input[@name=\"tan\"]")
    WebElement txtTan;

    @FindBy(xpath = "//input[@type='file']")
    List<WebElement> addAgreementCopy;

    @FindBy(xpath = "(//input[@id='date-picker-dialog'])[1]")
    WebElement drpAgreementStartDate;

    @FindBy(xpath = "(//input[@id='date-picker-dialog'])[2]")
    WebElement drpAgreementEndDate;

    @FindBy(xpath = "//input[@placeholder=\"Name\"]")
    WebElement txtName;

    @FindBy(xpath = "//input[@placeholder=\"Email ID\"]")
    WebElement txtEmailID;

    @FindBy(xpath = "//input[@placeholder=\"Mobile No.\"]")
    WebElement txtMobileNo;

    @FindBy(xpath = "//input[@placeholder=\"Designation\"]")
    WebElement txtDesignation;

    @FindBy(xpath = "//button[normalize-space()=\"Add SPOC\"]")
    WebElement btnAddSPOC;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    @FindBy(xpath = "//span[normalize-space()=\"Add New\"]")
    WebElement btnAddNew;

    @FindBy(xpath = "//input[@name=\"client_name\"]")
    WebElement txtClientName;

    public void clkAddNew()
    {
        btnAddNew.click();
    }

    public void enterClientName(String clientName)
    {
        txtClientName.sendKeys(clientName);
    }

    public void inputSearchClient(String search)
    {
        txtSearchClient.sendKeys(search);
        System.out.println("Client searched successfully");
    }

    public void clkEditAction()
    {
        btnEditAction.click();
        System.out.println("Clicked on Edit Action");
    }

    public void selectAgreementCopy()
    {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.display='block';", addAgreementCopy.get(0));
            addAgreementCopy.get(1).sendKeys("C:\\Users\\IPSL\\Downloads\\Akil_Pathan_FinalManual.pdf");
            BasePage bp=new BasePage(driver);
            bp.handleAlert();
            System.out.println("Agreement Copy is added");
        }
        catch (Exception e)
        {
            System.out.println("Exception Occured : " + e.getMessage());
        }

    }

    public void selectAgreementStartDate(String anniversary)
    {
        drpAgreementStartDate.sendKeys(Keys.CONTROL + "a");
        drpAgreementStartDate.sendKeys(Keys.DELETE);
        System.out.println("Anniversary field is cleared");
        drpAgreementStartDate.sendKeys(anniversary);
        System.out.println("Anniversary Date is added");
    }

    public void selectAgreementEndDate(String dob)
    {
        drpAgreementEndDate.sendKeys(Keys.CONTROL + "a");
        drpAgreementEndDate.sendKeys(Keys.DELETE);
        System.out.println("DOB field is cleared");
        drpAgreementEndDate.sendKeys(dob);
        System.out.println("DOB is added");
    }

    public void inputClientCode(String code)
    {
        txtClientCode.sendKeys(Keys.CONTROL + "a");
        txtClientCode.sendKeys(Keys.DELETE);
        System.out.println("Clear the code text field");
        txtClientCode.sendKeys(code);
        System.out.println("Client code added");
    }

    public void inputAddress(String address)
    {
        txtAddress.sendKeys(Keys.CONTROL + "a");
        txtAddress.sendKeys(Keys.DELETE);
        System.out.println("Clear the address text field");
        txtAddress.sendKeys(address);
        System.out.println("Address is added");
    }

    public void selectCountry()
    {
        drpCountry.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"India\"]")).click();
        System.out.println("Country is selected");
    }

    public void selectState()
    {
        drpState.click();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement state = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Maharashtra']")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", state);
        System.out.println("State is selected");
    }

    public void inputCity(String city)
    {
        txtCity.sendKeys(Keys.CONTROL + "a");
        txtCity.sendKeys(Keys.DELETE);
        System.out.println("City field is cleared");
        txtCity.sendKeys(city);
        System.out.println("City is added");
    }

    public void inputPhoneNUmber(String phone)
    {
        txtPhoneNumber.sendKeys(Keys.CONTROL + "a");
        txtPhoneNumber.sendKeys(Keys.DELETE);
        System.out.println("Phone Number field is cleared");
        txtPhoneNumber.sendKeys(phone);
        System.out.println("Phone number field is added");
    }

    public void inputMobileNumber(String mobile)
    {
        txtMobileNumber.sendKeys(Keys.CONTROL + "a");
        txtMobileNumber.sendKeys(Keys.DELETE);
        System.out.println("Mobile Number field is cleared");
        txtMobileNumber.sendKeys(mobile);
        System.out.println("Mobile Number is added");
    }

    public void inputEmail(String email)
    {
        txtEmail.sendKeys(Keys.CONTROL + "a");
        txtEmail.sendKeys(Keys.DELETE);
        System.out.println("Email field is cleared");
        txtEmail.sendKeys(email);
        System.out.println("Email is added");
    }

    public void selectSegment()
    {
        drpSegment.click();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement segment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()=\"IT Staffing\"]")));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", segment);
        System.out.println("Segment added successfully.");
    }

    public void inputWebsite(String website)
    {
        txtWebsite.sendKeys(Keys.CONTROL + "a");
        txtWebsite.sendKeys(Keys.DELETE);
        System.out.println("Website field is cleared");
        txtWebsite.sendKeys(website);
        System.out.println("Website is added");
    }

    public void selectServices()
    {
        drpServices.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"Workforce Management\"]")).click();
        System.out.println("Workforce Management added");
    }

    public void inputPan(String pan)
    {
        txtPan.sendKeys(Keys.CONTROL + "a");
        txtPan.sendKeys(Keys.DELETE);
        System.out.println("Pan field is cleared");
        txtPan.sendKeys(pan);
        System.out.println("Pan is added");
    }

    public void inputTan(String tan)
    {
        txtTan.sendKeys(Keys.CONTROL + "a");
        txtTan.sendKeys(Keys.DELETE);
        System.out.println("Tan field is cleared");
        txtTan.sendKeys(tan);
        System.out.println("Tan is added");
    }

    public void inputGST(String gst)
    {
        txtGST.sendKeys(Keys.CONTROL + "a");
        txtGST.sendKeys(Keys.DELETE);
        System.out.println("GST field is cleared");
        txtGST.sendKeys(gst);
        System.out.println("GST is added");
    }

    public void selectLogo()
    {
        try {
            addLogo.get(0).sendKeys("C:\\Users\\IPSL\\Downloads\\ipsImage.jpg");
            BasePage bp=new BasePage(driver);
            bp.handleAlert();
            System.out.println("Logo is added");
        }
        catch (Exception e)
        {
            System.out.println("Exception Occured : " + e.getMessage());
        }

    }

    public void inputName(String name)
    {
        txtName.sendKeys(Keys.CONTROL + "a");
        txtName.sendKeys(Keys.DELETE);
        System.out.println("Input Name field is cleared");
        txtName.sendKeys(name);
        System.out.println("Name is added");
    }

    public void inputDesignation(String designation)
    {
        txtDesignation.sendKeys(Keys.CONTROL + "a");
        txtDesignation.sendKeys(Keys.DELETE);
        System.out.println("Designation field is cleared");
        txtDesignation.sendKeys(designation);
        System.out.println("Designation is added");
    }

    public void inputMobileNo(String mobile)
    {
        txtMobileNo.sendKeys(Keys.CONTROL + "a");
        txtMobileNo.sendKeys(Keys.DELETE);
        System.out.println("Mobile No field is cleared");
        txtMobileNo.sendKeys(mobile);
        System.out.println("Mobile No is added");
    }

    public void inputEmailID(String email)
    {
        txtEmailID.sendKeys(Keys.CONTROL + "a");
        txtEmailID.sendKeys(Keys.DELETE);
        System.out.println("Email ID field is cleared");
        txtEmailID.sendKeys(email);
        System.out.println("Email ID is added");
    }

    public void clkAddSPOC()
    {
        btnAddSPOC.click();
        System.out.println("Add button is clicked");
    }

    public void clkSaveClient()
    {
        btnSave.click();
        System.out.println("Save button is clicked");
    }

    public void contractual()
    {
        WebElement margin=driver.findElement(By.xpath("(//select[@id='demo-simple-select'])[1]"));
        Select select=new Select(margin);
        select.selectByValue("Fixed in Rs");

        WebElement marginAmount=driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[1]"));
        marginAmount.sendKeys("60000");

        WebElement sourcing=driver.findElement(By.xpath("(//select[@id='demo-simple-select'])[2]"));
        Select select1=new Select(sourcing);
        select1.selectByValue("Fixed in Rs");

        WebElement sourcingAmount=driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[2]"));
        sourcingAmount.sendKeys("60000");

        WebElement lifecycle=driver.findElement(By.xpath("//select[@class=\"addclintone\"]"));
        Select select2=new Select(lifecycle);
        select2.selectByValue("10");

        WebElement payroll=driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[3]"));
        payroll.sendKeys("120000");

        WebElement date=driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[4]"));
        date.sendKeys("10");

        WebElement days=driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[5]"));
        days.sendKeys("30");
    }

    public void permanent()
    {
        WebElement permanent1=driver.findElement(By.xpath("//span[normalize-space()=\"Permanent\"]"));
        permanent1.click();

        WebElement fee=driver.findElement(By.xpath("//select[@id=\"demo-simple-select\"]"));
        Select select=new Select(fee);
        select.selectByValue("Fixed in Rs");

        WebElement feeAmount=driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[1]"));
        feeAmount.sendKeys("1000");

        WebElement valueClosure=driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[2]"));
        valueClosure.sendKeys("500");

        WebElement replacementClause=driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[3]"));
        replacementClause.sendKeys("500");
    }
}
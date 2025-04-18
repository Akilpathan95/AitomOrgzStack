package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BusinessUnitEmployee_Onboarding extends BasePage {

    public BusinessUnitEmployee_Onboarding(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@name=\"name\"]")
    WebElement txtpanNo;

    @FindBy(xpath = "(//input[@type='file'])[1]")
    WebElement filePan;

    @FindBy(xpath = "//input[@name=\"Aadhar No.\"]")
    WebElement txtAadharNo;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    WebElement fileAadhar;

    @FindBy(xpath = "//input[@name=\"Passport No.\"]")
    WebElement txtPassportNo;

    @FindBy(xpath = "(//input[@type='file'])[1]")
    WebElement filePassport;

    @FindBy(xpath = "//p[normalize-space()=\"Father's Name\"]/following::input[@name=\"first name\"][1]")
    WebElement txtFatherFirstName;

    @FindBy(xpath = "//p[normalize-space()=\"Father's Name\"]/following::input[@name=\"second name\"][1]")
    WebElement txtFatherSecondName;

    @FindBy(xpath = "//p[normalize-space()=\"Father's Name\"]/following::input[@name=\"last name\"][1]")
    WebElement txtFatherLastName;

    @FindBy(xpath = "//p[normalize-space()=\"Mother's Name\"]/following::input[@name=\"first name\"][1]")
    WebElement txtMotherFirstName;

    @FindBy(xpath = "//p[normalize-space()=\"Mother's Name\"]/following::input[@name=\"second name\"][1]")
    WebElement txtMotherSecondName;

    @FindBy(xpath = "//p[normalize-space()=\"Mother's Name\"]/following::input[@name=\"last name\"][1]")
    WebElement txtMotherLastName;

    @FindBy(xpath = "//div[contains(@id,\"marital-status\")]")
    WebElement drpMaritalStatus;

    @FindBy(xpath = "//input[@name=\"nominee name\"]")
    WebElement txtNomineeName;

    @FindBy(xpath = "//label[normalize-space()=\"Date Of Birth\"]/following::button[1]//span[1]//*[name()=\"svg\"]")
    WebElement calDOB;

    @FindBy(xpath = "//input[@name='relationship']")
    WebElement txtRelationship;

    @FindBy(xpath = "//input[@name='private bank name']")
    WebElement txtPrivateBankName;

    @FindBy(xpath = "//input[@name='private account no.']")
    WebElement txtPrivateAccountNo;

    @FindBy(xpath = "//input[@name='private ifsc code']")
    WebElement txtPrivateIFSCCode;

    @FindBy(xpath = "//label[normalize-space()=\"Same as Private Bank Details :\"]")
    WebElement chkPrivateBank;

    @FindBy(xpath = "(//input[@type='file'])[4]")
    WebElement fileCancelCheque;

    @FindBy(xpath = "//span[normalize-space()=\"Add Hobbies\"]")
    WebElement clkAddHobbies;

    @FindBy(xpath = "//span[normalize-space()=\"Add Sports\"]")
    WebElement clkSports;

    @FindBy(xpath = "//span[normalize-space()=\"Save\"]")
    WebElement btnSave;

    @FindBy(xpath = "//span[normalize-space()=\"OK\"]")
    WebElement btnOK;

    @FindBy(xpath = "//input[@name=\"hobbies\"]")
    WebElement txtHobbies;

    @FindBy(xpath = "//input[@name=\"sports\"]")
    WebElement txtSports;

    @FindBy(xpath = "//input[@name=\"spouse's name\"]")
    WebElement txtSpousesName;

    @FindBy(xpath = "//label[normalize-space()=\"Anniversary Date\"]/following::button[1]//span[1]//*[name()=\"svg\"]")
    WebElement calAnniversaryDate;

    @FindBy(xpath = "//div[@id=\"mui-component-select-number-of-child-status\"]")
    WebElement drpNoOfChildren;

    @FindBy(xpath = "//div[@class=\"MuiPickersCalendarHeader-switchHeader\"]//button[1]//span[1]//*[name()=\"svg\"]")
    WebElement pre;

    @FindBy(xpath = "//span[normalize-space()=\"ONBOARDING\"]")
    WebElement btnOnboarding;

    public void clkOnboarding()
    {
        btnOnboarding.click();
        System.out.println("Clicked on the Onboarding button ");
    }

    public void enterPanNo(String pan)
    {
        txtpanNo.sendKeys(pan);
        System.out.println("Pan card number added");
    }

    public void addPan()
    {
        filePan.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        System.out.println("Pan card photo added");
    }

    public void enterAadharNo(String aadhar)
    {
        txtAadharNo.sendKeys(aadhar);
        System.out.println("Aadhar card number added");
    }

    public void addAadhar()
    {
        fileAadhar.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        System.out.println("Aadhar card photo added");
    }

    public void enterPassport(String passport)
    {
        txtPassportNo.sendKeys(passport);
        System.out.println("Passport number added");
    }

    public void addPassport()
    {
        filePassport.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        System.out.println("Passport Photo added");
    }

    public void enterFatherFirstName(String name)
    {
        txtFatherFirstName.sendKeys(name);
        System.out.println("Fathers first name added");
    }

    public void enterFatherSecondName(String name)
    {
        txtFatherSecondName.sendKeys(name);
        System.out.println("Fathers second name added");
    }

    public void enterFatherLastName(String name)
    {
        txtFatherLastName.sendKeys(name);
        System.out.println("Fathers last name added");
    }

    public void enterMotherFirstName(String name)
    {
        txtMotherFirstName.sendKeys(name);
        System.out.println("Mothers first name added");
    }

    public void enterMotherSecondName(String name)
    {
        txtMotherSecondName.sendKeys(name);
        System.out.println("Mothers second name added");
    }

    public void enterMotherLastName(String name)
    {
        txtMotherLastName.sendKeys(name);
        System.out.println("Mothers last name added");
    }

    public void selectMaritalStatus()
    {
        drpMaritalStatus.click();
        WebElement status=driver.findElement(By.xpath("//li[normalize-space()=\"Married\"]"));
        status.click();
        System.out.println("Marital status updated");
    }

    public void enterSpousesName(String spousesName)
    {
        txtSpousesName.sendKeys(spousesName);
        System.out.println("Spouse name added");
    }

    public void selectAnniversaryDate()
    {
        String expYearMonth="December 2024";
        String expDate="14";

        calAnniversaryDate.click();

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter\"]")).getText();

            if (yearMonth.equals(expYearMonth))
            {
                System.out.println("Year and Month fetched : " + yearMonth);
                break;
            }

            pre.click();
        }

        List<WebElement> dates=driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']//span[@class='MuiTouchRipple-root']"));

        for (WebElement allDates : dates)
        {
            if (allDates.getText().equals(expDate))
            {
                allDates.click();
                System.out.println("Dates fetched");
                break;
            }
        }

        btnOK.click();
    }

    public void clkNoOfChildren()
    {
        drpNoOfChildren.click();
        WebElement chil=driver.findElement(By.xpath("//li[normalize-space()=\"1\"]"));
        chil.click();
        System.out.println("No of childrens added");
    }

    public void enterNomineeName(String name)
    {
        txtNomineeName.sendKeys(name);
        System.out.println("Nominees name added");
    }

    public void selectDOB()
    {
        String expMonthYear="March 2025";
        String expDate="14";

        calDOB.click();

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter\"]")).getText();

            if (yearMonth.equals(expMonthYear))
            {
                System.out.println("Year and Month fetched");
                break;
            }

            pre.click();
        }

        List<WebElement> date=driver.findElements(By.xpath("//div//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

        for(WebElement alldates : date)
        {
           if (alldates.getText().equals(expDate))
           {
               alldates.click();
               System.out.println("Dates fetched");
               break;
           }
        }

        btnOK.click();
    }

    public void enterRelationship(String relationship)
    {
        txtRelationship.sendKeys(relationship);
        System.out.println("Relationship added");
    }

    public void enterPrivateBankName(String privateBankName)
    {
        txtPrivateBankName.sendKeys(privateBankName);
        System.out.println("Private bank name added");
    }

    public void enterPrivateAccountNo(String privateAccountNumber)
    {
        txtPrivateAccountNo.sendKeys(privateAccountNumber);
        System.out.println("Private Account number added");
    }

    public void enterPrivateIFSCCode(String ifscCode)
    {
        txtPrivateIFSCCode.sendKeys(ifscCode);
        System.out.println("Private IFSC code added");
    }

    public void clkPrivateBankDetails()
    {
        chkPrivateBank.click();
        System.out.println("Private Bank Details added");
    }

    public void addCancelledCheque()
    {
        fileCancelCheque.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        System.out.println("Cancelled cheque added");
    }

    public void addHobbies()
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clkAddHobbies));

        if (clkAddHobbies.isDisplayed() && clkAddHobbies.isEnabled())
        {
            try
            {
                clkAddHobbies.click();
                System.out.println("Clicked on hobbies button");
            }
            catch (ElementClickInterceptedException e)
            {
                JavascriptExecutor js=(JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", clkAddHobbies);
                System.out.println("Clicked on hobbies button (JS fallback)");
            }
        }
        else
        {
            System.out.println("Hobbies button is not interactable");
        }

    }

    public void enterHobbies(String hobbies)
    {
        txtHobbies.sendKeys(hobbies);
        System.out.println("Hobbies added");
    }

    public void addSports()
    {
        clkSports.click();
        System.out.println("Clicked on Sports button");
    }

    public void enterSports(String sports)
    {
        txtSports.sendKeys(sports);
        System.out.println("Sports added");
    }

    public void clkSave()
    {
        btnSave.click();
        System.out.println("Clicked on Saved button");
    }

}

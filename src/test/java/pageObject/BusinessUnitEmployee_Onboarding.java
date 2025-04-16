package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(xpath = "(//label[normalize-space()=\"Date Of Birth\"]/following::button//*[name()=\"svg\"])[1]")
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


    public void enterPanNo(String pan)
    {
        txtpanNo.sendKeys(pan);
    }

    public void addPan()
    {
        filePan.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdg");
    }

    public void enterAadharNo(String aadhar)
    {
        txtAadharNo.sendKeys(aadhar);
    }

    public void addAadhar()
    {
        fileAadhar.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdg");
    }

    public void enterPassport(String passport)
    {
        txtPassportNo.sendKeys(passport);
    }

    public void addPassport()
    {
        filePassport.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdg");
    }

    public void enterFatherFirstName(String name)
    {
        txtFatherFirstName.sendKeys(name);
    }

    public void enterFatherSecondName(String name)
    {
        txtFatherSecondName.sendKeys(name);
    }

    public void enterFatherLastName(String name)
    {
        txtFatherLastName.sendKeys(name);
    }

    public void enterMotherFirstName(String name)
    {
        txtMotherFirstName.sendKeys(name);
    }

    public void enterMotherSecondName(String name)
    {
        txtMotherSecondName.sendKeys(name);
    }

    public void enterMotherLastName(String name)
    {
        txtMotherLastName.sendKeys(name);
    }

    public void selectMaritalStatus()
    {
        drpMaritalStatus.click();
        WebElement status=driver.findElement(By.xpath("//li[normalize-space()=\"Married\"]"));
        status.click();
    }

    public void enterNomineeName(String name)
    {
        txtNomineeName.sendKeys(name);
    }

    public void selectDOB()
    {
        String expMonthYear="March 2025";
        String expDate="14";
        WebElement pre=driver.findElement(By.xpath("//div[@class=\"MuiPickersCalendarHeader-switchHeader\"]//button[1]//span[1]//*[name()=\"svg\"]"));

        calDOB.click();

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter\"]")).getText();

            if (yearMonth.equals(expMonthYear))
            {
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
               break;
           }
        }
    }

    public void clkOK()
    {
        btnOK.click();
    }

    public void clkSave()
    {
        btnSave.click();
    }
}

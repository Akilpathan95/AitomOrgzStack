package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BusinessUnitEmployee_EmploymentDetails extends BasePage{

    public BusinessUnitEmployee_EmploymentDetails(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()=\"EMPLOYMENT DETAILS\"]")
    WebElement btnEmploymentDetails;

    @FindBy(xpath = "//div[@id=\"demo-simple-select\"]")
    WebElement drpNatureOfEmployment;

    @FindBy(xpath = "//div[@class=\"MuiPickersCalendarHeader-switchHeader\"]//button[1]//span[1]//*[name()=\"svg\"]")
    WebElement pre;

    @FindBy(xpath = "//span[normalize-space()=\"OK\"]")
    WebElement btnOk;

    @FindBy(xpath = "//div[@id=\"probation-type\"]")
    WebElement drpProbationType;

    @FindBy(xpath = "//div[@id=\"Duration\"]")
    WebElement drpDuration;

    @FindBy(xpath = "//input[@name=\"notice_expiry\"]")
    WebElement txtNoticePeriod;

    @FindBy(xpath = "//input[@name=\"esic_no\"]")
    WebElement txtESIC;

    @FindBy(xpath = "//input[@name=\"uan_no\"]")
    WebElement txtUAN;

    @FindBy(xpath = "//input[@name=\"pf_no\"]")
    WebElement txtPF;

    @FindBy(xpath = "//input[@name=\"insurance_no\"]")
    WebElement txtInsuranceNumber;

    @FindBy(xpath = "//input[@name=\"insurance_pf\"]")
    WebElement txtInsurancePF;

    @FindBy(xpath = "//div[@id=\"reason_of_leaving\"]")
    WebElement drpReasonOfLeaving;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    public void clkSave()
    {
        btnSave.click();
        System.out.println("Form is Saved successfully");
    }

    public void selectReasonOfLeaving()
    {
        drpReasonOfLeaving.click();
        System.out.println("Clicked on the reason of leaving");

        WebElement select=driver.findElement(By.xpath("//li[normalize-space()=\"Resigned\"]"));
        select.click();
        System.out.println("Reason of leaving is selected");
    }

    public void enterUAN(String uan)
    {
        txtUAN.sendKeys(uan);
        System.out.println("UAN number is added");
    }

    public void enterPF(String pf)
    {
        txtPF.sendKeys(pf);
        System.out.println("PF number is added");
    }

    public void enterInsuranceNumber(String insuranceNumber)
    {
        txtInsuranceNumber.sendKeys(insuranceNumber);
        System.out.println("Insurance number is added");
    }

    public void enterInsurancePF(String insurancePF)
    {
        txtInsurancePF.sendKeys(insurancePF);
        System.out.println("Insurance PF number is added");
    }

    public void selectFile(String label, int index, String file)
    {
        String documents = "(//div[normalize-space()='" + label +"']/following::input[@type='file'])[" + index +"]";
        WebElement doc=driver.findElement(By.xpath(documents));

        doc.sendKeys(file);
        System.out.println("File is added is successfully" + label);
    }


    public void enterESIC(String esic)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(txtESIC));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1];", txtESIC, esic);
        System.out.println("Esic code added");
    }

    public void enterNoticePeriod(String noticePeriod)
    {
        txtNoticePeriod.sendKeys(noticePeriod);
        System.out.println("Notice period is added");
    }

    public void selectProbationType()
    {
        drpProbationType.click();
        System.out.println("Clicked on probation type");

        WebElement day=driver.findElement(By.xpath("//li[normalize-space()=\"Days\"]"));
        day.click();
        System.out.println("Probation type is selected");
    }

    public void selectDuration()
    {
        drpDuration.click();
        System.out.println("Clicked on Duration type");

        WebElement days=driver.findElement(By.xpath("//li[normalize-space()=\"30\"]"));
        days.click();
        System.out.println("Duration is selected");
    }

    public void clkEmploymentDetails()
    {
        btnEmploymentDetails.click();
        System.out.println("Clicked on Employment details");
    }

    public void selectNatureOfEmployment()
    {
        drpNatureOfEmployment.click();
        System.out.println("Clicked on Nature of Employment");

        WebElement list=driver.findElement(By.xpath("//li[normalize-space()=\"Full-time Employment\"]"));
        list.click();
        System.out.println("Nature of Employment is selected");
    }

    public void selectCalender(String label, int index, String expDate, String expYearMonth)
    {
        String cal="(//label[normalize-space()='" + label + "']/following::button//*[name()='svg'])["+ index +"]";
        WebElement calOption=driver.findElement(By.xpath(cal));
        calOption.click();
        System.out.println("Clicked on the Calender");

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter\"]")).getText();
            System.out.println("Year and Monthe fetched : " +yearMonth);

            if (yearMonth.equalsIgnoreCase(expYearMonth.trim()))
            {
                break;
            }
            pre.click();
            System.out.println("CLicked on the previous button");
        }

        List<WebElement> dates=driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

        for (WebElement alldates : dates)
        {
            if (alldates.getText().equals(expDate))
            {
                alldates.click();
                System.out.println("clicked on the date");
                break;
            }
        }
        btnOk.click();
        System.out.println("Cliked on the ok button");
    }

    public void selectContractEmployeeEndDate(String label, int index, String expDate, String expYearMonth)
    {
        String cal="(//p[normalize-space()='" + label + "']/following::button//*[name()='svg'])["+ index +"]";
        WebElement calOption=driver.findElement(By.xpath(cal));
        calOption.click();
        System.out.println("Clicked on the Calender");

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter\"]")).getText();
            System.out.println("Year and Monthe fetched : " +yearMonth);

            if (yearMonth.equalsIgnoreCase(expYearMonth.trim()))
            {
                break;
            }
            pre.click();
            System.out.println("CLicked on the previous button");
        }

        List<WebElement> dates=driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

        for (WebElement alldates : dates)
        {
            if (alldates.getText().equals(expDate))
            {
                alldates.click();
                System.out.println("clicked on the date");
                break;
            }
        }
        btnOk.click();
        System.out.println("Cliked on the ok button");
    }
}


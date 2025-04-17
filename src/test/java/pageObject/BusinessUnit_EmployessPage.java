package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BusinessUnit_EmployessPage extends BasePage{

    WebDriverWait wait;
    JavascriptExecutor js;
    Actions actions;

    public BusinessUnit_EmployessPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()=\"Add New Employee\"]")
    WebElement btnAddNewEmployee;

    @FindBy(xpath = "//table//tr[td[4][normalize-space()='yme@987gmail.com']]//button//*[name()='svg']")
    WebElement btnEditEmployee;

    public void clkEditEmployee()
    {
        btnEditEmployee.click();
    }

    @FindBy(xpath = "//input[@name=\"emp_id\"]")
    WebElement txtEmployeeId;

    @FindBy(xpath = "//input[@type='file']")
    WebElement selectProfilePic;

    @FindBy(xpath = "//label[normalize-space()='Salutation *']/following::div[@id='demo-simple-select'][1]")
    WebElement drpSalutation;

    @FindBy(xpath = "//input[@name=\"name_as_per_aadhar\"]")
    WebElement txtAadharName;

    @FindBy(xpath = "//input[@name=\"name\"]")
    WebElement txtFirstName;

    @FindBy(xpath = "//input[@name=\"m_name\"]")
    WebElement txtMiddleName;

    @FindBy(xpath = "//input[@name=\"l_name\"]")
    WebElement txtLastName;

    @FindBy(xpath = "//input[@name=\"dob\"]")
    WebElement calDOB;

    @FindBy(xpath = "(//label[@id='Gender']/following::div[@id='demo-simple-select'])[1]")
    WebElement drpGender;

    @FindBy(xpath = "(//label[normalize-space()=\"Blood Group\"]/following::div[@id='demo-simple-select'])[1]")
    WebElement drpBloodGroup;

    @FindBy(xpath = "//input[@name=\"religion\"]")
    WebElement txtReligion;

    @FindBy(xpath = "//input[@name=\"employee_email\"]")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@name=\"workEmail\"]")
    WebElement txtWorkEmail;

    @FindBy(xpath = "//input[@name=\"phone_number\"]")
    WebElement txtMobileNumber;

    @FindBy(xpath = "//input[@name=\"alternate_number\"]")
    WebElement txtAlternateNumber;

    @FindBy(xpath = "//input[@name=\"emergency_contact_person\"]")
    WebElement txtEmergencyPersonName;

    @FindBy(xpath = "//input[@name=\"emergency_contactNo\"]")
    WebElement txtEmergencyNumber;

    @FindBy(xpath = "//input[@name=\"address\"]")
    WebElement txtAddress;

    @FindBy(xpath = "//input[@name=\"pincode\"]")
    WebElement txtPinCode;

    @FindBy(xpath = "(//label[normalize-space()=\"Country\"]/following::div[@id='demo-simple-select'])[1]")
    WebElement drpCountry;

    @FindBy(xpath = "(//label[normalize-space()=\"State\"]/following::div[@id='demo-simple-select'])[1]")
    WebElement drpState;

    @FindBy(xpath = "//input[@name=\"city\"]")
    WebElement txtCity;

    @FindBy(xpath = "//input[@name=\"sameAsPermanentAddress\"]")
    WebElement chkPermanentAddress;

    @FindBy(xpath = "//input[@name=\"from_date_co\"]")
    WebElement calFromDate;

    @FindBy(xpath = "//input[@name=\"to_date_co\"]")
    WebElement calToDate;

    @FindBy(xpath = "//input[@name=\"comapany_name\"]")
    WebElement txtCompanyName;

    @FindBy(xpath = "//input[@name=\"designation\"]")
    WebElement txtDesignation;

    @FindBy(xpath = "//input[@name=\"last_salary\"]")
    WebElement txtLastSalary;

    @FindBy(xpath = "//input[@name=\"reporting_to\"]")
    WebElement txtToReporting;

    @FindBy(xpath = "//input[@name=\"mo_no\"]")
    WebElement txtMoNumber;

    @FindBy(xpath = "//input[@name=\"remark\"]")
    WebElement txtRemark;

    @FindBy(xpath = "(//div[normalize-space()='Appointment Letter']/following::input[@type=\"file\"])[1]")
    WebElement fileAppointmentLetter;

    @FindBy(xpath = "(//div[normalize-space()='Experience Letter']/following::input[@type=\"file\"])[1]")
    WebElement fileExperienceLetter;

    @FindBy(xpath = "(//div[normalize-space()='Salary Slip']/following::input[@type=\"file\"])[1]")
    WebElement fileSalarySlip;

    @FindBy(xpath = "(//div[normalize-space()='Relieving Letter']/following::input[@type=\"file\"])[1]")
    WebElement fileRelievingLetter;

    @FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
    WebElement btnAdd1;

    @FindBy(xpath = "(//button[normalize-space()='Add'])[2]")
    WebElement btnAdd2;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    @FindBy(xpath = "(//p[contains(text(),\"YOUR EDUCATION\")]/following::label[text()=\"Duration\"]/following::div//*[name()='svg'])[1]")
    WebElement calFrmDate;

    @FindBy(xpath = "(//p[contains(text(),\"YOUR EDUCATION\")]/following::label[text()=\"Duration\"]/following::div//*[name()='svg'])[2]")
    WebElement caltDate;

    @FindBy(xpath = "//div[@class=\"MuiPickersCalendarHeader-switchHeader\"]//button[1]//span[1]//*[name()=\"svg\"]")
    WebElement preArrow;

    @FindBy(xpath = "//span[normalize-space()=\"OK\"]")
    WebElement btnOK;

    public void clkAddNewEmployee()
    {
        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='90%';");
        btnAddNewEmployee.click();
    }

    public void enterEmployeeId(String employeeId)
    {
        txtEmployeeId.sendKeys(employeeId);
    }

    public void addProfilePic()
    {
        selectProfilePic.sendKeys("C:\\Users\\IPSL\\Downloads\\ipsImage.jpg");
    }

    public void selectSalutation()
    {
        drpSalutation.click();
        driver.findElement(By.xpath("//li[normalize-space()='Mr.']")).click();
    }

    public void enterAadharName(String aadharName)
    {
        txtAadharName.sendKeys(aadharName);
    }

    public void enterFirstName(String firstName)
    {
        txtFirstName.sendKeys(firstName);
    }

    public void enterMiddleName(String middleName)
    {
        txtMiddleName.sendKeys(middleName);
    }

    public void enterLastName(String lastName)
    {
        txtLastName.sendKeys(lastName);
    }

    public void enterDOB(String dob)
    {
        calDOB.sendKeys(dob);
    }

    public void selectGender()
    {
        drpGender.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"Male\"]")).click();
    }

    public void selectBloodGroup()
    {
        drpBloodGroup.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"O+\"]")).click();
    }

    public void enterReligion(String religion)
    {
        txtReligion.sendKeys(religion);
    }

    public void enterEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void enterWorkEmail(String workEmail)
    {
        txtWorkEmail.sendKeys(workEmail);
    }

    public void enterMobileNumber(String mobileNumber)
    {
        txtMobileNumber.sendKeys(mobileNumber);
    }

    public void enterAlternateNumber(String alternateNumber)
    {
        txtAlternateNumber.sendKeys(alternateNumber);
    }

    public void enterEmergencyPersonName(String emergencyName)
    {
        txtEmergencyPersonName.sendKeys(emergencyName);
    }

    public void enterEmergencyPersonNumber(String emergencyNumber)
    {
        txtEmergencyNumber.sendKeys(emergencyNumber);
    }

    public void enterAddress(String address)
    {
        txtAddress.sendKeys(address);
    }

    public void enterPincode(String pincode)
    {
        txtPinCode.sendKeys(pincode);
    }

    public void selectCountry()
    {
        try {
            drpCountry.click();
            WebElement select=driver.findElement(By.xpath("//li[normalize-space()=\"India\"]"));
            wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(select));
            js=(JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();",select);
            System.out.println("Country select");
        }
        catch (Exception e)
        {
            System.out.println("Country is not selected : Error is : " + e.getMessage());
        }

    }

    public void selectState()
    {
        drpState.click();
        WebElement con=driver.findElement(By.xpath("//li[normalize-space()=\"Maharashtra\"]"));
        actions=new Actions(driver);
        actions.moveToElement(con);
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",con);
    }

    public void enterCity(String city)
    {
        txtCity.sendKeys(city);
    }

    public void clkPermanentAddress()
    {
        chkPermanentAddress.click();
    }

    public void selectFromDate(String fromDate)
    {
        calFromDate.sendKeys(fromDate);
    }

    public void selectToDate(String toDate)
    {
        calToDate.sendKeys(toDate);
    }

    public void enterCompanyName(String company)
    {
        txtCompanyName.sendKeys(company);
    }

    public void enterDesignation(String designation)
    {
        txtDesignation.sendKeys(designation);
    }

    public void enterLastSalary(String lastSalary)
    {
        txtLastSalary.sendKeys(lastSalary);
    }

    public void enterToReporting(String reporting)
    {
        txtToReporting.sendKeys(reporting);
    }

    public void enterMoNumber(String number)
    {
        txtMoNumber.sendKeys(number);
    }

    public void enterRemark(String remark)
    {
        txtRemark.sendKeys(remark);
    }

    public void addAppointmentLetter()
    {
        fileAppointmentLetter.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
    }

    public void addExperienceLetter()
    {
        fileExperienceLetter.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
    }

    public void addSalarySlip()
    {
        fileSalarySlip.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
    }

    public void addRelievingLetter()
    {
        fileRelievingLetter.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
    }

    public void clkAdd1()
    {
        btnAdd1.click();
    }

    public void enterFrmDate()
    {
        String expMonthYear="June 2024";
        String expDate="16";

        calFrmDate.click();

        //select Month and Year

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//div//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
            System.out.println("Year and Month is : " + yearMonth);

            if(yearMonth.equals(expMonthYear))
            {
                break;
            }

            preArrow.click();

            //Select the Date

            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait until date picker buttons are visible
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                    By.xpath("//div//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']")
            ));

            List<WebElement> date=driver.findElements(By.xpath("//div//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

            for (WebElement dt : date)
            {
                if (dt.getText().equals(expDate))
                {
                    dt.click();
                    break;
                }
            }
        }
    }

    public void entertDate()
    {
        String expYearMonth="August 2024";
        String expDate="16";

        caltDate.click();

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//div//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
            System.out.println("Month and Year is : " + yearMonth);

            if (yearMonth.equals(expYearMonth))
            {
                break;
            }

            preArrow.click();
        }

        List<WebElement> date=driver.findElements(By.xpath("//div//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

        for (WebElement dt : date)
        {
            if (dt.getText().trim().equals(expDate))
            {
                js=(JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();",dt);
                break;
            }
        }
    }

    public void clkOK()
    {
        btnOK.click();
    }

    public void enterEducation()
    {
        WebElement edu=driver.findElement(By.xpath("(//label[normalize-space()=\"Education\"]/following::div[@id='demo-simple-select'])"));
        edu.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"Graduation\"]")).click();

        WebElement course=driver.findElement(By.xpath("(//label[@id='course']/following::div[@id='demo-simple-select'])"));
        course.click();
        WebElement select=driver.findElement(By.xpath("//li[normalize-space()=\"B.Sc\"]"));
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(select));
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", select);

        driver.findElement(By.xpath("//input[@name=\"stream\"]")).sendKeys("Computer Science");

        enterFrmDate();
        clkOK();
        entertDate();
        clkOK();

        driver.findElement(By.xpath("//input[@name=\"institute_name\"]")).sendKeys("ICL's Motilal Jhunjhunwala College");

        WebElement percentage=driver.findElement(By.xpath("//input[@name=\"percent\"]"));
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='70';", percentage);

        WebElement certificate=driver.findElement(By.xpath("(//div[normalize-space()='Certificate']/following::input[@type=\"file\"])[1]"));

        certificate.sendKeys("C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        btnAdd2.click();
    }

    public void clkSave()
    {
        btnSave.click();
    }
}

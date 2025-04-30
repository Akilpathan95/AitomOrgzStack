package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

public class Requirement_DetailsPage extends BasePage{

    Select select;

    public Requirement_DetailsPage(WebDriver driver)
    {
        super(driver);
    }

    //Requirement Details Section

    @FindBy(xpath = "//input[@name=\"job_title\"]")
    WebElement txtJob_Title;

    @FindBy(xpath = "//input[@name=\"positionId\"]")
    WebElement txtPositioin_Id;

    @FindBy(xpath = "//input[@name=\"position_Name\"]")
    WebElement txtPosition_Name;

    @FindBy(xpath = "//select[@name=\"priority\"]")
    WebElement drpPriority;

    @FindBy(xpath = "//select[@name=\"typeOfCandidate\"]")
    WebElement drpSelect_Candidate;

    @FindBy(xpath = "//input[@placeholder=\"No.of days\"]")
    WebElement txtTAT;

    @FindBy(xpath = "//input[@id=\"date-picker-inline\"]")
    WebElement dateRequiredBy_Date;

    @FindBy(xpath = "//select[@name=\"requirement_type\"]")
    WebElement drpRequirement_Type;

    @FindBy(xpath = "//input[@name=\"Notice_Period\"]")
    WebElement txtNotice_Period;

    @FindBy(xpath = "//input[@placeholder=\"Location Name\"]")
    List<WebElement> txtLocation_Name;

    @FindBy(xpath = "//input[@placeholder=\"Position\"]")
    List<WebElement> txtNo_Position;

    @FindBy(xpath = "//button[2]//*[name()=\"svg\"]")
    WebElement btnAddWork_Location;

    @FindBy(xpath = "//p[text()=\"Work Location \"]/following::button[1]//*[name()=\"svg\"]")
    WebElement btnSubWork_Location;

    @FindBy(xpath = "//input[@placeholder=\"0\"]")
    WebElement disable_TotalNoPosition;

    @FindBy(xpath = "(//div[contains(@class,'css-ackcql')])[1]")
    WebElement drp_Department; //No data for external

    @FindBy(xpath = "//select[@name=\"currency\"]")
    WebElement drpCurrency;

    @FindBy(xpath = "//select[@name=\"frequency\"]")
    WebElement drpSelect_Period;

    @FindBy(xpath = "//input[@name=\"toAmount\"]")
    WebElement txtCTC_Max;

    @FindBy(xpath = "//input[@name=\"fromAmount\"]")
    WebElement txtCTC_Min;

    @FindBy(xpath = "//select[@name=\"work_Model\"]")
    WebElement drpWork_Model;

    @FindBy(xpath = "//select[@name=\"shift_Type\"]")
    WebElement drpShift_Type;

    @FindBy(xpath = "//input[@name=\"target_Company\"]")
    WebElement txtTarget_Company;

    @FindBy(xpath = "//select[@name=\"gender\"]")
    WebElement drpGender;

    @FindBy(xpath = "//input[@name=\"age_from\"]")
    WebElement txtAgeGroup_From;

    @FindBy(xpath = "//input[@name=\"age_to\"]")
    WebElement txtAgeGroup_To;

    @FindBy(xpath = "//input[@name=\"exeperience_From\"]")
    WebElement txtExperience_From;

    @FindBy(xpath = "//input[@name=\"exeperience_To\"]")
    WebElement txtExperience_To;

    @FindBy(xpath = "//select[@name=\"skillset\"]")
    WebElement drpEducational_Qualification;

    @FindBy(xpath = "//div[contains(@class,\"7b7m-control\")]//div[contains(@class,\"Container\")]//*[name()=\"svg\"]")
    WebElement drpAdditional_Qualification;

    @FindBy(xpath = "//input[@name=\"alternative_Quali\"]")
    WebElement txtAlternate_Qualification;

    @FindBy(xpath = "//input[@name=\"remark\"]")
    WebElement txtAdd_Remark;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    @FindBy(xpath = "//button[normalize-space()=\"Reset\"]")
    WebElement btnReset;

    public void enterJob_Title(String job_Title)
    {
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '90%'");
        txtJob_Title.sendKeys(job_Title);
    }

    public void enterPosition_Id(String position_Id)
    {
        txtPositioin_Id.sendKeys(position_Id);
    }

    public void enterPosition_Name(String position_Name)
    {
        txtPosition_Name.sendKeys(position_Name);
    }

    public void selectPriority()
    {
        select=new Select(drpPriority);
        select.selectByValue("Medium");
    }

    public void clkSelect_Candidate()
    {
        select=new Select(drpSelect_Candidate);
        select.selectByValue("semiskilled");
    }

    public void enterTAT(String tat)
    {
        txtTAT.sendKeys(tat);
    }

    public void verifyDate(String tat)
    {
        String selected_Date=dateRequiredBy_Date.getAttribute("value"); //get the auto filled date

        //calculate Expected Date(todays date + TAT)
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); // This creates a date format where the date is represented as day/month/year. Example: If today's date is March 5, 2025, it will be formatted as "05/03/2025".
        Calendar cal=Calendar.getInstance(); //This gets the current system date and time. If today is March 5, 2025, cal.getTime() will represent March 5, 2025.
        cal.add(Calendar.DAY_OF_MONTH, Integer.parseInt(tat)); //
        String expectedDate=sdf.format(cal.getTime()); //Format Expected Date

        System.out.println("Auto  Selected Date : " +selected_Date);
        System.out.println("Expected Date : " +expectedDate);

        if (expectedDate.equals(selected_Date))
        {
            System.out.println("Dates are matching.");
            Assert.assertTrue(true);
        }
        else
        {
            System.out.println("Dates are not matching");
            Assert.fail();
        }

    }

    public void selectRequirement_Type()
    {
        select=new Select(drpRequirement_Type);
        select.selectByValue("Full Time");
    }

    public void enterNotice_Period(String notice_Period)
    {
        txtNotice_Period.sendKeys(notice_Period);
    }

    public void enterLocation_Name(String location_Name, int index)
    {
        txtLocation_Name.get(index).sendKeys(location_Name);
        //txtLocation_Name.sendKeys(location_Name);
    }

    public void enterNo_Position(String position, int index)
    {
        txtNo_Position.get(index).sendKeys(position);
        //txtNo_Position.sendKeys(position);
    }

    public void clkAdd_Work()
    {
        btnAddWork_Location.click();
    }

    public void clkSub_Work()
    {
        btnSubWork_Location.click();
    }

    public void countNo_OfPosition()
    {
        System.out.println("Number of positions are : " +disable_TotalNoPosition.getAttribute("value"));
    }

    public void selectCurrency()
    {
        select=new Select(drpCurrency);
        select.selectByValue("RUPEES");
    }

    public void selectPeriod()
    {
        select=new Select(drpSelect_Period);
        select.selectByValue("Yearly");
    }

    public void enterCTC_Min(String min)
    {
        txtCTC_Min.sendKeys(min);
    }

    public void enterCTC_Max(String max)
    {
        txtCTC_Max.sendKeys(max);
    }

    public void selectWork_Model()
    {
        select=new Select(drpWork_Model);
        select.selectByValue("Onsite");
    }

    public void enterTarget_Company(String target_Company)
    {
        txtTarget_Company.sendKeys(target_Company);
    }

    public void selectShift_Type()
    {
        select=new Select(drpShift_Type);
        select.selectByValue("Morning");
    }

    public void selectGender()
    {
        select=new Select(drpGender);
        select.selectByValue("Male");
    }

    public void enterAgeGroup_From(String from)
    {
        txtAgeGroup_From.sendKeys(from);
    }

    public void enterAgeGroup_To(String to)
    {
        txtAgeGroup_To.sendKeys(to);
    }

    public void enterExperience_From(String from)
    {
        txtExperience_From.sendKeys(from);
    }

    public void enterExperience_To(String to)
    {
        txtExperience_To.sendKeys(to);
    }

    public void selectEducational_Qualification()
    {
        select=new Select(drpEducational_Qualification);
        select.selectByValue("Bachelor_Degree");
    }

    public void waitForAdditional_Qualification()
    {
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(drpAdditional_Qualification));
    }

    public void selectAdditional_Qualification(String qualification)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(drpAdditional_Qualification)).click();
        System.out.println("clicked on the additional Qualification");
        List<WebElement> options=driver.findElements(By.xpath("//div[@class=\" css-mtovj2-menu\"]//div[@class=' css-yt9ioa-option']"));
        System.out.println("Number of options in the dropdown : " + options.size());
        for (WebElement option : options)
        {
            String optionText=option.getText();
            System.out.println (optionText);
            if (optionText.equals(qualification))
            {
                wait=new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.elementToBeClickable(option));
                option.click();
                break;
            }
        }
    }

    public void enterAlternate_Qualificatio(String qualification)
    {
        txtAlternate_Qualification.sendKeys(qualification);
    }

    public void enterAdd_Remark(String remark)
    {
        txtAdd_Remark.sendKeys(remark);
    }

    public void clkSave()
    {
        btnSave.click();
    }

}

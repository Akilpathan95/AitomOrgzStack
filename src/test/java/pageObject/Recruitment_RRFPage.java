package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Recruitment_RRFPage extends BasePage {

    public Recruitment_RRFPage(WebDriver driver)
    {
        super(driver);
    }

    WebDriverWait wait;

    @FindBy(xpath = "//input[@aria-label=\"compensation checkbox\"]")
    WebElement chkAddCompensation;

    @FindBy(xpath = "//a[normalize-space()=\"Open Form\"]")
    WebElement btnOpenForm;

    @FindBy(xpath = "//span[normalize-space()=\"+ Add More Compensation\"]")
    WebElement btnAddMoreCompensation;

    public void clkAddCompensation()
    {
        chkAddCompensation.click();
        System.out.println("Clicked on the Add Compensation Button");
    }

    public void clkOpenForm()
    {
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement btn=wait.until(ExpectedConditions.elementToBeClickable(btnOpenForm));
        btn.click();
        System.out.println("Clicked on the Open Form Button and Form is opened");
    }

    //Domestic

    public void enterTakeHomeSalary()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"Take Home Salary\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys("20000");
        System.out.println("Take Home Salary entered");
    }

    public void enterPFContribution()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"PF Contribution\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys("1500");
        System.out.println("PF Contribution Entered");
    }

    public void enterESICContribution()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"ESIC Contribution/Insurance\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys("1500");
        System.out.println("ESIC Contribution entered");

    }

    public void enterBonus()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"Bonus (Annual)\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys("700");
        System.out.println("Bonus Entered");
    }

    public void enterOthers()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"Others\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys("100");
        System.out.println("Others entered");
    }

    public void enterOT()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"OT (average)\"]/following::input[@placeholder='Enter Here'])[1]"));

        if (perMonth.isEnabled())
        {
            perMonth.sendKeys("200");
            System.out.println("OT is entered");
        }
        else
        {
            System.out.println("OT field disabled, So it is not entered");
        }

    }

    public void clkAddMoreCompensation()
    {
        btnAddMoreCompensation.click();
        System.out.println("Add More Compensation checkbox is entered");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value=\"Compensation Name\"]"))));
        WebElement fieldName=driver.findElement(By.xpath("//input[@value=\"Compensation Name\"]"));
        fieldName.sendKeys(Keys.CONTROL + "a");
        fieldName.sendKeys(Keys.DELETE);
        fieldName.sendKeys("Mobile Allowance");
        System.out.println("Mobile allownce field created");

        WebElement input=driver.findElement(By.xpath("(//input[@placeholder=\"Compensation Name\"]/following::input[@placeholder='Enter Here'])[1]"));
        input.sendKeys("699");
        System.out.println("Mobile Allownce entered");
    }

    public void enterWorkingDuration()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Working Hours / Day\"]/following::input[@placeholder='Enter Hours'])[1]"));
        perHours.sendKeys("9");
        System.out.println("Hours entered");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Working Hours / Day\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys("Working hours should be calculated on the basis of punching time");
        System.out.println("Comments added");
    }

    public void enterWorkingDays()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"No of working days per month\"]/following::input[@type='text'])[1]"));
        perHours.sendKeys("22");
        System.out.println("Working days per Month entered");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"No of working days per month\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys("4 hours is exceptional in 22 days");
        System.out.println("Comments added");
    }

    public void enterOTHOurs()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Avg OT Hrs Per Day\"]/following::input[@type='text'])[1]"));
        perHours.sendKeys("3");
        System.out.println("OT Hours added");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Avg OT Hrs Per Day\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys("Candidate will get 200 rs per hours for OT");
        System.out.println("Comments added");
    }

    public void selectRatePerHour()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Ot Rate Per Hour\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        perHours.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"Yes\"]")).click();
        System.out.println("OT Hours per day selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement rate=driver.findElement(By.xpath("(//div[normalize-space()=\"Ot Rate Per Hour\"]/following::input[@placeholder='Enter Rate'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(rate));
        rate.sendKeys("300");
        System.out.println("Food hours added");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Weekly Off\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys("comments added");
        System.out.println("Comments added");
    }

    public void selectFoodDuringHrs() throws InterruptedException {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Food During Working Hrs\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        perHours.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"Yes\"]")).click();
        System.out.println("Food Working Hours selected");

        Thread.sleep(5000);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement rate=driver.findElement(By.xpath("(//div[normalize-space()=\"Food During Working Hrs\"]/following::input[@placeholder='Enter Details'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(rate));
        rate.sendKeys("1");
        System.out.println("Food hours added");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Food During Working Hrs\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys("Comments added");
        System.out.println("Comments added");
    }

    public void selectWeeklyOff()
    {
        WebElement drp=driver.findElement(By.xpath("(//div[normalize-space()=\"Weekly Off\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        drp.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"Yes\"]")).click();
        System.out.println("Weekly Off added");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Weekly Off\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys("Weekly off should be on Sunday and Saturday");
        System.out.println("Comments added");
    }

}

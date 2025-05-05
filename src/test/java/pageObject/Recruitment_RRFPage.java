package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
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
    JavascriptExecutor js;

    //Domestic

    @FindBy(xpath = "//span[contains(@class, 'MuiCheckbox-root')]")
    WebElement chkAddCompensation;

    @FindBy(xpath = "//a[normalize-space()=\"Open Form\"]")
    WebElement btnOpenForm;

    @FindBy(xpath = "//span[normalize-space()=\"+ Add More Compensation\"]")
    WebElement btnAddMoreCompensation;

    @FindBy(xpath = "//span[normalize-space()=\"Save & Upload\"]")
    WebElement btnSaveAndUpload;

    public void clkSaveAndUpload()
    {
        btnSaveAndUpload.click();
    }

    public void clkAddCompensation()
    {
        js=(JavascriptExecutor) driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        js.executeScript("arguments[0].scrollIntoView(true);", chkAddCompensation);
        wait.until(ExpectedConditions.elementToBeClickable(chkAddCompensation));
        chkAddCompensation.click();System.out.println("Clicked on the Add Compensation Button");
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
        perMonth.sendKeys(Keys.CONTROL + "a");
        perMonth.sendKeys(Keys.DELETE);
        perMonth.sendKeys("20000");
        System.out.println("Take Home Salary entered");
    }

    public void enterPFContribution()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"PF Contribution\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys(Keys.CONTROL + "a");
        perMonth.sendKeys(Keys.DELETE);
        perMonth.sendKeys("1500");
        System.out.println("PF Contribution Entered");
    }

    public void enterESICContribution()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"ESIC Contribution/Insurance\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys(Keys.CONTROL + "a");
        perMonth.sendKeys(Keys.DELETE);
        perMonth.sendKeys("1500");
        System.out.println("ESIC Contribution entered");

    }

    public void enterBonus()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"Bonus (Annual)\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys(Keys.CONTROL + "a");
        perMonth.sendKeys(Keys.DELETE);
        perMonth.sendKeys("700");
        System.out.println("Bonus Entered");
    }

    public void enterOthers()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"Others\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys(Keys.CONTROL + "a");
        perMonth.sendKeys(Keys.DELETE);
        perMonth.sendKeys("100");
        System.out.println("Others entered");
    }

    public void enterOT()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"OT (average)\"]/following::input[@placeholder='Enter Here'])[1]"));

        if (perMonth.isEnabled())
        {
            perMonth.sendKeys(Keys.CONTROL + "a");
            perMonth.sendKeys(Keys.DELETE);
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
        input.sendKeys(Keys.CONTROL + "a");
        input.sendKeys(Keys.DELETE);
        input.sendKeys("699");
        System.out.println("Mobile Allownce entered");
    }

    public void enterWorkingDuration()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Working Hours / Day\"]/following::input[@placeholder='Enter Hours'])[1]"));
        perHours.sendKeys(Keys.CONTROL + "a");
        perHours.sendKeys(Keys.DELETE);
        perHours.sendKeys("9");
        System.out.println("Hours entered");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Working Hours / Day\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Working hours should be calculated on the basis of punching time");
        System.out.println("Comments added");
    }

    public void enterWorkingDays()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"No of working days per month\"]/following::input[@type='text'])[1]"));
        perHours.sendKeys(Keys.CONTROL + "a");
        perHours.sendKeys(Keys.ENTER);
        perHours.sendKeys("22");
        System.out.println("Working days per Month entered");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"No of working days per month\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("4 hours is exceptional in 22 days");
        System.out.println("Comments added");
    }

    public void enterOTHOurs()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Avg OT Hrs Per Day\"]/following::input[@type='text'])[1]"));
        perHours.sendKeys(Keys.CONTROL + "a");
        perHours.sendKeys(Keys.ENTER);
        perHours.sendKeys("3");
        System.out.println("OT Hours added");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Avg OT Hrs Per Day\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Candidate will get 200 rs per hours for OT");
        System.out.println("Comments added");
    }

    public void selectRatePerHour()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Ot Rate Per Hour\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        perHours.click();
        driver.findElement(By.xpath("//div[normalize-space()=\"Ot Rate Per Hour\"]/following::li[normalize-space()=\"Yes\"]")).click();
        System.out.println("OT Hours per day selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement rate=driver.findElement(By.xpath("(//div[normalize-space()=\"Ot Rate Per Hour\"]/following::input[@placeholder='Enter Rate'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(rate));
        rate.sendKeys(Keys.CONTROL + "a");
        rate.sendKeys(Keys.DELETE);
        rate.sendKeys("300");
        System.out.println("OT hours added");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Ot Rate Per Hour\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("comments added");
        System.out.println("Comments added");
    }

    public void selectFoodDuringHrs() {

        Actions actions=new Actions(driver);

        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Food During Working Hrs\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        actions.moveToElement(perHours).click().perform();

        WebElement yesOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Food During Working Hrs\"]/following::li[normalize-space()=\"Yes\"]")));
        actions.moveToElement(yesOption).click().perform();
        System.out.println("Food Working Hours selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            WebElement details=driver.findElement(By.xpath("(//div[normalize-space()=\"Food During Working Hrs\"]/following::input[@placeholder='Enter Details'])[1]"));
            wait.until(ExpectedConditions.visibilityOf(details));
            details.sendKeys(Keys.CONTROL + "a");
            details.sendKeys(Keys.DELETE);
            details.sendKeys("1");
            System.out.println("Food hours added");
        }
        catch (Exception e)
        {
            System.out.println("Field is not visible");
        }

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Food During Working Hrs\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Comments added");
        System.out.println("Comments added");
    }

    public void selectAccomodation() {

        Actions actions=new Actions(driver);

        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Accommodation Provided\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        actions.moveToElement(perHours).click().perform();

        WebElement yesOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Accommodation Provided\"]/following::li[normalize-space()=\"Yes\"]")));
        actions.moveToElement(yesOption).click().perform();
        System.out.println("Accommodation Provided selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            WebElement details=driver.findElement(By.xpath("(//div[normalize-space()=\"Accommodation Provided\"]/following::input[@placeholder='Enter Details'])[1]"));
            wait.until(ExpectedConditions.visibilityOf(details));
            details.sendKeys(Keys.CONTROL + "a");
            details.sendKeys(Keys.DELETE);
            details.sendKeys("1");
            System.out.println("Accommodation Provided added");
        }
        catch (Exception e)
        {
            System.out.println("Field is not visible");
        }

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Accommodation Provided\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Accommodation Provided Comments added");
        System.out.println("Comments added");
    }

    public void selectTransportation() {

        Actions actions=new Actions(driver);

        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Transportation To Work\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        actions.moveToElement(perHours).click().perform();

        WebElement yesOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Transportation To Work\"]/following::li[normalize-space()=\"Yes\"]")));
        actions.moveToElement(yesOption).click().perform();
        System.out.println("Transportation To Work selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            WebElement details=driver.findElement(By.xpath("(//div[normalize-space()=\"Transportation To Work\"]/following::input[@placeholder='Enter Details'])[1]"));
            wait.until(ExpectedConditions.visibilityOf(details));
            details.sendKeys(Keys.CONTROL + "a");
            details.sendKeys(Keys.DELETE);
            details.sendKeys("1");
            System.out.println("Transportation To Work added");
        }
        catch (Exception e)
        {
            System.out.println("Field is not visible");
        }

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Transportation To Work\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Transportation To Work Comments added");
        System.out.println("Comments added");
    }

    public void selectWeeklyOff()
    {
        WebElement drp=driver.findElement(By.xpath("(//div[normalize-space()=\"Weekly Off\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        drp.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"Yes\"]")).click();
        System.out.println("Weekly Off added");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Weekly Off\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Weekly off should be on Sunday and Saturday");
        System.out.println("Comments added");
    }

    public void selectAnnualLeaves() {

        Actions actions=new Actions(driver);

        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Annual Leaves\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        actions.moveToElement(perHours).click().perform();

        WebElement yesOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Annual Leaves\"]/following::li[normalize-space()=\"Yes\"]")));
        actions.moveToElement(yesOption).click().perform();
        System.out.println("Annual Leaves selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            WebElement details=driver.findElement(By.xpath("(//div[normalize-space()=\"Annual Leaves\"]/following::input[@placeholder='Enter Details'])[1]"));
            wait.until(ExpectedConditions.visibilityOf(details));
            details.sendKeys(Keys.CONTROL + "a");
            details.sendKeys(Keys.DELETE);
            details.sendKeys("1");
            System.out.println("Annual Leaves added");
        }
        catch (Exception e)
        {
            System.out.println("Field is not visible");
        }

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Annual Leaves\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Annual Leaves Comments added");
        System.out.println("Comments added");
    }

    public void selectRotationalShift() {

        Actions actions=new Actions(driver);

        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Rotational Shift\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        actions.moveToElement(perHours).click().perform();

        WebElement yesOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Rotational Shift\"]/following::li[normalize-space()=\"Yes\"]")));
        actions.moveToElement(yesOption).click().perform();
        System.out.println("Rotational Shift selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            WebElement details=driver.findElement(By.xpath("(//div[normalize-space()=\"Rotational Shift\"]/following::input[@placeholder='Enter Details'])[1]"));
            wait.until(ExpectedConditions.visibilityOf(details));
            details.sendKeys(Keys.CONTROL + "a");
            details.sendKeys(Keys.DELETE);
            details.sendKeys("1");
            System.out.println("Rotational Shift added");
        }
        catch (Exception e)
        {
            System.out.println("Field is not visible");
        }

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Rotational Shift\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Rotational Shift Comments added");
        System.out.println("Comments added");
    }

    public void selectNightAllownce()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Any Night Allowance\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        perHours.click();
        driver.findElement(By.xpath("//div[normalize-space()=\"Any Night Allowance\"]/following::li[normalize-space()=\"Yes\"]")).click();
        System.out.println("Any Night Allowance selected");

        try
        {
            wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement rate=driver.findElement(By.xpath("(//div[normalize-space()=\"Any Night Allowance\"]/following::input[@placeholder='Enter Details'])[1]"));
            wait.until(ExpectedConditions.visibilityOf(rate));
            rate.sendKeys(Keys.CONTROL + "a");
            rate.sendKeys(Keys.DELETE);
            rate.sendKeys("300");
            System.out.println("Any Night Allowance added");
        } catch (Exception e)
        {
            System.out.println("No Field found");
        }


        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Any Night Allowance\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Any Night Allowance added");
        System.out.println("Comments added");
    }

    public void selectGratuity()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Gratuity\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        perHours.click();
        driver.findElement(By.xpath("//div[normalize-space()=\"Gratuity\"]/following::li[normalize-space()=\"Yes\"]")).click();
        System.out.println("Gratuity selected");

        try
        {
            wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement rate=driver.findElement(By.xpath("(//div[normalize-space()=\"Gratuity\"]/following::input[@placeholder='Enter Details'])[1]"));
            wait.until(ExpectedConditions.visibilityOf(rate));
            rate.sendKeys(Keys.CONTROL + "a");
            rate.sendKeys(Keys.DELETE);
            rate.sendKeys("300");
            System.out.println("Gratuity added");
        }
        catch (Exception e)
        {
            System.out.println("Field not visible");
        }


        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Gratuity\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Gratuity added");
        System.out.println("Comments added");
    }

    //International
    @FindBy(xpath = "//input[@value=\"International\"]")
    WebElement rdbInternational;

    @FindBy(xpath = "//div[normalize-space()=\"AED (د.إ)\"]")
    WebElement drpCountry;

    public void selectCountry()
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(drpCountry));
        drpCountry.click();
        driver.findElement(By.xpath("//li[@data-value=\"INR\"]")).click();
    }

    public void clkInternational()
    {
        rdbInternational.click();
    }

    public void enterBasicSalary()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"Basic Salary\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys(Keys.CONTROL + "a");
        perMonth.sendKeys(Keys.DELETE);
        perMonth.sendKeys("20000");
        System.out.println("Basic Salary entered");
    }

    public void enterAccomodationAllowance()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"Accommodation allowance\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys(Keys.CONTROL + "a");
        perMonth.sendKeys(Keys.DELETE);
        perMonth.sendKeys("2000");
        System.out.println("Accomodation Allowance entered");
    }

    public void enterFoodAllowance()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"Food Allowance\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys(Keys.CONTROL + "a");
        perMonth.sendKeys(Keys.DELETE);
        perMonth.sendKeys("2000");
        System.out.println("Food Allowance entered");
    }

    public void enterInsurance()
    {
        WebElement perMonth=driver.findElement(By.xpath("(//div[normalize-space()=\"Insurance\"]/following::input[@placeholder='Enter Here'])[1]"));
        perMonth.sendKeys(Keys.CONTROL + "a");
        perMonth.sendKeys(Keys.DELETE);
        perMonth.sendKeys("700");
        System.out.println("Insurance Allowance entered");
    }

    public void selectInternationalRatePerHour()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"OT Rate Per Hour\"]/following::div[@aria-haspopup='listbox'])[1]"));
        perHours.click();
        driver.findElement(By.xpath("//div[normalize-space()=\"OT Rate Per Hour\"]/following::li[normalize-space()=\"Yes\"]")).click();
        System.out.println("OT Hours per day selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement rate=driver.findElement(By.xpath("(//div[normalize-space()=\"OT Rate Per Hour\"]/following::input[@placeholder='Enter Rate'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(rate));
        rate.sendKeys(Keys.CONTROL + "a");
        rate.sendKeys(Keys.DELETE);
        rate.sendKeys("300");
        System.out.println("OT hours added");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"OT Rate Per Hour\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("comments added");
        System.out.println("Comments added");
    }

    public void enterInternationalWorkingDuration()
    {
        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Working Hours / Day\"]/following::input[@type='text'])[1]"));
        perHours.sendKeys(Keys.CONTROL + "a");
        perHours.sendKeys(Keys.DELETE);
        perHours.sendKeys("9");
        System.out.println("Hours entered");

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Working Hours / Day\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Working hours should be calculated on the basis of punching time");
        System.out.println("Comments added");
    }

    public void selectAirFare() {

        Actions actions=new Actions(driver);

        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Air Fare For Going Home\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        actions.moveToElement(perHours).click().perform();

        WebElement yesOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Air Fare For Going Home\"]/following::li[normalize-space()=\"Yes\"]")));
        actions.moveToElement(yesOption).click().perform();
        System.out.println("Air Fare For Going Home selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            WebElement details=driver.findElement(By.xpath("(//div[normalize-space()=\"Air Fare For Going Home\"]/following::input[@placeholder='Enter Details'])[1]"));
            wait.until(ExpectedConditions.visibilityOf(details));
            details.sendKeys(Keys.CONTROL + "a");
            details.sendKeys(Keys.DELETE);
            details.sendKeys("1");
            System.out.println("Air Fare For Going Home added");
        }
        catch (Exception e)
        {
            System.out.println("Field is not visible");
        }

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Air Fare For Going Home\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Air Fare For Going Home Comments added");
        System.out.println("Comments added");
    }

    public void selectWorkVisa() {

        Actions actions=new Actions(driver);

        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Work Visa\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        actions.moveToElement(perHours).click().perform();

        WebElement yesOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Work Visa\"]/following::li[normalize-space()=\"Yes\"]")));
        actions.moveToElement(yesOption).click().perform();
        System.out.println("Work Visa selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            WebElement details=driver.findElement(By.xpath("(//div[normalize-space()=\"Work Visa\"]/following::input[@placeholder='Enter Details'])[1]"));
            wait.until(ExpectedConditions.visibilityOf(details));
            details.sendKeys(Keys.CONTROL + "a");
            details.sendKeys(Keys.DELETE);
            details.sendKeys("1");
            System.out.println("Work Visa Home added");
        }
        catch (Exception e)
        {
            System.out.println("Field is not visible");
        }

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Work Visa\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Work Visa Comments added");
        System.out.println("Comments added");
    }

    public void selecDurationOfEmployment() {

        Actions actions=new Actions(driver);

        WebElement perHours=driver.findElement(By.xpath("(//div[normalize-space()=\"Duration Of Employment\"]/following::div[@class='MuiFormControl-root MuiTextField-root'])[1]"));
        actions.moveToElement(perHours).click().perform();

        WebElement yesOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()=\"Duration Of Employment\"]/following::li[normalize-space()=\"Yes\"]")));
        actions.moveToElement(yesOption).click().perform();
        System.out.println("Duration Of Employment selected");

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            WebElement details=driver.findElement(By.xpath("(//div[normalize-space()=\"Duration Of Employment\"]/following::input[@placeholder='Enter Details'])[1]"));
            wait.until(ExpectedConditions.visibilityOf(details));
            details.sendKeys(Keys.CONTROL + "a");
            details.sendKeys(Keys.DELETE);
            details.sendKeys("1");
            System.out.println("Duration Of Employment Home added");
        }
        catch (Exception e)
        {
            System.out.println("Field is not visible");
        }

        WebElement comments=driver.findElement(By.xpath("(//div[normalize-space()=\"Duration Of Employment\"]/following::input[@placeholder='Comments'])[1]"));
        comments.sendKeys(Keys.CONTROL + "a");
        comments.sendKeys(Keys.DELETE);
        comments.sendKeys("Duration Of Employment Comments added");
        System.out.println("Comments added");
    }
}

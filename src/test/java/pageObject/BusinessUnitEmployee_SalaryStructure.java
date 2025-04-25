package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class BusinessUnitEmployee_SalaryStructure extends BasePage{

    public BusinessUnitEmployee_SalaryStructure(WebDriver driver)
    {
        super(driver);
    }

    Select select;

    @FindBy(xpath = "//span[normalize-space()=\"SALARY STRUCTURE\"]")
    WebElement btnSalaryStructure;

    @FindBy(xpath = "(//input[@name='pf1'])[1]")
    WebElement selectPFYes;

    @FindBy(xpath = "//input[@id=\"date\"]")
    WebElement txtCalender;

    @FindBy(xpath = "(//input[@name='esic1'])[1]")
    WebElement selectESIC;

    @FindBy(xpath = "(//input[@name='pt'])[1]")
    WebElement selectPT;

    @FindBy(xpath = "(//input[@name='lwf'])[1]")
    WebElement selectLWF;

    @FindBy(xpath = "//p[contains(text(), 'GROSS SALARY')]/following::input[@type='number'][1]")
    WebElement chkGrossSalary;

    @FindBy(xpath = "(//p[normalize-space()='PF']/following::select[contains(.,'Select')])[1]")
    WebElement drpPF;

    @FindBy(xpath = "(//p[normalize-space()='ESIC']/following::select[contains(.,'Select')])[1]")
    WebElement drpESIC;

    @FindBy(xpath = "(//p[normalize-space()='LWF']/following::select[contains(.,'Select')])[1]")
    WebElement drpLWF;

    @FindBy(xpath = "(//p[normalize-space()='Bonus']/following::select[contains(.,'Select')])[1]")
    WebElement drpBonus;

    @FindBy(xpath = "(//p[normalize-space()='Leave Wage']/following::select[contains(.,'Select')])[1]")
    WebElement drpLeaveWage;

    @FindBy(xpath = "(//p[normalize-space()='Gratuity']/following::select[contains(.,'Select')])[1]")
    WebElement drpGratuity;

    @FindBy(xpath = "(//p[normalize-space()=\"EMPLOYEE'S CONTRIBUTION\"]/following::select[contains(.,'Select')])[1]")
    WebElement drpPFEmployee;

    @FindBy(xpath = "(//p[normalize-space()=\"EMPLOYEE'S CONTRIBUTION\"]/following::select[contains(.,'Select')])[2]")
    WebElement drpESICEmployee;

    @FindBy(xpath = "(//p[normalize-space()=\"EMPLOYEE'S CONTRIBUTION\"]/following::select[contains(.,'Select')])[3]")
    WebElement drpProfessionalTax;

    @FindBy(xpath = "(//p[normalize-space()=\"EMPLOYEE'S CONTRIBUTION\"]/following::select[contains(.,'Select')])[4]")
    WebElement drpLWFEmployee;

    @FindBy(xpath = "(//p[normalize-space()=\"NOTE\"]/following::button//*[name()=\"svg\"])[2]")
    WebElement chlplus;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    @FindBy(xpath = "//button[normalize-space()=\"Revise Salary\"]")
    WebElement btnReviseSalary;

    @FindBy(xpath = "//p[normalize-space()=\"Remarks\"]/following::input[@type=\"text\"]")
    WebElement txtRemarks;

    @FindBy(xpath = "//p[normalize-space()='EFFECTIVE FROM']/following::span//*[name()='svg']")
    WebElement clkCal;

    @FindBy (xpath = "//div[@class=\"MuiPickersCalendarHeader-switchHeader\"]//button[1]//span[1]//*[name()=\"svg\"]")
    WebElement pre;

    @FindBy(xpath = "//span[normalize-space()=\"OK\"]")
    WebElement btnOk;

    @FindBy(xpath = "//button[normalize-space()=\"Salary Structure Preview\"]")
    WebElement btnSalaryStructurePreview;

    public void clkSalaryStructurePreview()
    {
        btnSalaryStructurePreview.sendKeys(Keys.PAGE_UP);
        btnSalaryStructurePreview.click();
        System.out.println("Clicked on the Salary Preview button");
        String curTitle=driver.getTitle();
        System.out.println("Page title is : " + curTitle);
        String expeTitle="Orgzstack";
        Assert.assertEquals(curTitle, expeTitle, "Title not matched.");
    }

    public void clkPFYes()
    {
        selectPFYes.click();
        System.out.println("Clicked on PF applicable option");
    }

    public void enterCalender(String calender)
    {
        txtCalender.sendKeys(calender);
        System.out.println("Date selected");
    }

    public void clkESIC()
    {
        selectESIC.click();
        System.out.println("Clicked on ESIC applicable option");
    }

    public void clkPT()
    {
        selectPT.click();
        System.out.println("Clicked on PT applicable option");
    }

    public void clkLWF()
    {
        selectLWF.click();
        System.out.println("Clicked on LWF applicable option");
    }

    public void inputFields(String label, String value)
    {
        String allownces="(//p[normalize-space()='" + label +"']/following::input[@type='number'])[1]";
        WebElement fields=driver.findElement(By.xpath(allownces));

        fields.sendKeys(Keys.CONTROL + "a");
        fields.sendKeys(Keys.DELETE);
        System.out.println("Current values deleted");
        fields.sendKeys(value);
        System.out.println(label + " : value added");
    }

    public void verifyGrossSalary(int basic, int da, int hra)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(chkGrossSalary));

        Actions actions=new Actions(driver);
        actions.moveToElement(chkGrossSalary);
        String actualValue=chkGrossSalary.getAttribute("value");
        int expectedValue=basic+da+hra;
        System.out.println("Actual value is : " + actualValue);
        System.out.println("Expected value is : " + expectedValue);

        Assert.assertEquals(Integer.parseInt(actualValue), expectedValue, "gross salary mismatch");
    }

    public void selectPFEmployer()
    {
        select=new Select(drpPF);
        select.selectByValue("((Basic+DA)/100)*13");
    }

    public void selectESICEmployer()
    {
        select=new Select(drpESIC);
        select.selectByValue("Gross > 21000 ? 0 : (Gross/100)*3.25");
    }

    public void selectLWFEmployer()
    {
        select=new Select(drpLWF);
        select.selectByValue("Maharashtra");
        System.out.println("LWF Employer is added");
    }

    public void selectBonus()
    {
        select=new Select(drpBonus);
        select.selectByValue("Manual");
        System.out.println("Bonus is Selected");

        WebElement input=driver.findElement(By.xpath("(//p[normalize-space()=\"Bonus\"]/following::input[@type='number'])[1]"));
        input.sendKeys(Keys.CONTROL + "a");
        input.sendKeys(Keys.DELETE);
        System.out.println("Bonus is Deleted");
        input.sendKeys("25000");
        System.out.println("Bonus is added");
    }

    public void selectLeaveWage()
    {
        select=new Select(drpLeaveWage);
        select.selectByValue("Manual");
        System.out.println("Leave Wage is selected");

        WebElement input=driver.findElement(By.xpath("(//p[normalize-space()=\"Leave Wage\"]/following::input[@type='number'])[1]"));
        input.sendKeys(Keys.CONTROL + "a");
        input.sendKeys(Keys.DELETE);
        System.out.println("Leave Wage is Deleted");
        input.sendKeys("2500");
        System.out.println("Leave Wage is added");
    }

    public void selectGratuity()
    {
        select=new Select(drpGratuity);
        select.selectByValue("Manual");
        System.out.println("Gratuity is selected");

        WebElement input=driver.findElement(By.xpath("(//p[normalize-space()=\"Gratuity\"]/following::input[@type='number'])[1]"));
        input.sendKeys(Keys.CONTROL + "a");
        input.sendKeys(Keys.DELETE);
        System.out.println("Gratuity is Deleted");
        input.sendKeys("2500");
        System.out.println("Gratuity is added");
    }

    public void selectPFEmployee()
    {
        select=new Select(drpPFEmployee);
        select.selectByValue("((Basic+DA)/100)*12");
        System.out.println("PF is selected");
    }

    public void selectESICEmployee()
    {
        select=new Select(drpESICEmployee);
        select.selectByValue("Gross > 21000 ? 0 : (Gross/100)*0.75");
        System.out.println("Employee ESIC is selected");
    }

    public void selectProfessionalTax()
    {
        select=new Select(drpProfessionalTax);
        select.selectByValue("Maharashtra");
        System.out.println("Professional Tax is selected");
    }

    public void selectLWFEmployee()
    {
        select=new Select(drpLWFEmployee);
        select.selectByValue("Maharashtra");
        System.out.println("LWF is selected");
    }

    public void clkplus()
    {
        chlplus.click();

        WebElement input=driver.findElement(By.xpath("(//p[normalize-space()=\"NOTE\"]/following::input[contains(@style, 'width: 100%; height: 34px;')])"));
        input.sendKeys("Good");
    }

    public void revisedInputFields(String label, String value)
    {
        String allownces="(//tr[normalize-space()=\"" + label + "\"]//td//input[@type='number'])[1]";
        WebElement fields=driver.findElement(By.xpath(allownces));

        fields.sendKeys(Keys.CONTROL + "a");
        fields.sendKeys(Keys.DELETE);
        System.out.println("Current values deleted");
        fields.sendKeys(value);
        System.out.println(label + " : value added");
    }

    public void reviseddrp(String label, int index, String selectValue)
    {
        String allownces="(//th[normalize-space()=\"" + label + "\"]/following::select)["+ index +"]";
        WebElement fields=driver.findElement(By.xpath(allownces));

        select=new Select(fields);
        select.selectByVisibleText(selectValue);
        System.out.println("Values is selected from the dropdown : " + label);
    }

    public void clkRevisedSalary()
    {
        btnReviseSalary.click();
        System.out.println("Clicked on the Revised Salary button");
    }

    public void clkSalaryStructure()
    {
        btnSalaryStructure.click();
        System.out.println("Clicked on Salary Structure button");
    }

    public void enterRemarks(String remarks)
    {
        txtRemarks.sendKeys(remarks);
        System.out.println("Remarks added");
    }

    public void clkSave()
    {
        btnSave.click();
        System.out.println("Clicked on the save button");
    }

    public void cal()
    {
        clkCal.click();
        System.out.println("Calender is opened");

        String expYearMonth="March 2025";
        String expDate="1";

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter\"]")).getText();

            if (yearMonth.equals(expYearMonth))
            {
                System.out.println("Actual Date matched with the expected Date");
                break;
            }
            pre.click();
            System.out.println("Clicked on the previous button");
        }

        List<WebElement> dates=driver.findElements(By.xpath("//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiPickersDay-day\"]"));

        for (WebElement allDates : dates)
        {
            if (allDates.getText().equals(expDate))
            {
                allDates.click();
                System.out.println("Date is selected");
                break;
            }
        }
        btnOk.click();
        System.out.println("Date is saved");
    }
}

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

    public void clkSalaryStructure()
    {
        btnSalaryStructure.click();
        System.out.println("Clicked on Salary Structure button");
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
    }

    public void selectBonus()
    {
        select=new Select(drpBonus);
        select.selectByValue("Manual");

        WebElement input=driver.findElement(By.xpath("(//p[normalize-space()=\"Bonus\"]/following::input[@type='number'])[1]"));
        input.sendKeys(Keys.CONTROL + "a");
        input.sendKeys(Keys.DELETE);
        input.sendKeys("25000");
    }

    public void selectLeaveWage()
    {
        select=new Select(drpLeaveWage);
        select.selectByValue("Manual");

        WebElement input=driver.findElement(By.xpath("(//p[normalize-space()=\"Leave Wage\"]/following::input[@type='number'])[1]"));
        input.sendKeys(Keys.CONTROL + "a");
        input.sendKeys(Keys.DELETE);
        input.sendKeys("2500");
    }

    public void selectGratuity()
    {
        select=new Select(drpGratuity);
        select.selectByValue("Manual");

        WebElement input=driver.findElement(By.xpath("(//p[normalize-space()=\"Gratuity\"]/following::input[@type='number'])[1]"));
        input.sendKeys(Keys.CONTROL + "a");
        input.sendKeys(Keys.DELETE);
        input.sendKeys("2500");
    }

    public void selectPFEmployee()
    {
        select=new Select(drpPFEmployee);
        select.selectByValue("((Basic+DA)/100)*12");
    }

    public void selectESICEmployee()
    {
        select=new Select(drpESICEmployee);
        select.selectByValue("Gross > 21000 ? 0 : (Gross/100)*0.75");
    }

    public void selectProfessionalTax()
    {
        select=new Select(drpProfessionalTax);
        select.selectByValue("Maharashtra");
    }

    public void selectLWFEmployee()
    {
        select=new Select(drpLWFEmployee);
        select.selectByValue("Maharashtra");
    }

    public void clkplus()
    {
        chlplus.click();

        WebElement input=driver.findElement(By.xpath("(//p[normalize-space()=\"NOTE\"]/following::input[contains(@style, 'width: 100%; height: 34px;')])"));
        input.sendKeys("Good");
    }

    public void clkSave()
    {
        btnSave.click();
    }
}

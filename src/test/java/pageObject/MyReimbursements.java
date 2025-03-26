package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyReimbursements extends BasePage{

    public MyReimbursements(WebDriver driver)
    {
        super(driver);
    }

    @FindBy (xpath = "//p[normalize-space()=\"Advance\"]")
    WebElement btnAdvance;

    @FindBy(xpath = "//div[normalize-space()=\"Travel Advance\"]")
    WebElement btnTravelAdvance;

    @FindBy (xpath = "(//button[contains(@aria-label,'change date')])[1]")
    WebElement drpTravelDateFrom;

    @FindBy(xpath = "(//button[contains(@aria-label,'change date')])[2]")
    WebElement drpTravelDateTo;

    @FindBy(xpath = "//input[@name=\"locnFrom\"]")
    WebElement txtlocationFrom;

    @FindBy(xpath = "//input[@name=\"locnTo\"]")
    WebElement txtlocationTo;

    @FindBy(xpath = "//input[@placeholder=\"Amount\"]")
    WebElement txtAmount;

    @FindBy(xpath = "//textarea[@id=\"fullWidth\"]")
    WebElement txtAddRemark;

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement btnSubmit;

    @FindBy(xpath = "//button[normalize-space()=\"submit\"]")
    WebElement btnSubmitOtherExpense;

    @FindBy(xpath = "//span[normalize-space()=\"OK\"]")
    WebElement btnOK;

    @FindBy(xpath = "//div[contains(@class,\"MuiDialogContent-root MuiPickersModal-dialog\")]//button[2]//span[1]//*[name()=\"svg\"]")
    WebElement nextArrow;

    @FindBy(xpath = "//div[normalize-space()=\"Other Advance\"]")
    WebElement btnOtherAdvance;

    @FindBy(xpath = "//div[@id=\"demo-select-small-outlined\"]")
    WebElement drpAdvanceType;

    public void clkAdvance()
    {
        btnAdvance.click();
    }

    public void clkTravelAdvance()
    {
        btnTravelAdvance.click();
    }

    public void selectnextArrow()
    {
        nextArrow.click();
    }

    public void selectTravelDateFrom() throws InterruptedException {
        String expMonthYear="April 2025";
        String expDate="26";

        drpTravelDateFrom.click();

        //Select Month and year

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//div//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
            System.out.println("Year and Month is : " + yearMonth); //This will return actual year and month

            if (yearMonth.equals(expMonthYear))
            {
                break;
            }

            nextArrow.click();
        }

        //Select the Date
        List<WebElement> date=driver.findElements(By.xpath("//div//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

        for (WebElement alldates : date)
        {
            if (alldates.getText().equals(expDate))
            {
                alldates.click();
                break;
            }
        }
    }

    public void selectTravelDateTo() throws InterruptedException {
        String expMonthYear="April 2025";
        String expDate="28";

        drpTravelDateTo.click();

        //Select Month and year

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//div//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
            System.out.println("Year and Month is : " + yearMonth); //This will return actual year and month

            if (yearMonth.equals(expMonthYear))
            {
                break;
            }

            nextArrow.click();
        }

        //Select the Date
        List<WebElement> date=driver.findElements(By.xpath("//div//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

        for (WebElement alldates : date)
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

    public void enterLocationFrom(String from)
    {
        txtlocationFrom.sendKeys(from);
    }

    public void enterLocationTo(String to)
    {
        txtlocationTo.sendKeys(to);
    }

    public void enterAmount(String amount)
    {
        txtAmount.sendKeys(amount);
    }

    public void enterAddRemark(String remark)
    {
        txtAddRemark.sendKeys(remark);
    }

    public void clkSubmit()
    {
        btnSubmit.click();
    }

    public void clkOtherAdvance()
    {
        btnOtherAdvance.click();
    }

    public void clkAdvanceType()
    {
        drpAdvanceType.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"Rent Advance\"]")).click();

    }

    public void clkSubmitOtherAdvance()
    {
        btnSubmitOtherExpense.click();
    }
}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BusinessUnitEmployee_Mapping extends BasePage{

    public BusinessUnitEmployee_Mapping(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()=\"OK\"]")
    WebElement btnOK;

    @FindBy(xpath = "//span[normalize-space()=\"Cancel\"]")
    WebElement btnCancel;

    @FindBy(xpath = "//span[normalize-space()=\"MAPPING\"]")
    WebElement btnMapping;

    @FindBy(xpath = "//div[@class=\"MuiPickersCalendarHeader-switchHeader\"]//button[1]//span[1]//*[name()=\"svg\"]")
    WebElement pre;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    public void clkSave()
    {
        btnSave.click();
    }

    public void drpField(int index, String labelName, String value) {
        String drpXpath="(//label[normalize-space()='" + labelName + "']/following::div[contains(@id,'demo-simple-select')])[" + index + "]";
        WebElement drp=driver.findElement(By.xpath(drpXpath));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdown =wait.until(ExpectedConditions.elementToBeClickable(drp));
        dropdown.click();
        System.out.println("Clicked on textField : " + dropdown);

        String valueXpath="//div[normalize-space()='" + value +"']";
        WebElement val=driver.findElement(By.xpath(valueXpath));

        WebElement values=wait.until(ExpectedConditions.elementToBeClickable(val));
        values.click();
        System.out.println("Value is selected : " + value);
    }

    public void calender(int ind, String expYearMonth, String expDate)
    {
        String calIndex="(//label[normalize-space()=\"Reporting Manager\"]/following::button//*[name()='svg'])["+ind+"]";
        WebElement index=driver.findElement(By.xpath(calIndex));

        index.click();

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter\"]")).getText();
            System.out.println("Year and Month Fetched : " + yearMonth);

            if (yearMonth.equalsIgnoreCase(expYearMonth.trim()))
            {
                System.out.println("Year and Month fetched : " + yearMonth);
                break;
            }

            pre.click();
            System.out.println("Clicked on the previous button : " + pre);
        }

        List<WebElement> allDates=driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

        for (WebElement dates : allDates)
        {
            if (dates.getText().equals(expDate))
            {
                dates.click();
                System.out.println("Clicked on the Previuos button : " + dates);
                break;
            }
        }
            btnOK.click();
    }

    public void clkMapping()
    {
        btnMapping.click();
    }
}

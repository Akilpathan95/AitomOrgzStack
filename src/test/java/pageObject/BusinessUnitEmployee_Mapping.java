package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessUnitEmployee_Mapping extends BasePage{

    public BusinessUnitEmployee_Mapping(WebDriver driver)
    {
        super(driver);
    }

    public WebElement calender(int ind)
    {
        String calIndex="(//label[normalize-space()=\"Reporting Manager\"]/following::button//*[name()='svg'])["+ind+"]";
        return driver.findElement(By.xpath(calIndex));
    }

    @FindBy(xpath = "//span[normalize-space()=\"OK\"]")
    WebElement btnOK;

    @FindBy(xpath = "//span[normalize-space()=\"MAPPING\"]")
    WebElement btnMapping;

    public void clkCalender()
    {
        calender(1).click();
    }

    public void clkOK()
    {
        btnOK.click();
    }

    public void clkMapping()
    {
        btnMapping.click();
    }
}

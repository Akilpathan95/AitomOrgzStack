package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessUnit_BasicInfo extends BasePage{

    public BusinessUnit_BasicInfo(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@name=\"client_name\"]")
    WebElement txtBusinessUnitName;

    @FindBy(xpath = "//input[@name=\"client_code\"]")
    WebElement txtCode;

    @FindBy(xpath = "//input[@name=\"address1\"]")
    WebElement txtAddress;

    @FindBy(xpath = "//input[@name=\"line_2\"]")
    WebElement txtLine2;

    public void enterBusinessUnitName(String name)
    {
        txtBusinessUnitName.sendKeys(name);
    }

    public void enterCode(String code)
    {
        txtCode.sendKeys(code);
    }

    public void enterAddress(String address)
    {
        txtAddress.sendKeys(address);
    }

    public void enterLine2(String line2)
    {
        txtLine2.sendKeys(line2);
    }
}

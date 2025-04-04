package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrgSetup_CodePage extends BasePage {

    public OrgSetup_CodePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy (xpath = "//select[@class=\"border-b-2 border-black-500\"]")
    WebElement selectCompany;

    @FindBy(xpath = "(//input[@id='standard-basic'])[1]")
    WebElement txtName;

    @FindBy(xpath = "(//input[@id='standard-basic'])[2]")
    WebElement txtCode;

    @FindBy(xpath = "(//input[@id='standard-basic'])[3]")
    WebElement txtDescription;

    @FindBy(xpath = "//button[normalize-space()=\"Add New\"]")
    WebElement btnAdd;

    public void clkCompany()
    {
        Select select=new Select(selectCompany);
        select.selectByVisibleText("Informatic Connecting Tech Pvt.Ltd.");
    }

    public void enterName(String name)
    {
        txtName.sendKeys(name);
    }

    public void enterCode(String code)
    {
        txtCode.sendKeys(code);
    }

    public void enterDescrption(String descrption)
    {
        txtDescription.sendKeys(descrption);
    }

    public void clkAdd()
    {
        btnAdd.click();
    }
}


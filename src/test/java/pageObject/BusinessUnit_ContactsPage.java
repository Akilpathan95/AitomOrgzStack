package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessUnit_ContactsPage extends BasePage{

    public BusinessUnit_ContactsPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='Add New']")
    WebElement btnAddNew;

    @FindBy(xpath = "(//input[@name='name'])[2]")
    WebElement txtName;

    @FindBy(xpath = "(//input[@name='designation'])[2]")
    WebElement txtDesignation;

    public void clkAddNew()
    {
        btnAddNew.click();
    }

    public void enterName(String name)
    {
        txtName.sendKeys(name);
    }

    public void enterDesignation(String designation)
    {
        txtDesignation.sendKeys(Keys.CONTROL + "a");
        txtDesignation.sendKeys(Keys.DELETE);
        System.out.println("Designation field is cleared");
        txtDesignation.sendKeys(designation);
        System.out.println("Designation field is entered");
    }
}

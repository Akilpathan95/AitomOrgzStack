package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BusinessUnit_ContactsPage extends BasePage{

    public BusinessUnit_ContactsPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='Add New']")
    WebElement btnAddNew;

    @FindBy(xpath = "(//input[@name='name'])")
    List<WebElement> txtName;

    @FindBy(xpath = "(//input[@name='designation'])")
    List<WebElement> txtDesignation;

    @FindBy(xpath = "(//input[@name='mobile_no'])")
    List<WebElement> txtMobileNo;

    @FindBy(xpath = "(//input[@name='email'])")
    List<WebElement> txtEmail;

    @FindBy(xpath = "(//input[@name='department'])")
    List<WebElement> txtDepartment;

    @FindBy(xpath = "(//input[@name='anniversary'])")
    List<WebElement> calAnniversary;

    @FindBy(xpath = "(//input[@name='dob'])")
    List<WebElement> calDOB;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    WebElement txtSearch;

    @FindBy(xpath = "//button[normalize-space()=\"Update\"]")
    WebElement btnUpdate;

    public void clkAddNew()
    {
        btnAddNew.click();
    }

    public void enterName(String inputName)
    {
        for (WebElement name : txtName)
        {
            if (name.isDisplayed())
            {
                name.sendKeys(inputName);
                break;
            }
        }
    }

    public void enterDesignation(String designation)
    {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until at least one 'designation' input is visible
        wait.until(driver -> txtDesignation.stream().anyMatch(WebElement::isDisplayed));
        for (WebElement input : txtDesignation)
        {
            if (input.isDisplayed())
            {
                input.sendKeys(Keys.CONTROL + "a");
                input.sendKeys(Keys.DELETE);
                System.out.println("Designation field is cleared");
                input.sendKeys(designation);
                System.out.println("Designation field is entered");
                break;
            }
        }
    }

    public void enterMobileNo(String mobile)
    {
        for (WebElement input : txtMobileNo)
        {
            if (input.isDisplayed())
            {
                input.sendKeys(Keys.CONTROL + "a");
                input.sendKeys(Keys.DELETE);
                System.out.println("Mobile Number is cleared");
                input.sendKeys(mobile);
                System.out.println("Mobile Number is entered");
            }
        }
    }

    public void enterEmail(String email)
    {
        for (WebElement input : txtEmail)
        {
            if (input.isDisplayed())
            {
                input.sendKeys(Keys.CONTROL + "a");
                input.sendKeys(Keys.DELETE);
                System.out.println("Email field is cleared");
                input.sendKeys(email);
                System.out.println("Email field is entered");
            }
        }
    }

    public void enterDepartment(String department)
    {
        for (WebElement input : txtDepartment)
        {
            if (input.isDisplayed())
            {
                input.sendKeys(Keys.CONTROL + "a");
                input.sendKeys(Keys.DELETE);
                System.out.println("Department field is cleared");
                input.sendKeys(department);
                System.out.println("Department field is entered");
            }
        }
    }

    public void selectAnniversary(String anniversary)
    {
        for (WebElement input : calAnniversary)
        {
            if (input.isDisplayed())
            {
                input.sendKeys(Keys.CONTROL + "a");
                input.sendKeys(Keys.DELETE);
                System.out.println("Anniversary date is cleared");
                input.sendKeys(anniversary);
                System.out.println("Anniversary date is entered");
            }
        }
    }

    public void selectDOB(String dob)
    {
        for (WebElement input : calDOB)
        {
            if (input.isDisplayed())
            {
                input.sendKeys(Keys.CONTROL + "a");
                input.sendKeys(Keys.DELETE);
                System.out.println("DOB date is cleared");
                input.sendKeys(dob);
                System.out.println("DOB date is entered");
            }
        }
    }

    public void clkSave()
    {
        btnSave.click();
    }

    public void enterSearch(String search)
    {
        txtSearch.sendKeys(Keys.CONTROL + "a");
        txtSearch.sendKeys(Keys.DELETE);
        System.out.println("Search field is cleared");
        txtSearch.sendKeys(search);
        System.out.println("Search field is entered");
    }

    public void clkDelete()
    {
        driver.findElement(By.xpath("(//table//tr[td[2][normalize-space()='Rhutik']]//button//*[name()='svg'])[1]")).click();
        System.out.println("Record is deleted");
    }

    public void clkEdit()
    {
        driver.findElement(By.xpath("(//table//tr[td[2][normalize-space()='Rhutik']]//button//*[name()='svg'])[2]")).click();
        System.out.println("Edit button is clicked");
    }

    public void clkUpdate()
    {
        btnUpdate.click();
        System.out.println("Update button is clicked");
    }
}

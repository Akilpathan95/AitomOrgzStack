package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class OrgSetup_CodePage extends BasePage {

    public OrgSetup_CodePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy (xpath = "//select[@class=\"border-b-2 border-black-500\"]")
    WebElement selectCompany;

    @FindBy(xpath = "(//input[contains(@name, 'name')])[1]")
    WebElement txtName;

    @FindBy(xpath = "//input[contains(@name, 'code')]")
    WebElement txtCode;

    @FindBy(xpath = "//input[translate(@name, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = 'description']")
    WebElement txtDescription;

    @FindBy(xpath = "//button[starts-with(text(),'Add')]")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@type=\"Number\"]")
    WebElement txtRadius;

    @FindBy(xpath = "//input[@name=\"city\"]")
    WebElement txtCity;

    @FindBy(xpath = "//button[normalize-space()=\"Set Address\"]")
    WebElement btnSetAddress;

    @FindBy(xpath = "//input[contains(@placeholder, 'Search')]")
    WebElement txtSearch;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnEdit;

    @FindBy(xpath = "//button[normalize-space()=\"Update\"]")
    WebElement btnUpdate;

    @FindBy(xpath = "(//button[text()='Delete'])[1]")
    WebElement btnDelete;

    public void clkCompany()
    {
        Select select=new Select(selectCompany);
        select.selectByVisibleText("Informatic Connecting Tech Pvt.Ltd.");
        System.out.println("Company is select");
    }

    public void enterName(String name)
    {
        txtName.sendKeys(name);
        System.out.println("Name is entered");
    }

    public void enterCode(String code)
    {
        txtCode.sendKeys(Keys.CONTROL + "a");
        txtCode.sendKeys(Keys.DELETE);
        System.out.println("Clear the code");
        txtCode.sendKeys(code);
        System.out.println("Code added or Updated Successfully");
    }

    public void enterDescrption(String descrption)
    {
        txtDescription.sendKeys(Keys.CONTROL + "a");
        txtDescription.sendKeys(Keys.DELETE);
        System.out.println("Description Cleared successfully");
        txtDescription.sendKeys(descrption);
        System.out.println("Description added or cleared successfully");
    }

    public void clkAdd()
    {
        btnAdd.click();
        System.out.println("Entry is Added successfully");
    }

    public void enterPlaceholder(String placeholder)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for input box to be visible
        WebElement locationInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Customized your placeholder']")
        ));

        // Use JavaScript to click if standard click fails
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", locationInput);

        // Type in the location
        locationInput.clear();
        System.out.println("Location cleared successfully");
        locationInput.sendKeys("Koparkhairane");
        System.out.println("Location added or Updated Successfully");

        // Wait for the dropdown suggestions
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.className("pac-item") // Google's class for suggestion items
        ));

        // Optionally click the first suggestion
        List<WebElement> suggestions = driver.findElements(By.className("pac-item"));
        if (!suggestions.isEmpty()) {
            suggestions.get(0).click(); // Click first suggestion
            System.out.println("Clicked on the first search result");
        } else {
            System.out.println("No suggestions found");
        }
    }

    public void enterRadius(String radius)
    {
        txtRadius.sendKeys(radius);
        System.out.println("Radius added successfully");
    }

    public void clkSetAddress()
    {
        btnSetAddress.click();
        System.out.println("Address added successfully");
    }

    public void enterCity(String city)
    {
        txtCity.sendKeys(Keys.CONTROL+"a");
        txtCity.sendKeys(Keys.DELETE);
        System.out.println("City cleared successfully");
        txtCity.sendKeys(city);
        System.out.println("City added or Updated successfully");
    }

    public void enterSearch(String search)
    {
        txtSearch.sendKeys(Keys.CONTROL + "a");
        txtSearch.sendKeys(Keys.DELETE);
        System.out.println("Search criteria cleared successfully");
        txtSearch.sendKeys(search);
        System.out.println("Search done successfully");
    }

    public void clkEdit()
    {
        btnEdit.click();
        System.out.println("Clicked on the Edit button successfully");
    }

    public void clkUpdate()
    {
        btnUpdate.click();
        System.out.println("Clicked on the Updated button successfully");
    }

    public void clkDelete() throws InterruptedException {
        Thread.sleep(3000);
        btnDelete.click();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
        System.out.println("Record Deleted successfully");
    }
}


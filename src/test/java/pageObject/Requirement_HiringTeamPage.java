package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Requirement_HiringTeamPage extends BasePage {

    Actions actions;

    public Requirement_HiringTeamPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[normalize-space()=\"Hiring Team\"]")
    WebElement selectHiring_Team;

    @FindBy(xpath = "//div[contains(text(),'Assign Role')]")
    List<WebElement> drpAssignRole;

    @FindBy(xpath = "//div[contains(text(),'Name/Email Id')]")
    List<WebElement> drpNameEmailId;

    @FindBy(xpath = "//span[contains(text(),'Add To Team')]")
    List<WebElement> btnAddtoTeam;

    @FindBy(xpath = "//label[normalize-space()=\"Assign to All Locations\"]")
    List<WebElement> checkBox_AssigntoLocations;

    public void clkHiring_Team()
    {
        selectHiring_Team.click();
    }

    public void clkAssignRole()
    {
        int size = drpAssignRole.size();
        System.out.println("Number of the Assign Role : " + size);
        for (int i=0; i<drpAssignRole.size(); i++)
        {
            System.out.println("Assign Role : " + (i + 1) + ": " + drpAssignRole.get(i).getText());
            try {
                WebElement assignRole = drpAssignRole.get(i);
                js=(JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", assignRole);

                wait=new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.elementToBeClickable(assignRole));

                actions=new Actions(driver);
                actions.moveToElement(assignRole).click().perform();
                System.out.println("Assign Role dropdown clicked: " + (i + 1));

                WebElement option=driver.findElement(By.xpath("//div[contains(text(), 'Recruiter')]"));
                wait.until(ExpectedConditions.elementToBeClickable(option));
                option.click();
                System.out.println("Role selected for assign role: " + (i+1));

            }
            catch (Exception e)
            {
                System.out.println("Click failed for Assign Role. Trying JavaScript click." + (i + 1) + ": " + e.getMessage());
                Assert.fail();
            }

        }
    }

    public void clkNameEmailId()
    {
        int size = drpNameEmailId.size();
        System.out.println("Number of the Name and Email Id : " + size);
        for (int i=0; i<drpNameEmailId.size(); i++) {
            System.out.println("Name and Email Id present on the page : " + (i + 1) + ": " + drpNameEmailId.get(i).getText());
            try {
                WebElement nameEmailId = drpNameEmailId.get(i);
                js=(JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", nameEmailId);

                wait=new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.elementToBeClickable(nameEmailId));

                actions=new Actions(driver);
                actions.moveToElement(nameEmailId).click().perform();
                System.out.println("Name/Email dropdown clicked: " + (i + 1));

                WebElement options=driver.findElement(By.xpath("//div[contains(text(), 'Akil Pathan (akilp1995@gmail.com)')]"));
                wait.until(ExpectedConditions.elementToBeClickable(options));
                options.click();
                System.out.println("Name and Email is successfully added.");
            }
            catch (Exception e)
            {
                System.out.println("Click failed for Name and Emai Id. Trying JavaScript click." +  (i + 1) + ": " + e.getMessage());
            }
        }
    }

    public void clkAddtoTeam()
    {
        int size = btnAddtoTeam.size();
        System.out.println("Number of the Add to Team : " + size);
        for (int i=0; i<btnAddtoTeam.size(); i++)
        {
            System.out.println("Add to Team button present on the page : " + (i + 1) + ": " + btnAddtoTeam.get(i).getText());
            try {
                Thread.sleep(2000);
                WebElement addToTeam = btnAddtoTeam.get(i);
                js=(JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", addToTeam);

                wait=new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.elementToBeClickable(addToTeam));

                    /*actions=new Actions(driver);
                    actions.moveToElement(addToTeam).click().perform();*/
                addToTeam.click();
                System.out.println("Add to Team button is successfully done.");

                if (isAlertPresent())
                {
                    handleAlert();
                }

            }
            catch (Exception e)
            {
                System.out.println("Click failed for Add to Team. Trying JavaScript click." +  (i + 1) + ": " + e.getMessage());
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void selectAssigntoAllLocations() {
        try {

            if (checkBox_AssigntoLocations.size() > 0) {  // Check if the checkbox exists in the DOM
                WebElement assigntoLocations = checkBox_AssigntoLocations.get(0);

                // Check if checkbox is visible before clicking
                if (assigntoLocations.isDisplayed()) {
                    assigntoLocations.click();
                    System.out.println("Checkbox is displayed and clicked successfully!");
                    actions=new Actions(driver);
                    actions.sendKeys(Keys.PAGE_DOWN).perform();

                    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    WebElement addButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@class, 'ant-btn') and .//span[text()='Save']]")));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addButton);
                    Thread.sleep(1000); // Allow time for scrolling
                    addButton.click();
                    System.out.println("Add to location is applied to all locations");
                }
                else
                {
                    System.out.println("Checkbox is present in the DOM but not visible.");
                }
            } else {
                System.out.println("Checkbox is not present on the page.");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

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

    @FindBy(xpath = "//label[normalize-space()=\"Assign to All Locations\"]")
    List<WebElement> checkBox_AssigntoLocations;

    @FindBy(xpath = "(//span[contains(text(),'For Location:')])")
    List<WebElement> location;

    public void clkHiring_Team()
    {
        selectHiring_Team.click();
    }

    public void safeClick(WebElement element, int retries) {
        for (int i = 0; i < retries; i++) {
            try {
                element.click();
                System.out.println("Element clicked successfully.");
                return;
            } catch (ElementClickInterceptedException e) {
                System.out.println("Retrying with JavaScript click. Attempt: " + (i + 1));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                return;
            } catch (Exception e) {
                System.out.println("Click failed on attempt " + (i + 1) + ": " + e.getMessage());
                if (i == retries - 1) {
                    throw e; // Re-throw if all attempts fail
                }
            }
        }
    }

    public void selectLcoation()
    {
        // Initialize WebDriverWait properly
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        for (int i=0; i<location.size(); i++)
        try {
            // Wait for loader to disappear
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader-class")));

            // Scroll to element
            WebElement assignRole = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Assign Role')])[" + (i + 1) + "]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", assignRole);
            safeClick(assignRole, 3);
            System.out.println("Clicked Assign Role for row " + (i + 1));

            Thread.sleep(2000);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(), 'Recruiter')]")));
            WebElement roleOption=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Recruiter')]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", roleOption);
            System.out.println("Role selected for assign role: " + (i+1));

            // Perform similar for Name/Email Id
            WebElement recruiter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Name/Email Id')])[" + (i + 1) + "]")));
            safeClick(recruiter, 3);
            System.out.println("Clicked on Name/Email Id for row " + (i + 1));

            WebElement nameOption=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Akil Pathan (akilp1995@gmail.com)')]")));
            nameOption.click();
            System.out.println("Name and Email is successfully added." + (i + 1));

            // Click Add To Team
            WebElement addToTeamButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Add To Team')])[" + (i + 1) + "]")));
            safeClick(addToTeamButton, 3);
            System.out.println("Clicked Add to Team for row " + (i + 1));

            if (isAlertPresent())
            {
                handleAlert();
            }
        } catch (Exception e) {
            System.out.println("Error on row " + (i + 1) + ": " + e.getMessage());
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

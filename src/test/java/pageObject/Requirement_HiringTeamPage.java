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

    public void selectLcoation()
    {
        for (int i=0; i<location.size(); i++)
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            //Wait and select Assign Role
            WebElement assignRole=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Assign Role')])[" + (i + 1) + "]")));
            Actions actions = new Actions(driver);
            actions.moveToElement(assignRole).click().perform();
            System.out.println("Assign role is selected");
            WebElement role=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Recruiter')]")));
            actions.moveToElement(role).click().perform();

            //Wait for select Recruiter role
            WebElement nameEmailId=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Name/Email Id')])[" + (i + 1) + "]")));
            actions.moveToElement(nameEmailId).click().perform();
            System.out.println("Name and Email id selected");
            driver.findElement(By.xpath("//div[contains(text(),'Akil Pathan (akilp1995@gmail.com)')]")).click();

            //wait for the buttin to be submit
            WebElement addToTeamButton = driver.findElement(By.xpath("(//span[contains(text(),'Add To Team')])[" + (i + 1) + "]"));
            addToTeamButton.click();
            System.out.println("Add to Team clicked.");
            if (isAlertPresent())
            {
                handleAlert();
                Assert.assertTrue(true);
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

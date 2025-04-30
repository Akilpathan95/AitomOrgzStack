package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Requirement_InterviewSetupPage extends BasePage {

    public Requirement_InterviewSetupPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[normalize-space()=\"Interview Setup\"]")
    WebElement btn_InterviewSetup;

    @FindBy(xpath = "//input[@placeholder=\"Enter new skill\"]")
    WebElement txtAddMoreSkill;

    @FindBy(xpath = "//button[normalize-space()=\"Add\"]")
    WebElement btnAddSkill;

    @FindBy(xpath = "//div[contains(text(),\"Add more MCQs\")]")
    WebElement btnAddMoreMCQs;

    @FindBy(xpath = "//div[@aria-label=\"Generate Questions\"]//div//textarea")
    WebElement txtAddQuetion;

    @FindBy(xpath = "//input[@placeholder=\"Option 1\"]")
    WebElement txtOption1;

    @FindBy(xpath = "//input[@placeholder=\"Option 2\"]")
    WebElement txtOption2;

    @FindBy(xpath = "//input[@placeholder=\"Option 3\"]")
    WebElement txtOption3;

    @FindBy(xpath = "//input[@placeholder=\"Option 4\"]")
    WebElement txtOption4;

    @FindBy(xpath = "//div[@aria-label=\"Generate Questions\"]//div//div//select")
    WebElement drpCorrectAnswer;

    @FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
    WebElement btnAddQuestion;

    @FindBy(xpath = "//button[normalize-space()=\"SAVE INTERVIEW\"]")
    WebElement btnSave_Interview;

    public void clkInterview_Setup()
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(btn_InterviewSetup));
        btn_InterviewSetup.click();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }

    public void enter_AddMoreSkill(String add_Skill)
    {
        txtAddMoreSkill.sendKeys(add_Skill);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void clkbtnAddSkill()
    {
        btnAddSkill.click();
    }

    public void clkbtnAddMoreMCQs() throws InterruptedException {
        Thread.sleep(30000);
        btnAddMoreMCQs.click();
    }

    public void enter_AddQuestion(String addQuetion)
    {
        txtAddQuetion.sendKeys(addQuetion);
    }

    public void enter_Option1(String option1)
    {
        txtOption1.sendKeys(option1);
    }

    public void enter_Option2(String option2)
    {
        txtOption2.sendKeys(option2);
    }

    public void enter_Option3(String option3)
    {
        txtOption3.sendKeys(option3);
    }

    public void enter_Option4(String option4)
    {
        txtOption4.sendKeys(option4);
    }

    public void clkdrpCorrectAnswer()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Select select=new Select(drpCorrectAnswer);
        select.selectByValue("Black Box Testing");
    }

    public void clkbtnAddQuestion()
    {
        btnAddQuestion.click();
    }

    public void selectWorking_Type()
    {
        driver.findElement(By.xpath("//input[@value=\"hybrid\"]")).click();
        WebElement location=driver.findElement(By.xpath("//input[@placeholder=\"Enter locations (separated by commas)\"]"));
        location.sendKeys("Navi Mukmbai");
        location.sendKeys(Keys.ENTER);
    }

    public void selectSalary_Expectations(String selection)
    {
        WebElement yesRadioButton=driver.findElement(By.xpath("//input[@value=\"yes\"]"));
        WebElement noRadionButton=driver.findElement(By.xpath("//input[@value=\"no\"]"));

        if (selection.equalsIgnoreCase("Yes"))
        {
            yesRadioButton.click();
            System.out.println("Yes button is selected");
        }
        else if (selection.equalsIgnoreCase("No"))
        {
            noRadionButton.click();
            System.out.println("No button is selected");
        }
        else
        {
            System.out.println("Invalid option is selected");
        }
    }

    public void enterSalary_Range(String userInput, String minSalary, String maxSalary)
    {
        WebElement enter_MinSalary= driver.findElement(By.xpath("//input[@placeholder=\"Min Salary\"]"));
        WebElement enter_MaxSalary=driver.findElement(By.xpath("//input[@placeholder=\"Max Salary\"]"));
        if (userInput.equalsIgnoreCase("yes"))
        {
            enter_MinSalary.sendKeys(minSalary);
            enter_MaxSalary.sendKeys(maxSalary);
            System.out.println("Salary Range entered Min Salary : " + enter_MinSalary + "Max Salary : " + enter_MaxSalary);
        }
        else if (userInput.equalsIgnoreCase("No"))
        {
            System.out.println("salary range is not entered");
        }
        else
        {
            System.out.println("Wrong option entered");
        }
    }

    public void select_Availibility()
    {
        driver.findElement(By.xpath("//input[@value=\"within1month\"]")).click();
    }

    public void clkSave_Interview()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", btnSave_Interview);
        btnSave_Interview.click();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}

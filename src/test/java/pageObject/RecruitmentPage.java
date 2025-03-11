package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class RecruitmentPage extends BasePage {

    public RecruitmentPage(WebDriver driver)
    {
        super(driver);
    }

    Actions actions;

    @FindBy(xpath = "//div[normalize-space()=\"RECRUITMENT\"]")
    WebElement btnRecruitment;

    @FindBy(xpath = "//p[normalize-space()=\"adsc\"]")
    WebElement selectRecruirment_List;

    @FindBy(xpath = "(//div[normalize-space()='Job Description'])[1]")
    WebElement selectJob_Description;

    @FindBy(xpath = "//button[normalize-space()=\"Enhance/Create with AI\"]")
    WebElement btnCreateWithAI;

    @FindBy(xpath = "(//input[@placeholder='Select from below suggestions or enter your own response here'])[1]")
    WebElement txtSelectSuggestion;

    @FindBy(xpath = "(//div[@class='suggestions']//span[@class='suggestion-bubble'])[1]")
    WebElement drpsuggestion;

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement btnSubmit;

    @FindBy(xpath = "//button[normalize-space()=\"Generate JD\"]")
    WebElement btnGenerate_JD;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    @FindBy(xpath = "//div[normalize-space()=\"Generate Keywords\"]")
    WebElement btnGenerate_Keyword;

    @FindBy(xpath = "//input[@id=\"mui-3\"]")
    WebElement txtGenerate_Keyword;

    @FindBy(xpath = "//div[@class=\"MuiBox-root css-2id3x1\"]//div[1]")
    WebElement drpGenerate_Keyword;

    @FindBy(xpath = "//div[contains(text(),\"SAVE\")]")
    WebElement btnGenerateKeyword_Save;

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

    public void clkRecruitment()
    {
        btnRecruitment.click();
    }

    public void clkRecruitment_List()
    {
        selectRecruirment_List.click();
    }

    public void clkJob_Description()
    {
        selectJob_Description.click();
    }

    public void clkCreateWithAI()
    {
        btnCreateWithAI.click();
    }

    public void selectSuggestion_Inputbox()
    {
        txtSelectSuggestion.click();
    }

    public void selectSuggestion()
    {
        drpsuggestion.click();
    }

    public void selectSubmit()
    {
        btnSubmit.click();
    }

    public void selectGenerate_JD()
    {
        btnGenerate_JD.click();
    }

    public void selectSave()
    {
        btnSave.click();
    }

    public void selectGenerate_Keyword()
    {
        actions=new Actions(driver);
        actions.moveToElement(btnGenerate_Keyword).perform();
        btnGenerate_Keyword.click();
    }

    /*public void clkInputGenerate_Keyword()
    {
        txtGenerate_Keyword.click();
    }*/

    public void clkdrpGenerate_Keyword()
    {
        drpGenerate_Keyword.click();
    }

    public void clkGenerateKeyword_Save()
    {
        btnGenerateKeyword_Save.click();
    }

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
                    driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
                    System.out.println("Add to location is applied to all locations");
                } else {
                    System.out.println("Checkbox is present in the DOM but not visible.");
                }
            } else {
                System.out.println("Checkbox is not present on the page.");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    public void enter_AddMoreSkill(String add_Skill)
    {
        txtAddMoreSkill.sendKeys(add_Skill);
    }

    public void clkbtnAddSkill()
    {
        btnAddSkill.click();
    }

    public void clkbtnAddMoreMCQs()
    {
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
        Select select=new Select(drpCorrectAnswer);
        select.selectByValue("Black Box Testing");
    }

    public void clkbtnAddQuestion()
    {
        btnAddQuestion.click();
    }
}

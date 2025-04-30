package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Requirement_JobDescriptionPage extends BasePage {

    Actions actions;

    public Requirement_JobDescriptionPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "(//div[normalize-space()='Job Description'])[1]")
    WebElement selectJob_Description;

    @FindBy(xpath = "//button[normalize-space()=\"Enhance/Create with AI\"]")
    WebElement btnCreateWithAI;

    @FindBy(xpath = "(//input[@placeholder=\"Select from suggestions or enter your response here\"])[1]")
    WebElement txtSelectSuggestion;

    @FindBy(xpath = "(//div[@class='suggestions']//span[@class='suggestion-bubble'])[1]")
    WebElement drpsuggestion;

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement btnSubmit;

    @FindBy(xpath = "//button[normalize-space()=\"Generate Job Description\"]")
    WebElement btnGenerate_JD;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    @FindBy(xpath = "//div[normalize-space()=\"Generate Keywords\"]")
    WebElement btnGenerate_Keyword;

    @FindBy(xpath = "//div[@class=\"MuiBox-root css-2id3x1\"]//div[1]")
    WebElement drpGenerate_Keyword;

    @FindBy(xpath = "//div[contains(text(),\"SAVE\")]")
    WebElement btnGenerateKeyword_Save;

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

    public void clkdrpGenerate_Keyword()
    {
        drpGenerate_Keyword.click();
    }

    public void clkGenerateKeyword_Save()
    {
        btnGenerateKeyword_Save.click();
    }
}

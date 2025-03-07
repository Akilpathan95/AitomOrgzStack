package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecruitmentPage extends BasePage {

    public RecruitmentPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[normalize-space()=\"RECRUITMENT\"]")
    WebElement btnRecruitment;

    @FindBy(xpath = "(//p[contains(text(),'Senior Software Tester')])[1]")
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

}

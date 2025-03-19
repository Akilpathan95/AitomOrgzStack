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
        Select select;
        JavascriptExecutor js;
    
        @FindBy(xpath = "(//p[contains(text(),'Senior Software Tester')])[1]")
        WebElement selectRecruirment_List;

        //-------------------------Methods---------------
    
        public void clkRecruitment_List()
        {
            selectRecruirment_List.click();
        }
    }

package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class CandidateRepositoryPage extends BasePage {

    public CandidateRepositoryPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder=\"Search by Email, First Name, Mobile No, or Candidate ID\"]")
    WebElement txtSearchBox;

    @FindBy(xpath = "(//div[@class='flex flex-col mt-1 mb-3']//div[@class='flex gap-2 items-center']//div[@class='mr-5'])[1]")
    WebElement clkCandidate;

    public void enterSearchBox(String search)
    {
        txtSearchBox.sendKeys(search);
    }

    public void selectCandidate() throws InterruptedException {
        Thread.sleep(3000);
        clkCandidate.click();
    }
}

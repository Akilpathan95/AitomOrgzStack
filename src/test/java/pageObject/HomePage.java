package pageObject;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "(//img[@class='MuiAvatar-img'])[1]")
    WebElement btnMyProfile;

    @FindBy(xpath = "//li[normalize-space()='Sign out']")
    WebElement btnLogOut;

    @FindBy(xpath = "//h1[normalize-space()='Welcome to your Dashboard']")
    WebElement dashboard;

    @FindBy(xpath = "//div[@class='menu-list']//div//div//div[@tabindex='3']")
    WebElement btnRequisition;

    public void clkMyProfile()
    {
        btnMyProfile.click();
    }

    public void clkLogOut()
    {
        btnLogOut.click();
    }

    public boolean isMyDashboardExists()
    {
        try
        {
            return (dashboard.isDisplayed());
        }
        catch (NoSuchElementException e)
        {
            return false;
        }

    }

    public void clkRequisition()
    {
        btnRequisition.click();
    }


}

package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='outlined-adornment-email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@id='outlined-adornment-password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btnLogin;

    public void enterEmail(String email)
    {
        wait.until(ExpectedConditions.visibilityOf(txtEmail));
        txtEmail.sendKeys(Keys.CONTROL + "a"); // Select all text
        txtEmail.sendKeys(Keys.DELETE); // Delete text
        txtEmail.sendKeys(email);
    }

    public void enterPassword(String password)
    {
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.sendKeys(Keys.CONTROL + "a"); // Select all text
        txtPassword.sendKeys(Keys.DELETE); // Delete text
        txtPassword.sendKeys(password);
    }

    public void clkLogin()
    {
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        btnLogin.click();
    }
}

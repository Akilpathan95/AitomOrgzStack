package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateRequisition extends BasePage {

    JavascriptExecutor js;

    public CreateRequisition(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//p[@class='font-sans font-bold leading-5 text-sm']")
    WebElement btnCreate_Requisition;

    @FindBy(xpath = "//body/div[@role='presentation']/div[@role='none presentation']/div[@role='dialog']/div[@class='MuiDialogContent-root']/div[@class='w-96 h-106 font-sans rounded-xl my-8']/div[@class='flex flex-col gap-y-5 font-sans leading-5 font-normal text-base items-center']/div[1]/div[1]")
    WebElement drpSelect_InternatExternalType;

    @FindBy(xpath = "//div[@class='pb-0.5']//div[contains(@class,'css-ackcql')]")
    WebElement drpSelect_Organisation;

    @FindBy(xpath = "(//div[contains(@class,'css-ackcql')])[3]")
    WebElement drpClient_Name;

    @FindBy(xpath = "//button[normalize-space()='Create Requisition']")
    WebElement btnCreateRequisition_POPup;

    public void clkCreate_requisition()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
        btnCreate_Requisition.click();
    }

    public void clk_InternalExternal() throws InterruptedException {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", drpSelect_InternatExternalType);
        drpSelect_InternatExternalType.click();

        Thread.sleep(1000);

        WebElement intext=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=' css-11unzgr']//div[contains(text(), 'External')]")));
        js.executeScript("arguments[0].click();", intext);
    }

    public void clkSelect_Organisation()
    {
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(drpSelect_Organisation));
        drpSelect_Organisation.click();

        WebElement orgOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=' css-11unzgr']//div[contains(text(), 'IPS Vantage Tech Services Pvt. Ltd.')]")));
        orgOption.click();
    }

    public void clk_ClientName()
    {
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(drpClient_Name));
        drpClient_Name.click();
        driver.findElement(By.xpath("//div[@class=' css-11unzgr']//div[contains(text(), 'Urbanwrk Pvt Ltd')]")).click();
    }

    public void clkCreateRequisition_POPup()
    {
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnCreateRequisition_POPup));
        btnCreateRequisition_POPup.click();
    }

}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreateRequisition extends BasePage {

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
        btnCreate_Requisition.click();
    }

    public void clk_InternalExternal()
    {
        drpSelect_InternatExternalType.click();
        driver.findElement(By.xpath("//div[@id='react-select-2-option-1']")).click();
    }

    public void clkSelect_Organisation()
    {
        drpSelect_Organisation.click();
        driver.findElement(By.xpath("//div[@id='react-select-3-option-1']")).click();
    }

    public void clk_ClientName()
    {
        drpClient_Name.click();
        driver.findElement(By.xpath("//div[@id='react-select-4-option-3']")).click();
    }

    public void clkCreateRequisition_POPup()
    {
        btnCreateRequisition_POPup.click();
    }

}

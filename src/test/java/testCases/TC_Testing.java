package testCases;

import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.LoginPage;
import pageObject.RecruitmentPage;
import pageObject.RequisitionPage;
import testBase.BaseClass;

import java.time.Duration;

public class TC_Testing extends BaseClass {

    @Test(priority = 1, groups = "Master")
    public void verify_Login()
    {
        LoginPage lp=new LoginPage(driver);
        lp.enterEmail(p.getProperty("email"));
        lp.enterPassword(p.getProperty("password"));
        lp.clkLogin();
    }

    @Test(priority = 2, groups = "Master")
    public void verify_RequisitionPage()
    {
        RequisitionPage rp=new RequisitionPage(driver);
        rp.clkRequisition();
    }

    @Test(priority = 8)
    public void verify_AddCandidate() throws InterruptedException {
        RecruitmentPage rp = new RecruitmentPage(driver);
        rp.clkRecruitment();
        rp.clkRecruitment_List();
        rp.clkCandidate();
        rp.enterSearch("Akil");

    }
}

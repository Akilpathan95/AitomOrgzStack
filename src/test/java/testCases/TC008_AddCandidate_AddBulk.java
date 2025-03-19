package testCases;

import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.RecruitmentPage;
import pageObject.RequisitionPage;
import testBase.BaseClass;

public class TC008_AddCandidate_AddBulk extends BaseClass {

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
        rp.clkAdd_Candidate();
        rp.clkBulkUpload();
        rp.addBulkUpload();
        rp.clkCancel();
        rp.enterSearch("Akil");
    }
}

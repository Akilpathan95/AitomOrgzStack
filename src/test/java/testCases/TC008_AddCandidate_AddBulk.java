package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC008_AddCandidate_AddBulk extends BaseClass {

    @Test(priority = 2, groups = "Master")
    public void verify_RequisitionPage()
    {
        LeftMenuPage lp=new LeftMenuPage(driver);
        lp.clkRequisition();
    }

    @Test(priority = 8)
    public void verify_AddCandidate() throws InterruptedException {
        RequisitionTopMenuPage rtp=new RequisitionTopMenuPage(driver);
        rtp.clkRecruitment();

        RecruitmentPage rp = new RecruitmentPage(driver);
        rp.clkRecruitment_List();

        Requirement_CandidatesPage rc=new Requirement_CandidatesPage(driver);
        rc.clkCandidate();
        rc.clkAdd_Candidate();
        rc.clkBulkUpload();
        rc.addBulkUpload();
        rc.clkCancel();
        rc.enterSearch("Akil");
    }
}

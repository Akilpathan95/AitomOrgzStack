package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

import java.time.Duration;

public class TC_Testing extends BaseClass {

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
        rc.enterSearch("Akil");
    }
}

package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC009_SendInviteAnd_InterviewLink extends BaseClass {

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
        rc.selectCandidateList();
        rc.enterSearch("Saiyadali");
        rc.clkMenu();
        rc.clkSendInviteEmail();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
        rc.clkMenu();
        rc.clkSendInterviewLink();
        bp.handleAlert();
    }
}

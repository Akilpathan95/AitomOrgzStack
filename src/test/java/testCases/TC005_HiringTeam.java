package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

import java.time.Duration;

public class TC005_HiringTeam extends BaseClass {

    LeftMenuPage lp;
    RequisitionTopMenuPage rtp;

    @Test(priority = 2, groups = "Master")
    public void verify_RequisitionPage()
    {
        RequisitionTopMenuPage rp=new RequisitionTopMenuPage(driver);
        lp=new LeftMenuPage(driver);
        lp.clkRequisition();
        rp.clkRequisition_Option();
    }

    @Test(priority = 3, groups = "Master")
    public void verify_CreateRequisition() throws InterruptedException {
        CreateRequisition cr=new CreateRequisition(driver);
        cr.clkCreate_requisition();
        cr.clk_InternalExternal();
        cr.clkSelect_Organisation();
        cr.clk_ClientName();
        cr.clkCreateRequisition_POPup();
    }

    @Test(priority = 4, groups = {"Master", "Requisition"})
    public void verify_RequirementDetails()
    {
        Requirement_DetailsPage rp=new Requirement_DetailsPage(driver);
        rp.enterJob_Title("Senior Software Tester");
        rp.enterPosition_Id("1234");
        rp.enterPosition_Name("Tester");
        rp.selectPriority();
        rp.clkSelect_Candidate();
        rp.enterTAT("3");
        rp.verifyDate("3");
        rp.selectRequirement_Type();
        rp.enterNotice_Period("30 days");
        rp.enterLocation_Name("Navi Mumbai", 0);
        rp.enterNo_Position("2", 0);
        rp.clkAdd_Work();
        rp.enterLocation_Name("Mumbai", 1);
        rp.enterNo_Position("2",1);
        rp.clkAdd_Work();
        rp.enterLocation_Name("Pune",2);
        rp.enterNo_Position("2",2);
        rp.clkSub_Work();
        rp.countNo_OfPosition();
        rp.selectCurrency();
        rp.selectPeriod();
        rp.enterCTC_Min("8");
        rp.enterCTC_Max("15");
        rp.selectWork_Model();
        rp.enterTarget_Company("IPSearch Executive Search");
        rp.selectShift_Type();
        rp.selectGender();
        rp.enterAgeGroup_From("21");
        rp.enterAgeGroup_To("35");
        rp.enterExperience_From("3");
        rp.enterExperience_To("5");
        rp.selectEducational_Qualification();
        rp.waitForAdditional_Qualification();
        rp.selectAdditional_Qualification("B.C.S.");
        rp.enterAlternate_Qualificatio("Computer Science");
        rp.enterAdd_Remark("ISTQB certified tester has added advantage");
        rp.clkSave();
    }

    @Test(priority = 6)
    public void verify_Hiring() throws InterruptedException {
        RecruitmentPage rp = new RecruitmentPage(driver);
        lp=new LeftMenuPage(driver);
        lp.clkRequisition();
        rtp=new RequisitionTopMenuPage(driver);
        rtp.clkRecruitment();
        rp.clkRecruitment_List();
        Requirement_HiringTeamPage ht=new Requirement_HiringTeamPage(driver);
        ht.clkHiring_Team();
        ht.selectLcoation();
        ht.selectAssigntoAllLocations();
    }
}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

import java.time.Duration;

public class TC005_HiringTeam extends BaseClass {

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
        rp.clkRequisition_Option();
    }

    @Test(priority = 3, groups = "Master")
    public void verify_CreateRequisition()
    {
        CreateRequisition cr=new CreateRequisition(driver);
        cr.clkCreate_requisition();

        cr.clk_InternalExternal();
        cr.clkSelect_Organisation();
        cr.clk_ClientName();
        cr.clkCreateRequisition_POPup();
    }

    @Test(priority = 4, groups = "Master")
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
        rp.enterCTC_Max("5");
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

    @Test(priority = 5)
    public void verify_Pop_UP() {
        BasePage bp = new BasePage(driver);

        String expected_Message = "Requisition Created";

        String actual_Message = bp.getAlertText();

        Assert.assertEquals(actual_Message, expected_Message, "Pop-up message verification failed!");

        bp.handleAlert();
    }

    @Test(priority = 6)
    public void verify_Recruitment()
    {
        RequisitionPage rpage=new RequisitionPage(driver);
        rpage.clkRequisition();
        RecruitmentPage rp=new RecruitmentPage(driver);
        rp.clkRecruitment();
        rp.clkRecruitment_List();
        rp.clkJob_Description();
        rp.clkCreateWithAI();
        rp.selectSuggestion_Inputbox();
        rp.selectSuggestion();
        rp.selectSubmit();
        rp.selectSuggestion_Inputbox();
        rp.selectSuggestion();
        rp.selectSubmit();
        rp.selectGenerate_JD();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        rp.selectSave();
    }

    @Test(priority = 7)
    public void verify_GenerateKeyword() {
        RecruitmentPage rp = new RecruitmentPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        rp.selectGenerate_Keyword();
        rp.clkdrpGenerate_Keyword();
        rp.clkGenerateKeyword_Save();
    }

    @Test(priority = 8)
    public void verify_Hiring() {
        RecruitmentPage rp = new RecruitmentPage(driver);
        rp.clkRecruitment();
        rp.clkRecruitment_List();
        rp.clkHiring_Team();
        rp.clkAssignRole();
        rp.clkNameEmailId();
        rp.clkAddtoTeam();
        rp.selectAssigntoAllLocations();
    }
}

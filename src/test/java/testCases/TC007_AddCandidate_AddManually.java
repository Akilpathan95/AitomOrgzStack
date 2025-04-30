package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

import java.time.Duration;

public class TC007_AddCandidate_AddManually extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 2, groups = {"Master", "Requisition"})
    public void verify_RequisitionPage()
    {
        lp=new LeftMenuPage(driver);
        lp.clkRequisition();
        RequisitionTopMenuPage rp=new RequisitionTopMenuPage(driver);
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

    //@Test(priority = 4, groups = "Master")
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

    @Test(priority = 6)
    public void verify_Recruitment()
    {
        lp=new LeftMenuPage(driver);
        lp.clkRequisition();
        RecruitmentPage rp=new RecruitmentPage(driver);
        RequisitionTopMenuPage rtp=new RequisitionTopMenuPage(driver);
        rtp.clkRecruitment();
        rp.clkRecruitment_List();
        Requirement_JobDescriptionPage jd=new Requirement_JobDescriptionPage(driver);
        jd.clkJob_Description();
        jd.clkCreateWithAI();
        jd.selectSuggestion_Inputbox();
        jd.selectSuggestion();
        jd.selectSubmit();
        jd.selectSuggestion_Inputbox();
        jd.selectSuggestion();
        jd.selectSubmit();
        jd.selectGenerate_JD();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        jd.selectSave();
    }

    @Test(priority = 7)
    public void verify_GenerateKeyword() {
        Requirement_JobDescriptionPage jd=new Requirement_JobDescriptionPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        jd.selectGenerate_Keyword();
        jd.clkdrpGenerate_Keyword();
        jd.clkGenerateKeyword_Save();
    }

    //@Test(priority = 8)
    public void verify_Hiring() {
        Requirement_HiringTeamPage ht=new Requirement_HiringTeamPage(driver);
        ht.clkHiring_Team();
        ht.selectLcoation();
        ht.selectAssigntoAllLocations();
    }

    //@Test(priority = 9)
    public void verify_InterviewSetup() throws InterruptedException {
        Requirement_InterviewSetupPage ip=new Requirement_InterviewSetupPage(driver);
        ip.clkInterview_Setup();
        ip.enter_AddMoreSkill("CI/CD pipeline knowledge must know");
        ip.clkbtnAddSkill();
        ip.clkbtnAddMoreMCQs();
        ip.enter_AddQuestion("System testing is a");
        ip.enter_Option1("Grey Box Testing");
        ip.enter_Option2("White Box Testing");
        ip.enter_Option3("Black Box Testing");
        ip.enter_Option4("Both B and C are correct");
        ip.clkdrpCorrectAnswer();
        ip.clkbtnAddQuestion();
        ip.selectWorking_Type();
        ip.selectSalary_Expectations("Yes");
        ip.enterSalary_Range("yes", "300000", "600000");
        ip.select_Availibility();
        ip.clkSave_Interview();
    }

    @Test(priority = 10)
    public void verify_AddCandidate() throws InterruptedException {
        Requirement_CandidatesPage rc = new Requirement_CandidatesPage(driver);
        rc.clkCandidate();
        rc.clkAdd_Candidate();
        rc.clkAdd_Manually();
        rc.addFileWithRetry("C:/Users/IPSL/Downloads/Saiyad Ali -Electrical Techician.pdf", 3);
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
        rc.enterFirst_Name("Akil");
        rc.enterMiddle_Name("Nisar");
        rc.enterLast_Name("Pathan");
        rc.enter_Email("akil.pathan@orgzstack.com");
        rc.enter_MobileNo("9870150276");
        rc.enter_DOB("14-08-1995");
        rc.enter_Country("India");
        rc.enterCurrent_Organization("Informatic Connecting Tech PVT. LTD.");
        rc.enterCurrent_Designation("Senior Software Tester");
        rc.enter_Industry("IT Department");
        rc.enterCurrent_Location("Navi Mumbai");
        rc.enterFunctional_Area("IT Department");
        rc.enterNotice_Period("2 Months");
        rc.selectRelocate();
        rc.enterPrimary_Source("Job Portal");
        rc.enterSecondary_Source("Social Sites");
        rc.enterPassport_Number("A1234567");
        rc.enteronlineProfile_URL("https://aitom.orgzstack.com/Requisition/RecrutementList");
        rc.selectRemote_Work();
        rc.enterCurrent_Salary("3");
        rc.selectCurrent_Salary();
        rc.selectDrpCurrentSalary_Type();
        rc.enterExpected_Salary("5");
        rc.selectExpected_Salary();
        rc.selectExpectecSalary_Type();
        rc.enterSkills("Expertise in Selenium with Java.");
        rc.selectEducation("Yes");
        rc.selectExperience("Yes");
        rc.selectProject("Yes");
        rc.selectLanguage("English");
        rc.selectCourses("Yes");
        rc.submit();
    }
}

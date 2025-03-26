package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

import java.time.Duration;

public class TC_Testing extends BaseClass {

    LeftMenuPage lp;
    RequisitionTopMenuPage rtp;

    @Test(priority = 2, groups = "Master")
    public void verify_RequisitionPage()
    {
        RequisitionTopMenuPage rp=new RequisitionTopMenuPage(driver);
        lp=new LeftMenuPage(driver);
        lp.clkRequisition();
    }

    @Test(priority = 10)
    public void verify_AddCandidate() throws InterruptedException {
        RequisitionTopMenuPage rtp=new RequisitionTopMenuPage(driver);
        rtp.clkRecruitment();
        RecruitmentPage rp=new RecruitmentPage(driver);
        rp.clkRecruitment_List();
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
        rc.selectLanguage("Yes");
        rc.selectCourses("Yes");
        rc.submit();
    }
}

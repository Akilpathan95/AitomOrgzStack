package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
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
        rp.clkAdd_Candidate();
        rp.clkAdd_Manually();
        rp.enterFirst_Name("Akil");
        rp.enterMiddle_Name("Nisar");
        rp.enterLast_Name("Pathan");
        rp.enter_Email("akil.pathan@orgzstack.com");
        rp.enter_MobileNo("9870150276");
        rp.enter_DOB("14-08-1995");
        rp.enter_Country("India");
        rp.enterCurrent_Organization("Informatic Connecting Tech PVT. LTD.");
        rp.enterCurrent_Designation("Senior Software Tester");
        rp.enter_Industry("IT Department");
        rp.enterCurrent_Location("Navi Mumbai");
        rp.enterFunctional_Area("IT Department");
        rp.enterNotice_Period("2 Months");
        rp.selectRelocate();
        rp.enterPrimary_Source("Job Portal");
        rp.enterSecondary_Source("Social Sites");
        rp.enterPassport_Number("A1234567");
        rp.enteronlineProfile_URL("https://aitom.orgzstack.com/Requisition/RecrutementList");
        rp.selectRemote_Work();
        rp.enterCurrent_Salary("3");
        rp.selectCurrent_Salary();
        rp.selectDrpCurrentSalary_Type();
        rp.enterExpected_Salary("5");
        rp.selectExpected_Salary();
        rp.selectExpectecSalary_Type();
        rp.enterSkills("Expertise in Selenium with Java.");
        rp.selectEducation("Yes");
        rp.selectExperience("Yes");
        rp.selectProject("Yes");
        rp.selectLanguage("Yes");
        rp.selectCourses("Yes");
        rp.submit();
    }
}

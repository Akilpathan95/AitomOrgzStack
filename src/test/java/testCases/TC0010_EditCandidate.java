package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0010_EditCandidate extends BaseClass {

    @Test(priority = 2, groups = {"Master", "Requisition"})
    public void verify_RequisitionPage()
    {
        LeftMenuPage lp=new LeftMenuPage(driver);
        lp.clkRequisition();
    }

    @Test(priority = 3)
    public void verify_AddCandidate() throws InterruptedException {
        RequisitionTopMenuPage rtp=new RequisitionTopMenuPage(driver);
        rtp.clkCandidateRepository();
    }

    @Test(priority = 4)
    public void verify_search() throws InterruptedException {
        CandidateRepositoryPage cd=new CandidateRepositoryPage(driver);
        cd.enterSearchBox("akilp1995");
        cd.selectCandidate();
    }

    @Test(priority = 5)
    public void verify_edit() throws InterruptedException {
        CandidateRepository_BasicInfo bi=new CandidateRepository_BasicInfo(driver);
        bi.selectEdit();
        bi.editFirstName("Aki");
        bi.editMiddleName("Nis");
        bi.editLastName("Pat");
        bi.editEmail("akil.pathan00@gmail.com");
        bi.editMobileNumber("9870170276");
        bi.editCurrentOrganization("Informatic Connecting Tech PVT LTD");
        bi.editDOB("11/04/1999");
        bi.editCountry("Bharat");
        bi.editCurrentDesignation("Sr. Software Tester");
        bi.editIndustry("IT Recruitement Agency");
        bi.editCurrentLocation("Koparkhairane");
        bi.editFunctionalArea("Software");
        bi.editNoticePeriod("60");
        bi.editPrimarySource("NK");
        bi.editSecondarySource("Monster");
        bi.editRemoteWork();
        bi.editOnlineProfileURL("https://uat.orgzstack.com/Requisition/CandidateList/CandidateDetails/BasicInfo");
        bi.editRelocate();
        bi.enterPreferredLocation("Pune");
        bi.editCurrentSalary("35000");
        bi.editCurrentSalaryCurrency();
        bi.editCurrentSalaryDuration();
        bi.editExpectedSalary("90000");
        bi.editExpectedSalaryCurrency();
        bi.editExpectedSalaryDuration();
        bi.editSkills("AWS cloud");
        bi.editEducation("Yes");
        bi.editExperience("Yes");
        bi.editProject("Yes");
        bi.editLanguage("Yes");
        bi.editCourse("Yes");
        bi.clkSave();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();

    }
}

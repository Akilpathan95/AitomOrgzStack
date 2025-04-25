package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0027BusinessUnitAddBasicInfo extends BaseClass {

    LeftMenuPage lp;
    BusinessUnitPage bp;
    BusinessUnit_EmployessPage be;
    BasePage basep;

    @Test(priority = 3, dependsOnMethods = {"verify_Login"})
    public void verify_clkBusinessUnit()
    {
        lp=new LeftMenuPage(driver);
        lp.clkBusinessUnit();
    }

    @Test(priority = 4)
    public void verify_clkContacts()
    {
        OrganisationSetup_ClientPage cp=new OrganisationSetup_ClientPage(driver);
        cp.clkEditBusinessUnit();
    }

    @Test(priority = 5)
    public void verify_AddBasicInfo()
    {
        bp=new BusinessUnitPage(driver);
        bp.clkEmployees();
        be=new BusinessUnit_EmployessPage(driver);
        be.clkAddNewEmployee();
        be.enterEmployeeId("IPC" + randomStringNumeric());
        be.addProfilePic();
        be.selectSalutation();
        be.enterAadharName("Akil Nisar Pathan");
        be.enterFirstName("Akil");
        be.enterMiddleName("Nisar");
        be.enterLastName("Pathan");
        be.enterDOB("14-08-1995");
        be.selectGender();
        be.selectBloodGroup();
        be.enterReligion("Indian-Islam");
        be.enterEmail(randomAlphaNumeric().toLowerCase() + "gmail.com");
        be.enterWorkEmail(randomAlphaNumeric().toLowerCase() + "orgzstack.com");
        be.enterMobileNumber(randomNumber());
        be.enterAlternateNumber(randomNumber());
        be.enterEmergencyPersonName(randomString());
        be.enterEmergencyPersonNumber(randomNumber());
        be.enterAddress(randomString() + randomStringNumeric());
        be.enterPincode("123456");
        be.selectCountry();
        be.selectState();
        be.enterCity("Navi Mumbai");
        be.clkPermanentAddress();
        be.selectFromDate("06/10/2022");
        be.selectToDate("03/12/2024");
        be.enterCompanyName("SMARTe dass pvt ltd");
        be.enterDesignation("Senior Software Testing Engineee");
        be.enterLastSalary("15000");
        be.enterToReporting("Suchita");
        be.enterMoNumber(randomNumber());
        be.enterRemark("Good Candidate");
        be.addAppointmentLetter();
        be.addExperienceLetter();
        be.addSalarySlip();
        be.addRelievingLetter();
        be.clkAdd1();
        be.enterEducation();
        be.clkSave();
        basep=new BasePage(driver);
        basep.handleAlert();
    }
}

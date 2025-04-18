package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC_Testing extends BaseClass {

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

    //@Test(priority = 5)
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

    //@Test(priority = 6)
    public void verify_Onboarding()
    {
        BusinessUnitPage bu=new BusinessUnitPage(driver);
        bu.clkEmployees();
        be=new BusinessUnit_EmployessPage(driver);
        be.clkEditEmployee();
        BusinessUnitEmployee_Onboarding be=new BusinessUnitEmployee_Onboarding(driver);
        be.clkOnboarding();
        be.enterPanNo("AAAPA1234A");
        be.addPan();
        be.enterAadharNo("397788000234");
        be.addAadhar();
        be.enterPassport("J8369854");
        be.addPassport();
        be.enterFatherFirstName(randomString());
        be.enterFatherSecondName(randomString());
        be.enterFatherLastName(randomString());
        be.enterMotherFirstName(randomString());
        be.enterMotherSecondName(randomString());
        be.enterMotherLastName(randomString());
        be.selectMaritalStatus();
        be.selectAnniversaryDate();
        be.clkNoOfChildren();
        be.enterSpousesName(randomString());
        be.enterNomineeName(randomString());
        be.selectDOB();
        be.enterRelationship("Parents");
        be.enterPrivateBankName("SBI");
        be.enterPrivateAccountNo("5463728283736");
        be.enterPrivateIFSCCode("SBI0001234");
        be.clkPrivateBankDetails();
        be.addCancelledCheque();
        be.addHobbies();
        be.enterHobbies("Playing Cricket");
        be.addSports();
        be.enterSports("Cricket");
        be.clkSave();
        basep=new BasePage(driver);
        basep.handleAlert();
    }

    @Test(priority = 7)
    public void verify_deleteBusinessUnit() {
        BusinessUnitPage bu=new BusinessUnitPage(driver);
        bu.clkEmployees();
        be=new BusinessUnit_EmployessPage(driver);
        be.clkEditEmployee();
        BusinessUnitEmployee_Mapping bm=new BusinessUnitEmployee_Mapping(driver);
        bm.clkMapping();
        bm.drpField(1,"Reporting Manager", "Akil Pathan");
        bm.calender(1,"December 2024", "14");
        bm.drpField(1,"Zone", "West Zone Testing");
        bm.calender(2,"November 2024", "24");

        bm.drpField(1,"Branch", "Mumbai Testing");
        bm.calender(3,"December 2024", "14");
        bm.drpField(1,"Division", "IT");
        bm.calender(4,"November 2024", "24");

        bm.drpField(1,"Working Location", "Goregav");
        bm.calender(5,"November 2024", "24");

        bm.drpField(1,"Department", "Development");
        bm.calender(6,"December 2024", "14");
        bm.drpField(1,"Designation", "Sr Testing Engineer");
        bm.calender(7,"November 2024", "24");

        bm.clkSave();
    }
}
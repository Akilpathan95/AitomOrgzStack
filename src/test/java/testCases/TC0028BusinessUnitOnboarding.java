package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0028BusinessUnitOnboarding extends BaseClass {

    LeftMenuPage lp;
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

}

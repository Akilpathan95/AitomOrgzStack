package testCases;

import org.testng.annotations.Test;
import pageObject.LeftMenuPage;
import pageObject.OrgSetup_CodePage;
import testBase.BaseClass;

public class TC0015_OtganisationSetupCodes extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 2)
    public void verify_AddZone()
    {
        lp=new LeftMenuPage(driver);
        lp.clkOrganisationSetup();
        lp.clkZone();
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing" + randomString());
        oc.enterCode("Ak70869" + randomNumber());
        oc.enterDescrption("testing description");
        oc.clkAdd();
    }

    @Test(priority = 3)
    public void verify_AddBranch()
    {
        lp=new LeftMenuPage(driver);
        lp.clkBranch();
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing" + randomString());
        oc.enterCode("Ak70867" + randomNumber());
        oc.enterDescrption("testing description");
        oc.clkAdd();
    }

    @Test(priority = 4)
    public void verify_AddDivision()
    {
        lp=new LeftMenuPage(driver);
        lp.clkDivision();
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing" + randomString());
        oc.enterCode("Ak70861" + randomNumber());
        oc.enterDescrption("testing description");
        oc.clkAdd();
    }

    @Test(priority = 5)
    public void verify_AddDepartment()
    {
        lp=new LeftMenuPage(driver);
        lp.clkDepartment();
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing" + randomString());
        oc.enterCode("Ak70862"+ randomNumber());
        oc.enterDescrption("testing description");
        oc.clkAdd();
    }

    @Test(priority = 6)
    public void verify_AddDesignation()
    {
        lp=new LeftMenuPage(driver);
        lp.clkDesignation();
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing" + randomString());
        oc.enterCode("Ak70863" + randomNumber());
        oc.enterDescrption("testing description");
        oc.clkAdd();
    }
}

package testCases;

import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.LeftMenuPage;
import pageObject.OrgSetup_CodePage;
import testBase.BaseClass;

public class TC0023_OrganisationSetupGrade extends BaseClass {

    LeftMenuPage lp;
    OrgSetup_CodePage oc;

    @Test(priority = 2)
    public void verify_AddGrade()
    {
        lp=new LeftMenuPage(driver);
        lp.clkOrganisationSetup();
        lp.clkGrade();
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing" + randomString());
        oc.enterCode("Ak70863" + randomNumber());
        oc.clkAdd();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }

    @Test(priority = 3)
    public void verify_EditGrade()
    {
        oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterSearch("Testing");
        oc.clkEdit();
        oc.enterCode("Ak7086" + randomNumber());
        oc.clkUpdate();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }

    @Test(priority = 4)
    public void verify_DeleteGrade() throws InterruptedException {
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing Delete");
        oc.enterCode("Ak70863" + randomNumber());
        oc.clkAdd();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
        oc.enterSearch("Testing Delete");
        oc.clkDelete();
    }
}

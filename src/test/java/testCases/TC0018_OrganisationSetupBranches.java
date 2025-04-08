package testCases;

import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.LeftMenuPage;
import pageObject.OrgSetup_CodePage;
import testBase.BaseClass;

public class TC0018_OrganisationSetupBranches extends BaseClass {

    LeftMenuPage lp;
    OrgSetup_CodePage oc;

    @Test(priority = 2)
    public void verify_AddBranch()
    {
        lp=new LeftMenuPage(driver);
        lp.clkOrganisationSetup();
        lp.clkBranch();
        oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing" + randomString());
        oc.enterCode("Ak7086" + randomNumber());
        oc.enterCity("Mumbai");
        oc.clkAdd();
    }

    @Test(priority = 3)
    public void verify_EditBranch()
    {
        oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterSearch("Testing");
        oc.clkEdit();
        oc.enterCode("Ak7086" + randomNumber());
        oc.enterCity("Mumbai" + randomString());
        oc.clkUpdate();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }

    @Test(priority = 4)
    public void verify_DeleteBranch() throws InterruptedException {
        oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing Delete");
        oc.enterCode("Ak7086" + randomNumber());
        oc.enterCity("Mumbai");
        oc.clkAdd();
        oc.enterSearch("Testing Delete");
        oc.clkDelete();
    }
}

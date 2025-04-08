package testCases;

import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.LeftMenuPage;
import pageObject.OrgSetup_CodePage;
import testBase.BaseClass;

public class TC0022_OrgnisationSetupLocation extends BaseClass {

    LeftMenuPage lp;
    OrgSetup_CodePage oc;

    @Test(priority = 2)
    public void verify_AddLocation()
    {
        lp=new LeftMenuPage(driver);
        lp.clkOrganisationSetup();
        lp.clkLocation();
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Koparkhairane" + randomString());
        oc.enterCode("Ak70869" + randomNumber());
        oc.enterPlaceholder("Koparkhairane");
        oc.enterDescrption("testing Location");
        oc.enterRadius("50");
        oc.clkSetAddress();
        oc.enterCity("Navi Mumbai");
        oc.clkAdd();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }

    @Test(priority = 3)
    public void verify_EditLocation()
    {
        oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterSearch("Testing");
        oc.clkEdit();
        oc.enterCode("Ak70869" + randomNumber());
        oc.enterPlaceholder("Koparkhairane");
        oc.enterDescrption("testing Location" + randomString());
        oc.enterRadius("50");
        oc.clkSetAddress();
        oc.enterCity("Navi Mumbai");
        oc.clkUpdate();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }

    @Test(priority = 4)
    public void verify_DeleteLocation() throws InterruptedException {
        driver.navigate().refresh();
        OrgSetup_CodePage oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing Delete");
        oc.enterCode("Ak70869" + randomNumber());
        oc.enterPlaceholder("Koparkhairane");
        oc.enterDescrption("testing Location");
        oc.enterRadius("50");
        oc.clkSetAddress();
        oc.enterCity("Navi Mumbai");
        oc.clkAdd();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
        oc.enterSearch("Testing Delete");
        oc.clkDelete();
        bp.handleAlert();
    }
}

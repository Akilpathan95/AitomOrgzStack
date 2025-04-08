package testCases;

import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.LeftMenuPage;
import pageObject.OrgSetup_CodePage;
import testBase.BaseClass;

public class TC0020_OrganisationSetupDepartment extends BaseClass {

    LeftMenuPage lp;
    OrgSetup_CodePage oc;

    @Test(priority = 2)
    public void verify_AddDepartment()
    {
        lp=new LeftMenuPage(driver);
        lp.clkOrganisationSetup();
        lp.clkDepartment();
        oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing" + randomString());
        oc.enterCode("Ak70862"+ randomNumber());
        oc.enterDescrption("testing description");
        oc.clkAdd();
    }

    @Test(priority = 3)
    public void verify_EditDepartment()
    {
        oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterSearch("Testing");
        oc.clkEdit();
        oc.enterCode("Ak7086" + randomNumber());
        oc.enterDescrption("Desciption for Department " + randomString());
        oc.clkUpdate();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }

    @Test(priority = 4)
    public void verify_DeleteDepartment() throws InterruptedException {
        oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterName("Testing Delete");
        oc.enterCode("Ak70862"+ randomNumber());
        oc.enterDescrption("testing description");
        oc.clkAdd();
        oc.enterSearch("Testing Delete");
        oc.clkDelete();
    }
}

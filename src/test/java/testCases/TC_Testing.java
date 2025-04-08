package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC_Testing extends BaseClass {

    LeftMenuPage lp;
    OrgSetup_CodePage oc;

    @Test(priority = 7)
    public void verify_AddBranch()
    {
        lp=new LeftMenuPage(driver);
        lp.clkOrganisationSetup();
        lp.clkBranch();
        oc=new OrgSetup_CodePage(driver);
        oc.clkCompany();
        oc.enterSearch("Testing");
    }
}
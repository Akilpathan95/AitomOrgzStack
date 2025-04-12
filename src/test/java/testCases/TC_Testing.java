package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC_Testing extends BaseClass {

    LeftMenuPage lp;

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
        BusinessUnitPage bp=new BusinessUnitPage(driver);
        bp.clkContacts();
    }

    @Test(priority = 5)
    public void verify_AddBusinessUnitContacts()
    {
        BusinessUnit_ContactsPage bc=new BusinessUnit_ContactsPage(driver);
        bc.clkAddNew();
        bc.enterName("Akil");
        bc.enterDesignation("Senior Software Test Engineer");
    }

}
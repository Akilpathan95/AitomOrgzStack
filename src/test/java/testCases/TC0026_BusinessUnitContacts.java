package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0026_BusinessUnitContacts extends BaseClass {

    LeftMenuPage lp;
    BusinessUnitPage bp;

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
    public void verify_AddBusinessUnitContacts()
    {
        bp=new BusinessUnitPage(driver);
        bp.clkContacts();
        BusinessUnit_ContactsPage bc=new BusinessUnit_ContactsPage(driver);
        bc.clkAddNew();
        bc.enterName("Rhutik");
        bc.enterDesignation("Senior Software Test Engineer");
        bc.enterMobileNo(randomNumber());
        bc.enterEmail(randomString().toLowerCase() + "@orgzstack.com");
        bc.enterDepartment("IT");
        bc.selectAnniversary("24-12-2023");
        bc.selectDOB("14-08-1995");
        bc.clkSave();
    }

    @Test(priority = 6)
    public void verify_EditBusinessUnit() throws InterruptedException {
        Thread.sleep(1000);
        bp=new BusinessUnitPage(driver);
        bp.clkContacts();
        BusinessUnit_ContactsPage bc=new BusinessUnit_ContactsPage(driver);
        bc.enterSearch("Rhutik");
        bc.clkEdit();
        bc.enterDesignation("Senior Software Developer" + randomString().toLowerCase());
        bc.enterMobileNo(randomNumber());
        bc.enterEmail(randomString().toLowerCase() + "@orgzstack.com");
        bc.enterDepartment("Software");
        bc.selectAnniversary("18-1-2018");
        bc.selectDOB("11-04-1994");
        bc.clkUpdate();
    }

    @Test(priority = 7)
    public void verify_deleteBusinessUnit() throws InterruptedException {
        Thread.sleep(1000);
        BusinessUnit_ContactsPage bc=new BusinessUnit_ContactsPage(driver);
        bc.enterSearch("Rhutik");
        bc.clkDelete();
        BasePage ba=new BasePage(driver);
        ba.handleAlert();
    }
}

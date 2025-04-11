package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC_Testing extends BaseClass {

    LeftMenuPage lp;
    BusinessUnitPage bu;

    @Test(priority = 3)
    public void verify_clkBusinessUnit()
    {
        lp=new LeftMenuPage(driver);
        lp.clkBusinessUnit();
    }

    @Test(priority = 4)
    public void verify_createBusinessUnit()
    {
        bu=new BusinessUnitPage(driver);
        //bu.clkAddBusinessUnit();
        //bu.enterSearch("Testing Test");
        bu.clkEditIcon();
        bu.clkContacts();
        bu.clkEmployees();
        bu.clkHolidays();
        bu.clkLeaves();
        bu.clkShifts();
        bu.clkLocation();
        bu.clkAttendance();
        bu.clkApprovalSetup();
        bu.clkSalaryStructure();
        bu.clkClientActivityLog();
        bu.clkBsicInfo();
    }

}
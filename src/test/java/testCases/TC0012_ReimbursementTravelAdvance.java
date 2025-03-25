package testCases;

import org.testng.annotations.Test;
import pageObject.LeftMenuPage;
import pageObject.MyReimbursements;
import testBase.BaseClass;

public class TC0012_ReimbursementTravelAdvance extends BaseClass {

    @Test(priority = 2, groups = "Master")
    public void verify_RequisitionPage()
    {
        LeftMenuPage lp=new LeftMenuPage(driver);
        lp.clkReimbursement();
    }

    @Test(priority = 3)
    public void verify_myReimbursement() throws InterruptedException {
        MyReimbursements mr=new MyReimbursements(driver);
        mr.clkAdvance();
        mr.selectTravelDateFrom();
        mr.clkOK();
        mr.selectTravelDateTo();
        mr.clkOK();
        mr.enterLocationFrom("Mumbai");
        mr.enterLocationTo("Pune");
        mr.enterAmount("500");
        mr.enterAddRemark("Travelling with the Car");
        mr.clkSubmit();
    }
}

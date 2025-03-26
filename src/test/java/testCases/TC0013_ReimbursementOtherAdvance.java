package testCases;

import org.testng.annotations.Test;
import pageObject.LeftMenuPage;
import pageObject.MyReimbursements;
import testBase.BaseClass;

public class TC0013_ReimbursementOtherAdvance extends BaseClass {

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
        mr.clkOtherAdvance();
        mr.clkAdvanceType();
        mr.enterAmount("20000");
        mr.enterAddRemark("Room Rent");
        mr.clkSubmitOtherAdvance();

    }
}

package testCases;

import org.testng.annotations.Test;
import pageObject.CreateRequisition;
import pageObject.LoginPage;
import pageObject.RequisitionPage;
import testBase.BaseClass;

public class TC002_CreateRequisition extends BaseClass {

    @Test(priority = 1)
    public void verify_Login()
    {
        LoginPage lp=new LoginPage(driver);
        lp.enterEmail(p.getProperty("email"));
        lp.enterPassword(p.getProperty("password"));
        lp.clkLogin();
    }

    @Test(priority = 2)
    public void verify_RequisitionPage()
    {
        RequisitionPage rp=new RequisitionPage(driver);
        rp.clkRequisition();
        rp.clkRequisition_Option();
    }

    @Test(priority = 3)
    public void verify_CreateRequisition()
    {
        CreateRequisition cr=new CreateRequisition(driver);
        cr.clkCreate_requisition();

        cr.clk_InternalExternal();
        cr.clkSelect_Organisation();
        cr.clk_ClientName();
        cr.clkCreateRequisition_POPup();
    }

}

package testCases;

import org.testng.annotations.Test;
import pageObject.CreateRequisition;
import pageObject.LoginPage;
import pageObject.Requirement_DetailsPage;
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

    @Test(priority = 4)
    public void verify_RequirementDetails()
    {
        Requirement_DetailsPage rp=new Requirement_DetailsPage(driver);
        rp.enterJob_Title("Senior Software Tester");
        rp.enterPosition_Id("1234");
        rp.enterPosition_Name("Tester");
        rp.selectPriority();
        rp.clkSelect_Candidate();
        rp.enterTAT("3");
        rp.verifyDate("3");
        rp.selectRequirement_Type();
        rp.enterNotice_Period("30 days");
        rp.enterLocation_Name("Navi Mumbai", 0);
        rp.enterNo_Position("2", 0);
        rp.clkAdd_Work();
        rp.enterLocation_Name("Mumbai", 1);
        rp.enterNo_Position("2",1);
        rp.clkAdd_Work();
        rp.enterLocation_Name("Pune",2);
        rp.enterNo_Position("2",2);
        rp.clkSub_Work();
        rp.countNo_OfPosition();
        rp.selectCurrency();
        rp.selectPeriod();
        rp.enterCTC_Min("8");
        rp.enterCTC_Max("5");
        rp.selectWork_Model();
        rp.enterTarget_Company("IPSearch Executive Search");
        rp.selectShift_Type();
        rp.selectGender();
        rp.enterAgeGroup_From("21");
        rp.enterAgeGroup_To("35");
        rp.enterExperience_From("3");
        rp.enterExperience_To("5");
        rp.selectEducational_Qualification();
        rp.waitForAdditional_Qualification();
        rp.selectAdditional_Qualification("B.C.S.");
        rp.enterAlternate_Qualificatio("Computer Science");
        rp.enterAdd_Remark("ISTQB certified tester has added advantage");
        rp.clkSave();

    }

}

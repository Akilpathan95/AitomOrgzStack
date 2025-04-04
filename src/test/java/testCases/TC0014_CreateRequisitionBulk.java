package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;
import utilities.Dataproviders;

import java.time.Duration;

public class TC0014_CreateRequisitionBulk extends BaseClass {

    @Test(priority = 2, groups = {"Master", "Requisition"})
    public void verify_RequisitionPage()
    {
        LeftMenuPage lf=new LeftMenuPage(driver);
        lf.clkRequisition();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        RequisitionTopMenuPage rp=new RequisitionTopMenuPage(driver);
        rp.clkRequisition_Option();
    }

    @Test(priority = 3, dataProvider = "CreateRequisitionData", dataProviderClass = Dataproviders.class, groups = "Master")
    public void verify_CreateRequisitionData(String title, String id, String name, String tat, String notice, String locationN, String positionNo, String min, String max, String target, String ageF, String ageT, String expFrom, String expTo, String qual, String altQual, String rem) throws InterruptedException {
        CreateRequisition cr = new CreateRequisition(driver);
        cr.clkCreate_requisition();

        cr.clk_InternalExternal();
        cr.clkSelect_Organisation();
        cr.clk_ClientName();
        cr.clkCreateRequisition_POPup();

        try {

            Requirement_DetailsPage rp=new Requirement_DetailsPage(driver);
            rp.enterJob_Title(title);
            rp.enterPosition_Id(id);
            rp.enterPosition_Name(name);
            rp.selectPriority();
            rp.clkSelect_Candidate();
            rp.enterTAT(tat);
            try {
                rp.verifyDate(tat);
                System.out.println("TAT is verified properly");
                //Assert.assertTrue(true);
            }
            catch (Exception e)
            {
                System.out.println("TAT is not working proper");
                Assert.assertTrue(false);
            }

            rp.selectRequirement_Type();
            rp.enterNotice_Period(notice);
            rp.enterLocation_Name(locationN, 0);
            rp.enterNo_Position(positionNo, 0);
            rp.countNo_OfPosition();
            rp.selectCurrency();
            rp.selectPeriod();
            rp.enterCTC_Min(max);
            rp.enterCTC_Max(min);
            rp.selectWork_Model();
            rp.enterTarget_Company(target);
            rp.selectShift_Type();
            rp.selectGender();
            rp.enterAgeGroup_From(ageF);
            rp.enterAgeGroup_To(ageT);
            rp.enterExperience_From(expFrom);
            rp.enterExperience_To(expTo);
            rp.selectEducational_Qualification();
            rp.waitForAdditional_Qualification();
            //rp.selectAdditional_Qualification(qual);
            rp.enterAlternate_Qualificatio(altQual);
            rp.enterAdd_Remark(rem);
            rp.clkSave();

            BasePage bp=new BasePage(driver);
            bp.handleAlert();

            Assert.assertTrue(true);

        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }
}

package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC_Testing extends BaseClass {

    LeftMenuPage lp;
    BasePage bp;

    @Test(priority = 3, dependsOnMethods = {"verify_Login"})
    public void verify_Requisition()
    {
        lp=new LeftMenuPage(driver);
        lp.clkRequisition();
    }

    @Test(priority = 4)
    public void verify_DomesticAddComensation() throws InterruptedException {
        RequisitionTopMenuPage rt=new RequisitionTopMenuPage(driver);
        rt.clkRecruitment();
        RecruitmentPage rp=new RecruitmentPage(driver);
        rp.clkRecruitment_List();
        Recruitment_RRFPage rr=new Recruitment_RRFPage(driver);
        rr.clkAddCompensation();
        rr.clkOpenForm();
        rr.enterTakeHomeSalary();
        rr.enterPFContribution();
        rr.enterESICContribution();
        rr.enterBonus();
        rr.enterOthers();
        rr.enterOT();
        rr.clkAddMoreCompensation();
        rr.enterWorkingDuration();
        rr.enterWorkingDays();
        rr.enterOTHOurs();
        rr.selectRatePerHour();
        rr.selectFoodDuringHrs();
        rr.selectAccomodation();
        rr.selectTransportation();
        rr.selectWeeklyOff();
        rr.selectAnnualLeaves();
        rr.selectRotationalShift();
        rr.selectNightAllownce();
        rr.selectGratuity();
        rr.clkSaveAndUpload();
        bp=new BasePage(driver);
        bp.toastMessage();
    }

    @Test(priority = 5)
    public void verify_InternationalAddComensation()
    {
        //RequisitionTopMenuPage rt=new RequisitionTopMenuPage(driver);
        //rt.clkRecruitment();
        //RecruitmentPage rp=new RecruitmentPage(driver);
        //rp.clkRecruitment_List();
        Recruitment_RRFPage rr=new Recruitment_RRFPage(driver);
        //rr.clkAddCompensation();
        //rr.clkOpenForm();
        rr.clkInternational();
        rr.selectCountry();
        rr.enterBasicSalary();
        rr.enterAccomodationAllowance();
        rr.enterFoodAllowance();
        rr.enterBonus();
        rr.enterInsurance();
        rr.enterOT();
        rr.clkAddMoreCompensation();
        rr.enterInternationalWorkingDuration();
        rr.enterWorkingDays();
        rr.selectFoodDuringHrs();
        rr.selectAccomodation();
        rr.selectTransportation();
        rr.selectInternationalRatePerHour();
        rr.enterOTHOurs();
        rr.selectWeeklyOff();
        rr.selectAnnualLeaves();
        rr.selectRotationalShift();
        rr.selectNightAllownce();
        rr.selectAirFare();
        rr.selectWorkVisa();
        rr.selecDurationOfEmployment();
        rr.selectGratuity();
        rr.clkSaveAndUpload();
        bp=new BasePage(driver);
        bp.toastMessage();
    }

}
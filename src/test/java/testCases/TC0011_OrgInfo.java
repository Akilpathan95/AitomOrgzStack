package testCases;

import org.testng.annotations.Test;
import pageObject.AddOrganisationInfoPage;
import pageObject.LeftMenuPage;
import testBase.BaseClass;

public class TC0011_OrgInfo extends BaseClass {

    @Test(priority = 2, groups = "Master")
    public void verify_RequisitionPage()
    {
        LeftMenuPage lp=new LeftMenuPage(driver);
        lp.clkOrganisationSetup();
        lp.clkOrgInfo();
    }


    @Test(priority = 8)
    public void verify_OrgInfo() throws InterruptedException {

        AddOrganisationInfoPage op=new AddOrganisationInfoPage(driver);
        op.enterOrganisationName("IPS Vantage Tech Services");
        op.enterOrganisationCode("WZ02");
        op.enterNumberOfEmployee("50");
        op.selectImage();
        op.enterEmailAddress("akil.pathan@orgzstack.com");
        op.enterMobileNumber("9870150276");
        op.enterAddress("Koparkhairane");
        op.enterAddress2("Sec-4");
        op.enterCity("Navi Mumbai");
        op.selectState();
        op.selectCountry();
        op.enterPincode("400709");
        op.entertxtOrganisationNumber("Cj5347K");
        op.selectLegalStatus();
        op.enterGstIn("Khj098K");
        op.clkSave();
    }
}

package testCases;

import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.LeftMenuPage;
import pageObject.OrganisationSetup_ClientPage;
import testBase.BaseClass;

public class TC0016_OrganisationSetupCreateClient extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 2)
    public void verify_AddClient()
    {
        lp=new LeftMenuPage(driver);
        lp.clkOrganisationSetup();
        lp.clkClient();
        OrganisationSetup_ClientPage oc=new OrganisationSetup_ClientPage(driver);
        oc.clkAddNew();
        oc.enterClientName("AkilTesting");
        oc.selectLogo();
        oc.inputClientCode(randomString().toLowerCase() + "7086" );
        oc.inputAddress("Goregav" + randomString().toLowerCase());
        oc.selectCountry();
        oc.selectState();
        oc.inputCity("Mumbai" + randomString().toLowerCase());
        oc.inputPhoneNUmber(randomNumber());
        oc.inputMobileNumber(randomNumber());
        oc.inputEmail(randomString().toLowerCase() + "@capgemini.com");
        oc.selectSegment();
        oc.inputWebsite(randomString().toLowerCase() + "capgemini.in");
        oc.selectServices();
        oc.inputGST("22" + "AB" + randomStringNumeric().toUpperCase() + "F2Z5");
        oc.inputPan("CJ" + randomStringNumeric().toUpperCase() + "1K");
        oc.inputTan("C" + randomStringNumeric().toUpperCase() + "12K");
        oc.selectAgreementCopy();
        oc.selectAgreementStartDate("14-08-2023");
        oc.selectAgreementEndDate("14-08-2025");
        oc.inputName("Ghouse" + randomString().toLowerCase());
        oc.inputEmailID(randomString().toLowerCase() + "@capgemini.com");
        oc.inputMobileNo(randomNumber());
        oc.inputDesignation("Testing" + randomString().toLowerCase());
        oc.clkAddSPOC();
        oc.contractual();
        oc.permanent();
        oc.clkSaveClient();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}

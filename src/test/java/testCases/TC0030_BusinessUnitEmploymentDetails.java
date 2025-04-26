package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0030_BusinessUnitEmploymentDetails extends BaseClass {

    LeftMenuPage lp;
    BusinessUnit_EmployessPage be;
    BasePage basep;

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
    public void verify_EmploymentDetails()
    {
        BusinessUnitPage bu=new BusinessUnitPage(driver);
        bu.clkEmployees();
        be=new BusinessUnit_EmployessPage(driver);
        be.clkEditEmployee();
        BusinessUnitEmployee_EmploymentDetails be=new BusinessUnitEmployee_EmploymentDetails(driver);
        be.clkEmploymentDetails();
        be.selectNatureOfEmployment();
        be.selectCalender("Date of Joining", 1, "14", "March 2025");
        //be.selectContractEmployeeEndDate("Contract/ Employment End Date", 1, "14", "March 2025");
        be.selectProbationType();
        be.selectDuration();
        //be.selectCalender("Confirmation Date", 1, "14", "March 2025");
        be.enterNoticePeriod("30");
        be.enterESIC("12300000040000503");
        be.selectFile("Employment Form", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("Employee NDA Form", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("Declaration Against Bribery And Corruption", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("Induction Form", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("BGV Form", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("Insurance(GMC & GPA Sheet)", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("Declaration For Healthcare Coverage", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("PF Composite Form", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("PF Exemption Form", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("PF Nominee & Declaration Form", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("Gratuity Form", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.selectFile("Esic Form", 1, "C:\\Users\\IPSL\\Documents\\Akil_Pathan_Resume.pdf");
        be.enterUAN("2345678998765432");
        be.enterPF("KA/BLR/1234567/890");
        be.enterInsuranceNumber("AB123456C");
        be.enterInsurancePF("MH/BAN/1234567/000/0054321");
        be.selectCalender("Date of Resignation", 1, "14", "March 2025");
        be.selectReasonOfLeaving();
        be.selectCalender("Date of Leaving", 1, "14", "March 2025");
        be.selectCalender("Actual DOL", 1, "14", "March 2025");
        be.clkSave();
        basep=new BasePage(driver);
        basep.handleAlert();
    }
}

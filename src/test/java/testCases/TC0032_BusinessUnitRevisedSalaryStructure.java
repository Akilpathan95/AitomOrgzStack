package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0032_BusinessUnitRevisedSalaryStructure extends BaseClass {

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
    public void verify_RevisedSalaryStructure()
    {
        BusinessUnitPage bu=new BusinessUnitPage(driver);
        bu.clkEmployees();
        be=new BusinessUnit_EmployessPage(driver);
        be.clkEditEmployee();
        BusinessUnitEmployee_SalaryStructure bs=new BusinessUnitEmployee_SalaryStructure(driver);
        bs.clkSalaryStructure();
        bs.clkRevisedSalary();
        bs.revisedInputFields("Basic", "2000");
        bs.revisedInputFields("DA", "500");
        bs.revisedInputFields("HRA", "200");
        bs.reviseddrp("PF", 1,  "((Basic+DA)/100)*13");
        bs.reviseddrp("ESIC", 1, "Gross > 21000 ? 0 : (Gross/100)*3.25");
        bs.reviseddrp("Bonus",1, "Not Applicable");
        bs.reviseddrp("Leave Wages", 1, "Not Applicable");
        bs.reviseddrp("Gratuity", 1, "Not Applicable");
        bs.reviseddrp("EMPLOYEE'S CONTRIBUTION", 2, "((Basic+DA)/100)*12");
        bs.reviseddrp("EMPLOYEE'S CONTRIBUTION", 3, "Gross > 21000 ? 0 : (Gross/100)*0.75");
        bs.reviseddrp("EMPLOYEE'S CONTRIBUTION", 4, "Maharashtra");
        bs.cal();
        bs.enterRemarks("It is effective from April 2025");
        bs.clkplus();
        bs.clkSave();
        basep=new BasePage(driver);
        basep.handleAlert();
    }
}

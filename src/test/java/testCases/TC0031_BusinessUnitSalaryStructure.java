package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0031_BusinessUnitSalaryStructure extends BaseClass {

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

    @Test(priority = 9)
    public void verify_SalaryStructure()
    {
        BusinessUnitPage bu=new BusinessUnitPage(driver);
        bu.clkEmployees();
        be=new BusinessUnit_EmployessPage(driver);
        be.clkEditEmployee();
        BusinessUnitEmployee_SalaryStructure bs=new BusinessUnitEmployee_SalaryStructure(driver);
        bs.clkSalaryStructure();
        bs.enterCalender("09-03-2025");
        bs.clkPFYes();
        bs.clkESIC();
        bs.clkPT();
        bs.clkLWF();
        bs.inputFields("Basic", "15000");
        bs.inputFields("DA", "2700");
        bs.inputFields("HRA", "30000");
        bs.verifyGrossSalary(15000, 2700, 30000);
        bs.selectPFEmployer();
        bs.selectESICEmployer();
        bs.selectLWFEmployer();
        bs.selectBonus();
        bs.selectLeaveWage();
        bs.selectGratuity();
        bs.selectPFEmployee();
        bs.selectESICEmployee();
        bs.selectProfessionalTax();
        bs.selectLWFEmployee();
        bs.clkplus();
        bs.clkSave();
        basep=new BasePage(driver);
        basep.toastMessage();
        bs.clkSalaryStructurePreview();
    }
}

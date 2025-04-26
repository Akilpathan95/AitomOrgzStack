package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0029_MappingBusinessUnit extends BaseClass {

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

    @Test(priority = 7)
    public void verify_MappingBusinessUnit() {
        BusinessUnitPage bu=new BusinessUnitPage(driver);
        bu.clkEmployees();
        be=new BusinessUnit_EmployessPage(driver);
        be.clkEditEmployee();
        BusinessUnitEmployee_Mapping bm=new BusinessUnitEmployee_Mapping(driver);
        bm.clkMapping();
        bm.drpField(1,"Reporting Manager", "Akil Pathan");
        bm.calender(1,"December 2024", "14");
        bm.drpField(2,"Zone", "West Zone Testing");
        bm.calender(2,"November 2024", "24");

        bm.drpField(3,"Branch", "Mumbai Testing");
        bm.calender(3,"December 2024", "14");
        bm.drpField(4,"Division", "IT");
        bm.calender(4,"November 2024", "24");

        //bm.drpField(5,"Working Location", "Goregav");
        //bm.calender(5,"November 2024", "24");

        bm.drpField(6,"Department", "Development");
        bm.calender(6,"December 2024", "14");
        bm.drpField(7,"Designation", "Sr Testing Engineer");
        bm.calender(7,"November 2024", "24");

        bm.clkSave();

        basep=new BasePage(driver);
        basep.handleAlert();
    }
}

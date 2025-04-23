package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC_Testing extends BaseClass {

    LeftMenuPage lp;
    BusinessUnitPage bp;
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

    //@Test(priority = 5)
    public void verify_AddBasicInfo()
    {
        bp=new BusinessUnitPage(driver);
        bp.clkEmployees();
        be=new BusinessUnit_EmployessPage(driver);
        be.clkAddNewEmployee();
        be.enterEmployeeId("IPC" + randomStringNumeric());
        be.addProfilePic();
        be.selectSalutation();
        be.enterAadharName("Akil Nisar Pathan");
        be.enterFirstName("Akil");
        be.enterMiddleName("Nisar");
        be.enterLastName("Pathan");
        be.enterDOB("14-08-1995");
        be.selectGender();
        be.selectBloodGroup();
        be.enterReligion("Indian-Islam");
        be.enterEmail(randomAlphaNumeric().toLowerCase() + "gmail.com");
        be.enterWorkEmail(randomAlphaNumeric().toLowerCase() + "orgzstack.com");
        be.enterMobileNumber(randomNumber());
        be.enterAlternateNumber(randomNumber());
        be.enterEmergencyPersonName(randomString());
        be.enterEmergencyPersonNumber(randomNumber());
        be.enterAddress(randomString() + randomStringNumeric());
        be.enterPincode("123456");
        be.selectCountry();
        be.selectState();
        be.enterCity("Navi Mumbai");
        be.clkPermanentAddress();
        be.selectFromDate("06/10/2022");
        be.selectToDate("03/12/2024");
        be.enterCompanyName("SMARTe dass pvt ltd");
        be.enterDesignation("Senior Software Testing Engineee");
        be.enterLastSalary("15000");
        be.enterToReporting("Suchita");
        be.enterMoNumber(randomNumber());
        be.enterRemark("Good Candidate");
        be.addAppointmentLetter();
        be.addExperienceLetter();
        be.addSalarySlip();
        be.addRelievingLetter();
        be.clkAdd1();
        be.enterEducation();
        be.clkSave();
        basep=new BasePage(driver);
        basep.handleAlert();
    }

    //@Test(priority = 6)
    public void verify_Onboarding()
    {
        BusinessUnitPage bu=new BusinessUnitPage(driver);
        bu.clkEmployees();
        be=new BusinessUnit_EmployessPage(driver);
        be.clkEditEmployee();
        BusinessUnitEmployee_Onboarding be=new BusinessUnitEmployee_Onboarding(driver);
        be.clkOnboarding();
        be.enterPanNo("AAAPA1234A");
        be.addPan();
        be.enterAadharNo("397788000234");
        be.addAadhar();
        be.enterPassport("J8369854");
        be.addPassport();
        be.enterFatherFirstName(randomString());
        be.enterFatherSecondName(randomString());
        be.enterFatherLastName(randomString());
        be.enterMotherFirstName(randomString());
        be.enterMotherSecondName(randomString());
        be.enterMotherLastName(randomString());
        be.selectMaritalStatus();
        be.selectAnniversaryDate();
        be.clkNoOfChildren();
        be.enterSpousesName(randomString());
        be.enterNomineeName(randomString());
        be.selectDOB();
        be.enterRelationship("Parents");
        be.enterPrivateBankName("SBI");
        be.enterPrivateAccountNo("5463728283736");
        be.enterPrivateIFSCCode("SBI0001234");
        be.clkPrivateBankDetails();
        be.addCancelledCheque();
        be.addHobbies();
        be.enterHobbies("Playing Cricket");
        be.addSports();
        be.enterSports("Cricket");
        be.clkSave();
        basep=new BasePage(driver);
        basep.handleAlert();
    }

    //@Test(priority = 7)
    public void verify_deleteBusinessUnit() {
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

    //@Test(priority = 8)
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

    //@Test(priority = 9)
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
    }

    @Test(priority = 9)
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
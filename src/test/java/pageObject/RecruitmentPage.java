package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class RecruitmentPage extends BasePage {

    public RecruitmentPage(WebDriver driver)
    {
        super(driver);
    }

    Actions actions;

    Select select;
    JavascriptExecutor js;

    @FindBy(xpath = "//div[normalize-space()=\"RECRUITMENT\"]")
    WebElement btnRecruitment;

    @FindBy(xpath = "(//p[contains(text(),'Senior Software Tester')])[1]")
    WebElement selectRecruirment_List;

    @FindBy(xpath = "(//div[normalize-space()='Job Description'])[1]")
    WebElement selectJob_Description;

    @FindBy(xpath = "//button[normalize-space()=\"Enhance/Create with AI\"]")
    WebElement btnCreateWithAI;

    @FindBy(xpath = "(//input[@placeholder='Select from below suggestions or enter your own response here'])[1]")
    WebElement txtSelectSuggestion;

    @FindBy(xpath = "(//div[@class='suggestions']//span[@class='suggestion-bubble'])[1]")
    WebElement drpsuggestion;

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement btnSubmit;

    @FindBy(xpath = "//button[normalize-space()=\"Generate JD\"]")
    WebElement btnGenerate_JD;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    @FindBy(xpath = "//div[normalize-space()=\"Generate Keywords\"]")
    WebElement btnGenerate_Keyword;

    @FindBy(xpath = "//input[@id=\"mui-3\"]")
    WebElement txtGenerate_Keyword;

    @FindBy(xpath = "//div[@class=\"MuiBox-root css-2id3x1\"]//div[1]")
    WebElement drpGenerate_Keyword;

    @FindBy(xpath = "//div[contains(text(),\"SAVE\")]")
    WebElement btnGenerateKeyword_Save;

    @FindBy(xpath = "//div[normalize-space()=\"Hiring Team\"]")
    WebElement selectHiring_Team;

    @FindBy(xpath = "//div[contains(text(),'Assign Role')]")
    List<WebElement> drpAssignRole;

    @FindBy(xpath = "//div[contains(text(),'Name/Email Id')]")
    List<WebElement> drpNameEmailId;

    @FindBy(xpath = "//span[contains(text(),'Add To Team')]")
    List<WebElement> btnAddtoTeam;

    @FindBy(xpath = "//label[normalize-space()=\"Assign to All Locations\"]")
    List<WebElement> checkBox_AssigntoLocations;

    //------------------------Interview Setup------------------

    @FindBy(xpath = "//div[normalize-space()=\"Interview Setup\"]")
    WebElement btn_InterviewSetup;

    @FindBy(xpath = "//input[@placeholder=\"Enter new skill\"]")
    WebElement txtAddMoreSkill;

    @FindBy(xpath = "//button[normalize-space()=\"Add\"]")
    WebElement btnAddSkill;

    @FindBy(xpath = "//div[contains(text(),\"Add more MCQs\")]")
    WebElement btnAddMoreMCQs;

    @FindBy(xpath = "//div[@aria-label=\"Generate Questions\"]//div//textarea")
    WebElement txtAddQuetion;

    @FindBy(xpath = "//input[@placeholder=\"Option 1\"]")
    WebElement txtOption1;

    @FindBy(xpath = "//input[@placeholder=\"Option 2\"]")
    WebElement txtOption2;

    @FindBy(xpath = "//input[@placeholder=\"Option 3\"]")
    WebElement txtOption3;

    @FindBy(xpath = "//input[@placeholder=\"Option 4\"]")
    WebElement txtOption4;

    @FindBy(xpath = "//div[@aria-label=\"Generate Questions\"]//div//div//select")
    WebElement drpCorrectAnswer;

    @FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
    WebElement btnAddQuestion;

    @FindBy(xpath = "//button[normalize-space()=\"SAVE INTERVIEW\"]")
    WebElement btnSave_Interview;

    //------------------------Add Candidate------------------

    @FindBy(xpath = "//div[normalize-space()=\"Candidates\"]")
    WebElement btnCandidates;

    @FindBy(xpath = "//span[normalize-space()=\"Add Candidate\"]")
    WebElement btnAdd_Candidate;

    @FindBy(xpath = "//p[normalize-space()=\"Add Manually\"]")
    WebElement btnAdd_Manually;

    //------Add Candidate--Personal Details-----
    @FindBy(xpath = "//input[@name=\"first_Name\"]")
    WebElement txtFirst_Name;

    @FindBy(xpath = "//input[@name=\"middle_Name\"]")
    WebElement txtMiddle_Name;

    @FindBy(xpath = "//input[@name=\"last_Name\"]")
    WebElement txtLast_Name;

    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@name=\"mobile\"]")
    WebElement txtMobile_Number;

    @FindBy(xpath = "//input[@name=\"DOB\"]")
    WebElement txtDOB;

    @FindBy(xpath = "//input[@name=\"country\"]")
    WebElement txtCountry;

    @FindBy(xpath = "//input[@name=\"Industry\"]")
    WebElement txtIndustry;

    @FindBy(xpath = "//input[@name=\"current_Org\"]")
    WebElement txtCurrent_Organization;

    @FindBy(xpath = "//input[@name=\"current_Designation\"]")
    WebElement txtCurrent_Designation;

    @FindBy(xpath = "//input[@name=\"current_Location\"]")
    WebElement txtCurrent_Location;

    @FindBy(xpath = "//input[@name=\"functional_Area\"]")
    WebElement txtFunction_Area;

    @FindBy(xpath = "//input[@name=\"notice_Period\"]")
    WebElement txtNotice_Period;

    @FindBy(xpath = "//select[@name=\"relocate\"]")
    WebElement drpRelocate;

    @FindBy(xpath = "(//input[@placeholder='Enter here'])[10]")
    WebElement txtPrimary_Source;

    @FindBy(xpath = "//input[@name=\"secondary_Source\"]")
    WebElement txtSecondary_Source;

    @FindBy(xpath = "(//input[@placeholder='Enter here'])[11]")
    WebElement txtPassportNumber;

    @FindBy(xpath = "//input[@name=\"online_Profile_Url\"]")
    WebElement txtOnlineProfile_URL;

    @FindBy(xpath = "//select[@name=\"open_For_Remote_Work\"]")
    WebElement txtRemote_Work;

    @FindBy(xpath = "(//input[@placeholder='Enter here'])[18]")
    WebElement txtCurrent_Salary;

    @FindBy(xpath = "(//select[@name='currency'])[1]")
    WebElement drpCurrent_Salary;

    @FindBy(xpath = "(//select[@name='annual'])[1]")
    WebElement drpCurrentSalary_Type;

    @FindBy(xpath = "(//input[@placeholder='Enter here'])[19]")
    WebElement txtExpected_Salary;

    @FindBy(xpath = "(//select[@name='currency'])[2]")
    WebElement drpExpected_Salary;

    @FindBy(xpath = "(//select[@name='annual'])[2]")
    WebElement drpExpectedSalary_Type;

    @FindBy(xpath = "//input[@id=\"must-have-skills\"]")
    WebElement txtSkills;

    @FindBy(xpath = "//div[normalize-space()=\"SUBMIT\"]")
    WebElement btnCandidate_submit;

    //-------------------------Methods---------------

    public void clkRecruitment()
    {
        btnRecruitment.click();
    }

    public void clkRecruitment_List()
    {
        selectRecruirment_List.click();
    }

    public void clkJob_Description()
    {
        selectJob_Description.click();
    }

    public void clkCreateWithAI()
    {
        btnCreateWithAI.click();
    }

    public void selectSuggestion_Inputbox()
    {
        txtSelectSuggestion.click();
    }

    public void selectSuggestion()
    {
        drpsuggestion.click();
    }

    public void selectSubmit()
    {
        btnSubmit.click();
    }

    public void selectGenerate_JD()
    {
        btnGenerate_JD.click();
    }

    public void selectSave()
    {
        btnSave.click();
    }

    public void selectGenerate_Keyword()
    {
        actions=new Actions(driver);
        actions.moveToElement(btnGenerate_Keyword).perform();
        btnGenerate_Keyword.click();
    }

    /*public void clkInputGenerate_Keyword()
    {
        txtGenerate_Keyword.click();
    }*/

    public void clkdrpGenerate_Keyword()
    {
        drpGenerate_Keyword.click();
    }

    public void clkGenerateKeyword_Save()
    {
        btnGenerateKeyword_Save.click();
    }

    public void clkHiring_Team()
    {
        selectHiring_Team.click();
    }

    public void clkAssignRole()
    {
        int size = drpAssignRole.size();
        System.out.println("Number of the Assign Role : " + size);
        for (int i=0; i<drpAssignRole.size(); i++)
        {
            System.out.println("Assign Role : " + (i + 1) + ": " + drpAssignRole.get(i).getText());
            try {
                WebElement assignRole = drpAssignRole.get(i);
                 js=(JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", assignRole);

                wait=new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.elementToBeClickable(assignRole));

                actions=new Actions(driver);
                actions.moveToElement(assignRole).click().perform();
                System.out.println("Assign Role dropdown clicked: " + (i + 1));

                WebElement option=driver.findElement(By.xpath("//div[contains(text(), 'Recruiter')]"));
                wait.until(ExpectedConditions.elementToBeClickable(option));
                option.click();
                System.out.println("Role selected for assign role: " + (i+1));

            }
            catch (Exception e)
            {
                System.out.println("Click failed for Assign Role. Trying JavaScript click." + (i + 1) + ": " + e.getMessage());
                Assert.fail();
            }

        }
    }

    public void clkNameEmailId()
    {
        int size = drpNameEmailId.size();
        System.out.println("Number of the Name and Email Id : " + size);
        for (int i=0; i<drpNameEmailId.size(); i++) {
            System.out.println("Name and Email Id present on the page : " + (i + 1) + ": " + drpNameEmailId.get(i).getText());
            try {
                WebElement nameEmailId = drpNameEmailId.get(i);
                js=(JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", nameEmailId);

                wait=new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.elementToBeClickable(nameEmailId));

                actions=new Actions(driver);
                actions.moveToElement(nameEmailId).click().perform();
                System.out.println("Name/Email dropdown clicked: " + (i + 1));

                WebElement options=driver.findElement(By.xpath("//div[contains(text(), 'Akil Pathan (akilp1995@gmail.com)')]"));
                wait.until(ExpectedConditions.elementToBeClickable(options));
                options.click();
                System.out.println("Name and Email is successfully added.");
            }
            catch (Exception e)
            {
                System.out.println("Click failed for Name and Emai Id. Trying JavaScript click." +  (i + 1) + ": " + e.getMessage());
            }
        }
    }

    public void clkAddtoTeam()
    {
        int size = btnAddtoTeam.size();
        System.out.println("Number of the Add to Team : " + size);
        for (int i=0; i<btnAddtoTeam.size(); i++)
        {
            System.out.println("Add to Team button present on the page : " + (i + 1) + ": " + btnAddtoTeam.get(i).getText());
            try {
                Thread.sleep(2000);
                WebElement addToTeam = btnAddtoTeam.get(i);
                js=(JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", addToTeam);

                wait=new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.elementToBeClickable(addToTeam));

                /*actions=new Actions(driver);
                actions.moveToElement(addToTeam).click().perform();*/
                addToTeam.click();
                System.out.println("Add to Team button is successfully done.");

                if (isAlertPresent())
                {
                handleAlert();
                }

            }
            catch (Exception e)
            {
                System.out.println("Click failed for Add to Team. Trying JavaScript click." +  (i + 1) + ": " + e.getMessage());
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void selectAssigntoAllLocations() {
        try {

            if (checkBox_AssigntoLocations.size() > 0) {  // Check if the checkbox exists in the DOM
                WebElement assigntoLocations = checkBox_AssigntoLocations.get(0);

                // Check if checkbox is visible before clicking
                if (assigntoLocations.isDisplayed()) {
                    assigntoLocations.click();
                    System.out.println("Checkbox is displayed and clicked successfully!");
                    driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
                    System.out.println("Add to location is applied to all locations");
                } else {
                    System.out.println("Checkbox is present in the DOM but not visible.");
                }
            } else {
                System.out.println("Checkbox is not present on the page.");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    public void enter_AddMoreSkill(String add_Skill)
    {
        txtAddMoreSkill.sendKeys(add_Skill);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void clkbtnAddSkill()
    {
        btnAddSkill.click();
    }

    public void clkbtnAddMoreMCQs() throws InterruptedException {
        Thread.sleep(30000);
        btnAddMoreMCQs.click();
    }

    public void enter_AddQuestion(String addQuetion)
    {
        txtAddQuetion.sendKeys(addQuetion);
    }

    public void enter_Option1(String option1)
    {
        txtOption1.sendKeys(option1);
    }

    public void enter_Option2(String option2)
    {
        txtOption2.sendKeys(option2);
    }

    public void enter_Option3(String option3)
    {
        txtOption3.sendKeys(option3);
    }

    public void enter_Option4(String option4)
    {
        txtOption4.sendKeys(option4);
    }

    public void clkdrpCorrectAnswer()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Select select=new Select(drpCorrectAnswer);
        select.selectByValue("Black Box Testing");
    }

    public void clkbtnAddQuestion()
    {
        btnAddQuestion.click();
    }

    public void selectWorking_Type()
    {
        driver.findElement(By.xpath("//input[@value=\"hybrid\"]")).click();
        WebElement location=driver.findElement(By.xpath("//input[@placeholder=\"Enter locations (separated by commas)\"]"));
        location.sendKeys("Navi Mukmbai");
        location.sendKeys(Keys.ENTER);
    }

    public void selectSalary_Expectations(String selection)
    {
        WebElement yesRadioButton=driver.findElement(By.xpath("//input[@value=\"yes\"]"));
        WebElement noRadionButton=driver.findElement(By.xpath("//input[@value=\"no\"]"));

        if (selection.equalsIgnoreCase("Yes"))
        {
            yesRadioButton.click();
            System.out.println("Yes button is selected");
        }
        else if (selection.equalsIgnoreCase("No"))
        {
            noRadionButton.click();
            System.out.println("No button is selected");
        }
        else
        {
            System.out.println("Invalid option is selected");
        }
    }

    public void enterSalary_Range(String userInput, String minSalary, String maxSalary)
    {
        WebElement enter_MinSalary= driver.findElement(By.xpath("//input[@placeholder=\"Min Salary\"]"));
        WebElement enter_MaxSalary=driver.findElement(By.xpath("//input[@placeholder=\"Max Salary\"]"));
        if (userInput.equalsIgnoreCase("yes"))
        {
            enter_MinSalary.sendKeys(minSalary);
            enter_MaxSalary.sendKeys(maxSalary);
            System.out.println("Salary Range entered Min Salary : " + enter_MinSalary + "Max Salary : " + enter_MaxSalary);
        }
        else if (userInput.equalsIgnoreCase("No"))
        {
            System.out.println("salary range is not entered");
        }
        else
        {
            System.out.println("Wrong option entered");
        }
    }

    public void select_Availibility()
    {
        driver.findElement(By.xpath("//input[@value=\"within1month\"]")).click();
    }

    public void clkSave_Interview()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", btnSave_Interview);
        btnSave_Interview.click();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }

    public void clkInterview_Setup()
    {
        btn_InterviewSetup.click();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }

    public void clkCandidate()
    {
        btnCandidates.click();
    }

    public void clkAdd_Candidate()
    {
        btnAdd_Candidate.click();
    }

    public void clkAdd_Manually()
    {
        btnAdd_Manually.click();
    }

    public void enterFirst_Name(String first_Name)
    {
        String firstName=txtFirst_Name.getAttribute("value");
        if (firstName == null || firstName.isEmpty())
        {
            txtFirst_Name.sendKeys(first_Name);
            System.out.println("First Name is added");
        }
        else
        {
            System.out.println("Name is present.");
        }

    }

    public void enterMiddle_Name(String middle_Name)
    {
        String middleName=txtMiddle_Name.getAttribute("value");
        if (middleName == null ||middleName.isEmpty())
        {
            txtMiddle_Name.sendKeys(middle_Name);
            System.out.println("Middle Name is added");
        }
        else
        {
            System.out.println("Middle name is present");
        }
    }

    public void enterLast_Name(String last_Name)
    {
        String lastName=txtLast_Name.getAttribute("Value");
        if (lastName == null || lastName.isEmpty())
        {
            txtLast_Name.sendKeys(last_Name);
            System.out.println("Last Name is added");
        }
        else
        {
            System.out.println("Last name is present");
        }

    }

    public void enter_Email(String email)
    {
        String Cemail=txtEmail.getAttribute("Value");
        if (Cemail == null || Cemail.isEmpty())
        {
            txtEmail.sendKeys(email);
            System.out.println("Email is added");
        }
        else
        {
            System.out.println("Email is present");
        }

    }

    public void enter_MobileNo(String mobile_Number)
    {
        String mob_Number=txtMobile_Number.getAttribute("Value");
        if (mob_Number == null || mob_Number.isEmpty())
        {
            txtMobile_Number.sendKeys(mobile_Number);
            System.out.println("Mobile Number is added");
        }
        else
        {
            System.out.println("Mobile Number is Present");
        }

    }

    public void enter_DOB(String dob)
    {
        String dOB=txtDOB.getAttribute("Value");
        if (dOB==null || dOB.isEmpty())
        {
            txtDOB.sendKeys(dob);
            System.out.println("Date of Birth is added");
        }
        else
        {
            System.out.println("Date of birth present");
        }

    }

    public void enter_Country(String country)
    {
        String eCountry=txtCountry.getAttribute("Value");
        if (eCountry == null || eCountry.isEmpty())
        {
            txtCountry.sendKeys(country);
            System.out.println("Country is added");
        }
        else
        {
            System.out.println("Country is present");
        }

    }

    public void enterCurrent_Organization(String current_Organization)
    {
        String cOrg=txtCurrent_Organization.getAttribute("Value");
        if (cOrg==null || cOrg.isEmpty())
        {
            txtCurrent_Organization.sendKeys(current_Organization);
            System.out.println("Current Organization is added");
        }
        else
        {
            System.out.println("Current Organization is present");
        }

    }

    public void enterCurrent_Designation(String current_Designation)
    {
        String cDes=txtCurrent_Designation.getAttribute("Value");
        if (cDes == null || cDes.isEmpty())
        {
            txtCurrent_Designation.sendKeys(current_Designation);
            System.out.println("Current Designation is added");
        }
        else
        {
            System.out.println("Current Designation is present");
        }

    }

    public void enter_Industry(String industry)
    {
        String ind=txtIndustry.getAttribute("Value");
        if (ind == null || ind.isEmpty())
        {
            txtIndustry.sendKeys(industry);
            System.out.println("Industry is added");
        }
        {
            System.out.println("Industry is present");
        }

    }

    public void enterCurrent_Location(String current_Location)
    {
        String loc=txtCurrent_Location.getAttribute("Value");
        if (loc == null || loc.isEmpty())
        {
            txtCurrent_Location.sendKeys(current_Location);
            System.out.println("Current Location is added");
        }
        else
        {
            System.out.println("Current location is present");
        }

    }

    public void enterFunctional_Area(String functional_Area)
    {
        String fun=txtFunction_Area.getAttribute("Value");
        if (fun == null || fun.isEmpty())
        {
            txtFunction_Area.sendKeys(functional_Area);
            System.out.println("Functional Area is added");
        }
        else
        {
            System.out.println("Functional area is present");
        }

    }

    public void enterNotice_Period(String notice_Period)
    {
        String notice=txtNotice_Period.getAttribute("Value");
        if (notice == null || notice.isEmpty())
        {
            txtNotice_Period.sendKeys(notice_Period);
            System.out.println("Notice Period is added");
        }
        else
        {
            System.out.println("Notice Period is present");
        }

    }

    public void selectRelocate()
    {
        select=new Select(drpRelocate);
        select.selectByValue("Yes");
    }

    public void enterPrimary_Source(String primary_Source)
    {
        String primary=txtPrimary_Source.getAttribute("Value");
        if (primary == null || primary.isEmpty())
        {
            txtPrimary_Source.sendKeys(primary_Source);
            System.out.println("Primary Source is added");
        }
        else
        {
            System.out.println("Primary Source is present");
        }

    }

    public void enterSecondary_Source(String secondary_Source)
    {
        String secondary=txtSecondary_Source.getAttribute("Value");
        if (secondary == null || secondary.isEmpty())
        {
        txtSecondary_Source.sendKeys(secondary_Source);
            System.out.println("Secondary Source is added");
        }
        else
        {
            System.out.println("Secondary Source is present");
        }
    }

    public void enterPassport_Number(String passport_Number)
    {
        String pass=txtPassportNumber.getAttribute("Value");
        if (pass == null || pass.isEmpty())
        {
        txtPassportNumber.sendKeys(passport_Number);
            System.out.println("Passport Number is added");
        }
        else
        {
            System.out.println("Passport Number is present");
        }
    }

    public void enteronlineProfile_URL(String onlineProfile_URL)
    {
        String url=txtOnlineProfile_URL.getAttribute("Value");
        if (url == null || url.isEmpty())
        {
        txtOnlineProfile_URL.sendKeys(onlineProfile_URL);
            System.out.println("Online Profile URL is added");
        }
        else
        {
            System.out.println("Profile URL is present");
        }
    }

    public void selectRemote_Work()
    {
        select=new Select(txtRemote_Work);
        select.selectByValue("Yes");
    }

    public void enterCurrent_Salary(String current_Salary)
    {
        String salary=txtCurrent_Salary.getAttribute("Value");
        if (salary == null || salary.isEmpty())
        {
        txtCurrent_Salary.sendKeys(current_Salary);
        System.out.println("Current Salary is added");
        }
        else
        {
            System.out.println("Current Salary is present");
        }
    }

    public void selectCurrent_Salary()
    {
        select=new Select(drpCurrent_Salary);
        select.selectByValue("INR");
    }

    public void selectDrpCurrentSalary_Type()
    {
        select=new Select(drpCurrentSalary_Type);
        select.selectByValue("Yearly");
    }

    public void enterExpected_Salary(String expected_Salary)
    {
        String exp=txtExpected_Salary.getAttribute("Value");
        if (exp == null || exp.isEmpty())
        {
        txtExpected_Salary.sendKeys(expected_Salary);
        System.out.println("Expected Salary is added");
        }
        else
        {
            System.out.println("Expected Salary is present");
        }
    }

    public void selectExpected_Salary()
    {
        select=new Select(drpExpected_Salary);
        select.selectByValue("INR");
    }

    public void selectExpectecSalary_Type()
    {
        select=new Select(drpExpectedSalary_Type);
        select.selectByValue("Yearly");
    }

    public void enterSkills(String skills)
    {
        String ski=txtSkills.getAttribute("Value");
        if (ski == null || ski.isEmpty())
        {
        txtSkills.sendKeys(skills);
        txtSkills.sendKeys(Keys.ENTER);
            System.out.println("Skills are is added");
        }
        else
        {
            System.out.println("Skills are is present");
        }
    }

    public void selectEducation(String selectEducationDetails) throws InterruptedException {
        WebElement education=driver.findElement(By.xpath("//button[normalize-space()=\"+ Add Education\"]"));
        List<WebElement> eduDetails=driver.findElements(By.xpath("//div[@style='padding: 20px 40px; background-color: rgb(242, 242, 242); margin-left: 20px;']//div[@style='display: flex; justify-content: space-between; align-items: center;']"));

        if (eduDetails.size()>0)
        {
            System.out.println("Education details are already present. No need to Add");
        }
        else
        {
            if (selectEducationDetails.equalsIgnoreCase("Yes"))
            {
                System.out.println("No educational details found. Clicking on the Add education button to add the details");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", education);
                education.click();
                Thread.sleep(2000);
                WebElement degree=driver.findElement(By.xpath("//input[@name=\"Degree\"]"));
                WebElement institution=driver.findElement(By.xpath("//input[@name=\"Institution\"]"));
                WebElement university=driver.findElement(By.xpath("//input[@name=\"university\"]"));
                WebElement fromDate=driver.findElement(By.xpath("//input[@name=\"fromDate\"]"));
                WebElement toDate=driver.findElement(By.xpath("//input[@name=\"toDate\"]"));
                WebElement percentage=driver.findElement(By.xpath("//input[@name=\"percentage\"]"));
                WebElement location=driver.findElement(By.xpath("(//input[@name=\"location\"])[1]"));
                WebElement add=driver.findElement(By.xpath("//button[normalize-space()=\"Add\"][1]"));

                degree.sendKeys("B.sc in Computer Science");
                institution.sendKeys("ICL's Motilal JhunJhunwala College");
                university.sendKeys("Mumbai University");
                fromDate.sendKeys("01-06-2013");
                toDate.sendKeys("01-06-2016");
                percentage.sendKeys("60%");
                location.sendKeys("Vashi");
                add.click();
                System.out.println("Education details added successfully.");
            }
            else if (selectEducationDetails.equalsIgnoreCase("No"))
            {
                System.out.println("User dont want to add education details. Please move forward");
            }
        }
    }

    public void selectExperience(String experienceDetails) throws InterruptedException {
        WebElement experience=driver.findElement(By.xpath("//button[normalize-space()=\"+ Add Experience\"]"));
        List<WebElement> expDetails=driver.findElements(By.xpath("//h1[contains(text(),'Experience')]/ancestor::div/following-sibling::div[contains(@style, 'padding')]"));

        if (expDetails.size()>0)
        {
            System.out.println("Experience details are already present. No need to Add");
        }
        else
        {
            if (experienceDetails.equalsIgnoreCase("Yes"))
            {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", experience);
                experience.click();
                Thread.sleep(2000);
                WebElement job_Title=driver.findElement(By.xpath("//input[@name=\"jobTitle\"]"));
                job_Title.sendKeys("Senior Software Tester");
                WebElement company_Name=driver.findElement(By.xpath("//input[@name=\"companyName\"]"));
                company_Name.sendKeys("Cirrius Technologies PVT LTD");
                WebElement location=driver.findElement(By.xpath("//div[@class=\"w-full h-full font-sans\"]//div//div[2]//div[1]//div[3]//div[1]//div[1]//div[3]//input[1]"));
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", location);
                js.executeScript("arguments[0].click();", location);
                location.clear();
                location.sendKeys("Andheri");
                WebElement fromDate=driver.findElement(By.xpath("//div[@class=\"w-full h-full font-sans\"]//div//div[2]//div[1]//div[3]//div[1]//div[2]//div[1]//input[1]"));
                fromDate.sendKeys("20-09-2021");
                WebElement toDate=driver.findElement(By.xpath("//div[@class=\"w-full h-full font-sans\"]//div//div[2]//div[1]//div[3]//div[1]//div[2]//div[2]//input[1]"));
                toDate.sendKeys("05-08-2022");
                WebElement roles=driver.findElement(By.xpath("//input[@name=\"roles\"]"));
                roles.sendKeys("Manual and Automation Testing");
                WebElement add=driver.findElement(By.xpath("//div[@class=\"w-full h-full font-sans\"]//div//div[2]//div[1]//div[3]//div[1]//div[4]//button[2]"));
                add.click();

                System.out.println("Experience added successfully");

            }
            else if (experienceDetails.equalsIgnoreCase("No"))
            {
                System.out.println("Candidate dont want to add experience, Please move forward");
            }
        }
    }

    public void selectProject(String selectProjectDetail)
    {
        WebElement project=driver.findElement(By.xpath("//button[normalize-space()=\"+ Add Project\"]"));
        List<WebElement> proDetails=driver.findElements(By.xpath("//h1[contains(text(),'Project')]/ancestor::div/following-sibling::div[contains(@style, 'padding')]"));

        if (proDetails.size()>1)
        {
            System.out.println("Project details are already present. No need to Add");
        }
        else {

            if (selectProjectDetail.equalsIgnoreCase("Yes")) {
                project.click();

                WebElement project_Name = driver.findElement(By.xpath("//input[@name=\"projectName\"]"));
                project_Name.sendKeys("Orgzstack");
                WebElement location = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[3]/div[4]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]"));
                location.sendKeys("Navi Mumbai");
                WebElement from_Date = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[3]/div[4]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/input[1]"));
                from_Date.sendKeys("06-10-2022");
                WebElement to_Date = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[3]/div[4]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/input[1]"));
                to_Date.sendKeys("03-12-2024");
                WebElement project_Description = driver.findElement(By.xpath("//input[@name=\"description\"]"));
                project_Description.sendKeys("It is HR management tool");
                WebElement add = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[3]/div[4]/div[3]/div[1]/div[3]/div[1]/div[4]/button[2]"));
                add.click();
                System.out.println("Project added successfully");
            } else if (selectProjectDetail.equalsIgnoreCase("No")) {
                System.out.println("Candidate dont want to add project, Please move forward");
            }
        }
    }

    public void selectLanguage(String selectLanguage_Option)
    {
        WebElement language=driver.findElement(By.xpath("//button[normalize-space()=\"+ Add Language\"]"));

        if (selectLanguage_Option.equalsIgnoreCase("Yes"))
        {
            language.click();

            WebElement selectlanguage_option=driver.findElement(By.xpath("//select[@name=\"language\"]"));
            select=new Select(selectlanguage_option);
            select.selectByValue("English");
            WebElement read=driver.findElement(By.xpath("//input[@name=\"read\"]"));
            read.click();
            WebElement write=driver.findElement(By.xpath("//input[@name=\"write\"]"));
            write.click();
            WebElement speak=driver.findElement(By.xpath("//input[@name=\"speak\"]"));
            speak.click();
            WebElement add=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[3]/div[4]/div[4]/div[4]/div[1]/div[1]/div[2]/button[2]"));
            add.click();

            System.out.println("Language added successfully");
        }
        else if (selectLanguage_Option.equalsIgnoreCase("No"))
        {
            System.out.println("User dont want to update Language, Please move forward");
        }
    }

    public void selectCourses(String selectCourses_Details)
    {
        WebElement course=driver.findElement(By.xpath("//button[normalize-space()=\"+ Add Course\"]"));
        List<WebElement> couDetails=driver.findElements(By.xpath("//h1[contains(text(),'Courses')]/ancestor::div/following-sibling::div[contains(@style, 'padding')]"));
        if (couDetails.size()>0)
        {
            System.out.println("Course details are already present. No need to Add");
        }
        else
        {
            if (selectCourses_Details.equalsIgnoreCase("Yes")) {
                course.click();

                WebElement courseName = driver.findElement(By.xpath("//input[@name=\"courseName\"]"));
                courseName.sendKeys("Automation Test Specialist");
                WebElement fromDate = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[3]/div[4]/div[5]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]"));
                fromDate.sendKeys("07-05-2023");
                WebElement toDate = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[3]/div[4]/div[5]/div[1]/div[3]/div[1]/div[1]/div[3]/input[1]"));
                toDate.sendKeys("15-11-2023");
                WebElement add = driver.findElement(By.xpath("//div[@class=\"w-full h-full font-sans\"]//div//div//div//div//div//div//div//div//button[contains(text(),\"Add\")]"));
                add.click();

                System.out.println("Course details added successfully");
            } else if (selectCourses_Details.equalsIgnoreCase("No")) {
                System.out.println("User dont want to add course detail, Please proceed and submit the form");
            }
        }
    }

    public void addFile() throws InterruptedException {
        Thread.sleep(5000);
        WebElement uploadResume=driver.findElement(By.xpath("//input[@type='file']"));
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",uploadResume);
        uploadResume.sendKeys("C:\\Users\\IPSL\\Downloads\\Akil_Pathan_FinalManual.pdf");
    }

    public void submit()
    {
        btnCandidate_submit.click();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}

package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CandidateRepository_BasicInfo extends BasePage{

    Select select;
    Actions actions;

    public CandidateRepository_BasicInfo(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@name=\"first_Name\"]")
    public WebElement txtFirst_Name;

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

    @FindBy(xpath = "//input[@name=\"preferred_Location\"]")
    WebElement txtPreferredLocation;

    @FindBy(xpath = "//div[normalize-space()=\"SAVE\"]")
    WebElement btnSave;

    @FindBy(xpath = "//span[normalize-space()=\"EDIT\"]")
    WebElement btnEdit;

    public void selectEdit()
    {
        btnEdit.click();
    }

    public void editFirstName(String firstName)
    {
        txtFirst_Name.sendKeys(Keys.CONTROL+"a");
        txtFirst_Name.sendKeys(Keys.DELETE);
        txtFirst_Name.sendKeys(firstName);
    }

    public void editMiddleName(String middleName)
    {
        txtMiddle_Name.sendKeys(Keys.CONTROL+"a");
        txtMiddle_Name.sendKeys(Keys.DELETE);
        txtMiddle_Name.sendKeys(middleName);
    }

    public void editLastName(String lastName)
    {
        txtLast_Name.sendKeys(Keys.CONTROL+"a");
        txtLast_Name.sendKeys(Keys.DELETE);
        txtLast_Name.sendKeys(lastName);
    }

    public void editEmail(String email)
    {
        txtEmail.sendKeys(Keys.CONTROL+"a");
        txtEmail.sendKeys(Keys.DELETE);
        txtEmail.sendKeys(email);
    }

    public void editMobileNumber(String mobileNumber)
    {
        txtMobile_Number.sendKeys(Keys.CONTROL+"a");
        txtMobile_Number.sendKeys(Keys.DELETE);
        txtMobile_Number.sendKeys(mobileNumber);
    }

    public void editCurrentOrganization(String currentOrganization)
    {
        txtCurrent_Organization.sendKeys(Keys.CONTROL+"a");
        txtCurrent_Organization.sendKeys(Keys.DELETE);
        txtCurrent_Organization.sendKeys(currentOrganization);
    }

    public void editDOB(String dob)
    {
        txtDOB.sendKeys(Keys.CONTROL+"a");
        txtDOB.sendKeys(Keys.DELETE);
        txtDOB.sendKeys(dob);
    }

    public void editCountry(String country)
    {
        txtCountry.sendKeys(Keys.CONTROL+"a");
        txtCountry.sendKeys(Keys.DELETE);
        txtCountry.sendKeys(country);
    }

    public void editCurrentDesignation(String currentDesignation)
    {
        txtCurrent_Designation.sendKeys(Keys.CONTROL+"a");
        txtCurrent_Designation.sendKeys(Keys.DELETE);
        txtCurrent_Designation.sendKeys(currentDesignation);
    }

    public void editIndustry(String industry)
    {
        txtIndustry.sendKeys(Keys.CONTROL+"a");
        txtIndustry.sendKeys(Keys.DELETE);
        txtIndustry.sendKeys(industry);
    }

    public void editCurrentLocation(String currentLocation)
    {
        txtCurrent_Location.sendKeys(Keys.CONTROL+"a");
        txtCurrent_Location.sendKeys(Keys.DELETE);
        txtCurrent_Location.sendKeys(currentLocation);
    }

    public void editFunctionalArea(String functionalArea)
    {
        txtFunction_Area.sendKeys(Keys.CONTROL+"a");
        txtFunction_Area.sendKeys(Keys.DELETE);
        txtFunction_Area.sendKeys(functionalArea);
    }

    public void editNoticePeriod(String noticePeriod)
    {
        txtNotice_Period.sendKeys(Keys.CONTROL+"a");
        txtNotice_Period.sendKeys(Keys.DELETE);
        txtNotice_Period.sendKeys(noticePeriod);
    }

    public void editPrimarySource(String primarySource)
    {
        txtPrimary_Source.sendKeys(Keys.CONTROL+"a");
        txtPrimary_Source.sendKeys(Keys.DELETE);
        txtPrimary_Source.sendKeys(primarySource);
    }

    public void editSecondarySource(String secondarySource)
    {
        txtSecondary_Source.sendKeys(Keys.CONTROL+"a");
        txtSecondary_Source.sendKeys(Keys.DELETE);
        txtSecondary_Source.sendKeys(secondarySource);
    }

    public void editRemoteWork()
    {
        select=new Select(txtRemote_Work);
        select.selectByValue("No");
    }

    public void editOnlineProfileURL(String onlineProfileURL)
    {
        txtOnlineProfile_URL.sendKeys(Keys.CONTROL+"a");
        txtOnlineProfile_URL.sendKeys(Keys.DELETE);
        txtOnlineProfile_URL.sendKeys(onlineProfileURL);
    }

    public void editRelocate()
    {
        select=new Select(drpRelocate);
        select.selectByValue("No");
    }

    public void enterPreferredLocation(String preferredLocation)
    {
        txtPreferredLocation.sendKeys(preferredLocation);
    }

    public void editCurrentSalary(String salary)
    {
        txtCurrent_Salary.sendKeys(Keys.CONTROL+"a");
        txtCurrent_Salary.sendKeys(Keys.DELETE);
        txtCurrent_Salary.sendKeys(salary);
    }

    public void editCurrentSalaryCurrency()
    {
        select=new Select(drpCurrent_Salary);
        select.selectByValue("EUR");
    }

    public void editCurrentSalaryDuration()
    {
        select=new Select(drpCurrentSalary_Type);
        select.selectByValue("Daily");
    }

    public void editExpectedSalary(String salary)
    {
        txtExpected_Salary.sendKeys(Keys.CONTROL+"a");
        txtExpected_Salary.sendKeys(Keys.DELETE);
        txtExpected_Salary.sendKeys(salary);
    }

    public void editExpectedSalaryCurrency()
    {
        select=new Select(drpExpected_Salary);
        select.selectByValue("EUR");
    }

    public void editExpectedSalaryDuration()
    {
        select=new Select(drpExpectedSalary_Type);
        select.selectByValue("Daily");
    }

    public void editSkills(String skills)
    {
        txtSkills.sendKeys(skills);
        txtSkills.sendKeys(Keys.ENTER);
    }

    public void editEducation(String selectEducationDetails) throws InterruptedException
    {

        WebElement education = driver.findElement(By.xpath("//button[normalize-space()=\"+ Add Education\"]"));
        {
            if (selectEducationDetails.equalsIgnoreCase("Yes")) {
                System.out.println("No educational details found. Clicking on the Add education button to add the details");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", education);
                education.click();
                Thread.sleep(2000);
                WebElement degree = driver.findElement(By.xpath("//input[@name=\"Degree\"]"));
                WebElement institution = driver.findElement(By.xpath("//input[@name=\"Institution\"]"));
                WebElement university = driver.findElement(By.xpath("//input[@name=\"university\"]"));
                WebElement fromDate = driver.findElement(By.xpath("//input[@name=\"fromDate\"]"));
                WebElement toDate = driver.findElement(By.xpath("//input[@name=\"toDate\"]"));
                WebElement percentage = driver.findElement(By.xpath("//input[@name=\"percentage\"]"));
                WebElement location = driver.findElement(By.xpath("(//input[@name=\"location\"])[1]"));
                WebElement add = driver.findElement(By.xpath("//button[normalize-space()=\"Add\"][1]"));

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
    public void editExperience(String experienceDetails) throws InterruptedException
    {
        WebElement experience=driver.findElement(By.xpath("//button[normalize-space()=\"+ Add Experience\"]"));
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
            WebElement location=driver.findElement(By.xpath("//h1[contains(text(),'Experience')]/following::input[@name='location']"));
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", location);
            js.executeScript("arguments[0].click();", location);
            location.clear();
            location.sendKeys("Andheri");
            WebElement fromDate=driver.findElement(By.xpath("//h1[contains(text(),'Experience')]/following::input[@name='fromDate']"));
            fromDate.sendKeys("20-09-2021");
            WebElement toDate=driver.findElement(By.xpath("//h1[contains(text(),'Experience')]/following::input[@name='toDate']"));
            toDate.sendKeys("05-08-2022");
            WebElement roles=driver.findElement(By.xpath("//input[@name=\"roles\"]"));
            roles.sendKeys("Manual and Automation Testing");
            WebElement add=driver.findElement(By.xpath("//h1[contains(text(),'Experience')]/following::button[text()='Add'][1]"));
            add.click();

            System.out.println("Experience added successfully");

        }
        else if (experienceDetails.equalsIgnoreCase("No"))
        {
            System.out.println("Candidate dont want to add experience, Please move forward");
        }
    }

    public void editProject(String selectProjectDetail)
    {
        WebElement project=driver.findElement(By.xpath("//button[normalize-space()=\"+ Add Project\"]"));

        if (selectProjectDetail.equalsIgnoreCase("Yes")) {
            project.click();

            WebElement project_Name = driver.findElement(By.xpath("//input[@name=\"projectName\"]"));
            project_Name.sendKeys("Orgzstack");
            WebElement location = driver.findElement(By.xpath("//h1[contains(text(),'Project')]/following::input[@name='location']"));
            location.sendKeys("Navi Mumbai");
            WebElement from_Date = driver.findElement(By.xpath("//h1[contains(text(),'Project')]/following::input[@name='fromDate']"));
            from_Date.sendKeys("06-10-2022");
            WebElement to_Date = driver.findElement(By.xpath("//h1[contains(text(),'Project')]/following::input[@name='toDate']"));
            to_Date.sendKeys("03-12-2024");
            WebElement project_Description = driver.findElement(By.xpath("//input[@name=\"description\"]"));
            project_Description.sendKeys("It is HR management tool");
            WebElement add = driver.findElement(By.xpath("//h1[contains(text(),'Project')]/following::button[text()='Add'][1]"));
            add.click();
            System.out.println("Project added successfully");
        } else if (selectProjectDetail.equalsIgnoreCase("No")) {
            System.out.println("Candidate dont want to add project, Please move forward");
        }

    }

    public void editLanguage(String selectLanguage_Option)
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
            WebElement add=driver.findElement(By.xpath("//h1[contains(text(), 'Language Details')]/following::div//button[text()='Add']"));
            add.click();

            System.out.println("Language added successfully");
        }
        else if (selectLanguage_Option.equalsIgnoreCase("No"))
        {
            System.out.println("User dont want to update Language, Please move forward");
        }

        actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    public void editCourse(String selectCourses_Details)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement course=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()=\"+ Add Course\"]")));

        if (selectCourses_Details.equalsIgnoreCase("Yes")) {
            js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", course);
            js.executeScript("arguments[0].click();", course);

            WebElement courseName = driver.findElement(By.xpath("//input[@name=\"courseName\"]"));
            courseName.sendKeys("Automation Test Specialist");
            WebElement fromDate = driver.findElement(By.xpath("//h1[contains(text(),'Courses')]/following::input[@name='fromDate']"));
            fromDate.sendKeys("07-05-2023");
            WebElement toDate = driver.findElement(By.xpath("//h1[contains(text(),'Courses')]/following::input[@name='toDate']"));
            toDate.sendKeys("15-11-2023");
            WebElement add = driver.findElement(By.xpath("//h1[contains(text(),'Courses')]/following::button[text()='Add'][1]"));
            add.click();

            System.out.println("Course details added successfully");
        } else if (selectCourses_Details.equalsIgnoreCase("No")) {
            System.out.println("User dont want to add course detail, Please proceed and submit the form");
        }
    }

    public void clkSave()
    {
        btnSave.click();
    }
}

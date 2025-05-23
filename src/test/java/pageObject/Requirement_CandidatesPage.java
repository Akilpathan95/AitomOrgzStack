package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Requirement_CandidatesPage extends BasePage {

    Select select;
    Actions actions;

    public Requirement_CandidatesPage(WebDriver driver)
    {
        super(driver);
    }

    //------------------------Add Candidate------------------

    @FindBy(xpath = "//div[normalize-space()=\"Candidates\"]")
    WebElement btnCandidates;

    @FindBy(xpath = "//span[normalize-space()=\"Add Candidate\"]")
    WebElement btnAdd_Candidate;

    @FindBy(xpath = "//p[normalize-space()=\"Add Manually\"]")
    WebElement btnAdd_Manually;

    //------Add Candidate--Personal Details-----
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

    @FindBy(xpath = "(//input[@placeholder='Enter here'])[11]")
    WebElement txtPassportNumber;

    @FindBy(xpath = "//input[@name=\"online_Profile_Url\"]")
    WebElement txtOnlineProfile_URL;

    @FindBy(xpath = "//select[@name=\"open_For_Remote_Work\"]")
    WebElement txtRemote_Work;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[1]")
    WebElement txtCurrent_Salary;

    @FindBy(xpath = "(//select[@name='currency'])[1]")
    WebElement drpCurrent_Salary;

    @FindBy(xpath = "(//select[@name='annual'])[1]")
    WebElement drpCurrentSalary_Type;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[2]")
    WebElement txtExpected_Salary;

    @FindBy(xpath = "(//select[@name='currency'])[2]")
    WebElement drpExpected_Salary;

    @FindBy(xpath = "(//select[@name='annual'])[2]")
    WebElement drpExpectedSalary_Type;

    @FindBy(xpath = "//input[@placeholder=\"Enter keywords separated by comma or enter key\"]")
    WebElement txtSkills;

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement btnCandidate_submit;

    //------------Bulk Uploads--------------------

    @FindBy(xpath = "//p[normalize-space()=\"Bulk Upload\"]")
    WebElement btnBulkUpload;

    @FindBy(xpath = "//input[@placeholder=\"Search...\"]")
    WebElement txtSearch;

    @FindBy(xpath = "(//div[contains(@style, 'scroll')]//div[contains(@class, 'flex-col')]//div[@class='mr-5'])")
    List<WebElement> candidateList;

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

    public void addFileWithRetry(String filePath, int maxRetries){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            try {
                // Locate the upload element
                WebElement uploadResume = driver.findElement(By.id("upload"));
                js.executeScript("arguments[0].scrollIntoView(true);", uploadResume);

                // Upload the file
                uploadResume.sendKeys(filePath);
                System.out.println("Attempt " + attempt + ": File uploaded.");

                // Wait to see if the error pop-up appears
                //Thread.sleep(60000); // Adjust based on your app's response time

                // Check for the alert
                if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
                    Alert alert = driver.switchTo().alert();
                    String alertText = alert.getText();
                    System.out.println("Alert detected: " + alertText);
                    alert.accept();

                    // Check if the error is "File Not Parsed"
                    if (alertText.contains("File Not Parsed Please Try Again")) {
                        System.out.println("File not parsed. Retrying... Attempt " + (attempt + 1));
                        continue; // Retry the upload
                    }
                }

                System.out.println("File uploaded successfully.");
                return; // Exit if successful

            } catch (Exception e) {
                System.out.println("File upload failed on attempt " + attempt + ": " + e.getMessage());
            }
        }
        System.out.println("Max retries reached. File upload failed.");
    }

    // Helper method to check for alerts
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
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
        String lastName=txtLast_Name.getAttribute("value");
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
        String Cemail=txtEmail.getAttribute("value");
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
        String mob_Number=txtMobile_Number.getAttribute("value");
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
        String dOB=txtDOB.getAttribute("value");
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
        String eCountry=txtCountry.getAttribute("value");
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
        String cOrg=txtCurrent_Organization.getAttribute("value");
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
        String cDes=txtCurrent_Designation.getAttribute("value");
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
        String ind=txtIndustry.getAttribute("value");
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
        String loc=txtCurrent_Location.getAttribute("value");
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
        String fun=txtFunction_Area.getAttribute("value");
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
        String notice=txtNotice_Period.getAttribute("value");
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
        String primary=txtPrimary_Source.getAttribute("value");
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
        String secondary=txtSecondary_Source.getAttribute("value");
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
        String pass=txtPassportNumber.getAttribute("value");
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
        String url=txtOnlineProfile_URL.getAttribute("value");
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
        String exp=txtExpected_Salary.getAttribute("value");
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
        String ski=txtSkills.getAttribute("value");
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
        List<WebElement> eduDetails=driver.findElements(By.xpath("(//h2[normalize-space()=\"Education\"]/following::div[contains(@style, 'margin-top')]//div[contains(@style, 'rgb(224, 224, 224)')])[1]"));

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
                WebElement university=driver.findElement(By.xpath("//input[@name=\"University\"]"));
                WebElement fromDate=driver.findElement(By.xpath("//input[@name=\"fromDate\"]"));
                WebElement toDate=driver.findElement(By.xpath("//input[@name=\"toDate\"]"));
                WebElement percentage=driver.findElement(By.xpath("//input[@name=\"percentage\"]"));
                WebElement location=driver.findElement(By.xpath("(//input[@name=\"location\"])[1]"));
                WebElement add=driver.findElement(By.xpath("(//h2[normalize-space()=\"Education\"]/following::button[normalize-space()='Add'])[1]"));

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
        List<WebElement> expDetails=driver.findElements(By.xpath("(//h2[normalize-space()=\"Experience\"]/following::div[contains(@style, 'margin-top')]//div[contains(@style, 'rgb(224, 224, 224)')])[1]"));

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
                WebElement location=driver.findElement(By.xpath("//h2[normalize-space()=\"Experience\"]/following::input[@name='location'][1]"));
                js.executeScript("arguments[0].scrollIntoView({block: 'center'});", location);
                js.executeScript("arguments[0].click();", location);
                location.clear();
                location.sendKeys("Andheri");
                WebElement fromDate=driver.findElement(By.xpath("//h2[normalize-space()=\"Experience\"]/following::input[@name='fromDate'][1]"));
                fromDate.sendKeys("20-09-2021");
                WebElement toDate=driver.findElement(By.xpath("//h2[normalize-space()=\"Experience\"]/following::input[@name='toDate'][1]"));
                toDate.sendKeys("05-08-2022");
                WebElement roles=driver.findElement(By.xpath("//input[@name=\"roles\"]"));
                roles.sendKeys("Manual and Automation Testing");
                WebElement add=driver.findElement(By.xpath("(//h2[normalize-space()=\"Experience\"]/following::button[normalize-space()='Add'])[1]"));
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
        List<WebElement> proDetails=driver.findElements(By.xpath("(//h2[normalize-space()=\"Project\"]/following::div[contains(@style, 'margin-top')]//div[contains(@style, 'rgb(224, 224, 224)')])[1]"));

        if (proDetails.size()>1)
        {
            System.out.println("Project details are already present. No need to Add");
        }
        else {

            if (selectProjectDetail.equalsIgnoreCase("Yes")) {
                project.click();

                WebElement project_Name = driver.findElement(By.xpath("//input[@name=\"projectName\"]"));
                project_Name.sendKeys("Orgzstack");
                WebElement location = driver.findElement(By.xpath("//input[@name=\"location\"]"));
                location.sendKeys("Navi Mumbai");
                WebElement from_Date = driver.findElement(By.xpath("//h2[normalize-space()=\"Project\"]/following::input[@name='fromDate'][1]"));
                from_Date.sendKeys("06-10-2022");
                WebElement to_Date = driver.findElement(By.xpath("//h2[normalize-space()=\"Project\"]/following::input[@name='toDate'][1]"));
                to_Date.sendKeys("03-12-2024");
                WebElement project_Description = driver.findElement(By.xpath("//textarea[@name=\"description\"]"));
                project_Description.sendKeys("It is HR management tool");
                WebElement add = driver.findElement(By.xpath("(//h2[normalize-space()=\"Project\"]/following::button[normalize-space()='Add'])[1]"));
                add.click();
                System.out.println("Project added successfully");
            } else if (selectProjectDetail.equalsIgnoreCase("No")) {
                System.out.println("Candidate dont want to add project, Please move forward");
            }
        }
    }

    public void selectLanguage(String selectLanguage) {
        WebElement language = driver.findElement(By.xpath("//button[normalize-space()=\"+ Add Language\"]"));
        List<WebElement> lanDetails = driver.findElements(By.xpath("(//h2[normalize-space()=\"Language\"]/following::div[contains(@style, 'margin-top')]//div[contains(@style, 'rgb(224, 224, 224)')])[1]"));

        if (lanDetails.size() > 1)
        {
            System.out.println("Language details are already present. No need to Add");
        }
        else
        {

            if (selectLanguage.equalsIgnoreCase("Yes")) {
                language.click();

                WebElement enterlanguage = driver.findElement(By.xpath("//select[@name=\"language\"]"));
                Select select=new Select(enterlanguage);
                select.selectByVisibleText("English");
                WebElement read = driver.findElement(By.xpath("//input[@name=\"read\"]"));
                read.click();
                WebElement write = driver.findElement(By.xpath("//input[@name=\"write\"]"));
                write.click();
                WebElement speak = driver.findElement(By.xpath("//input[@name=\"speak\"]"));
                speak.click();
                WebElement add = driver.findElement(By.xpath("(//h2[normalize-space()=\"Language\"]/following::button[normalize-space()='Add'])[1]"));
                add.click();
                System.out.println("Language added successfully");
            } else if (selectLanguage.equalsIgnoreCase("No")) {
                System.out.println("Candidate dont want to add Language, Please move forward");
            }

            actions = new Actions(driver);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }
    }

    public void selectCertificate(String selectCertificate_Details)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement certification=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()=\"+ Add Certificate\"]")));
        List<WebElement> certificationDetails=driver.findElements(By.xpath("(//h2[normalize-space()=\"Certificate\"]/following::div[contains(@style, 'margin-top')]//div[contains(@style, 'rgb(224, 224, 224)')])[1]"));
        if (certificationDetails.size()>0)
        {
            System.out.println("Course details are already present. No need to Add");
        }
        else
        {
            if (selectCertificate_Details.equalsIgnoreCase("Yes")) {
                js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", certification);
                js.executeScript("arguments[0].click();", certification);

                WebElement courseName = driver.findElement(By.xpath("//input[@name=\"courseName\"]"));
                courseName.sendKeys("Automation Test Specialist");
                WebElement fromDate = driver.findElement(By.xpath("//h2[normalize-space()=\"Certificate\"]/following::input[@name='fromDate']"));
                fromDate.sendKeys("07-05-2023");
                WebElement toDate = driver.findElement(By.xpath("//h2[normalize-space()=\"Certificate\"]/following::input[@name='toDate']"));
                toDate.sendKeys("15-11-2023");
                WebElement add = driver.findElement(By.xpath("(//h2[normalize-space()=\"Certificate\"]/following::button[normalize-space()='Add'])[1]"));
                add.click();

                System.out.println("Certification details added successfully");
            } else if (selectCertificate_Details.equalsIgnoreCase("No")) {
                System.out.println("User dont want to add Certification detail, Please proceed and submit the form");
            }
        }
    }

    public void submit()
    {
        btnCandidate_submit.click();
        BasePage bp=new BasePage(driver);
        bp.toastMessage();
    }

    public void clkBulkUpload()
    {
        btnBulkUpload.click();
    }

    public void addBulkUpload() throws InterruptedException {
        Thread.sleep(5000);
        WebElement uploads=driver.findElement(By.xpath("//input[@type='file']"));
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",uploads);
        String file1="C:\\Users\\IPSL\\Downloads\\Naukri_SunnyKhavle[8y_0m].pdf";
        String file2="C:\\Users\\IPSL\\Downloads\\Naukri_CANileshAnantaDaule[11y_0m].pdf";

        uploads.sendKeys(file1 + "\n" + file2);

        int noFilesUploaded=driver.findElements(By.xpath("//div[@class=\"upload-section\"]//div//div//p")).size();

        System.out.println("Number of files uploaded : " + noFilesUploaded);

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        List<WebElement> statusElements=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@style, 'align-items: center') and contains(@style, 'margin-top: 4px;')]/span")));

        boolean allUploaded = false;
        int attempts = 0;
        int maxAttempts = 30; // 30 seconds max

        while (!allUploaded && attempts < maxAttempts) { //try for 15 seconds max
            allUploaded = true; //Assume all are uploaded

            for (WebElement statusElement : statusElements) {
                String statusText = statusElement.getText().trim();

                if (statusText.equalsIgnoreCase("Processing...")) {
                    allUploaded = false; // If any file is still uploading, wait
                    break;
                }
            }
        }

        // Print final statuses after all are uploaded
        for (WebElement statusElement : statusElements) {
            wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(statusElement, "Uploading...")));
            System.out.println("Final Status: " + statusElement.getText().trim());
        }
    }

    public void clkCancel()
    {
        driver.findElement(By.xpath("//button[contains(text(),\"✕\")]")).click();
        WebElement closeButton=driver.findElement(By.xpath("//p[text()='x']"));
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closeButton);
    }

    public void enterSearch(String search) throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(3000);

        System.out.println("Displayed: " + txtSearch.isDisplayed());
        System.out.println("Enabled: " + txtSearch.isEnabled());

        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.width='200px';", txtSearch);
        txtSearch.sendKeys(search);
        System.out.println("Entered search term: " + search);

        Thread.sleep(2000);
        candidateList = driver.findElements(By.xpath("(//div[contains(@style, 'scroll')]//div[contains(@class, 'flex-col')]//div[@class='mr-5'])"));

        if (candidateList.isEmpty()) {
            System.out.println("No results found for: " + search);
            return;
        }

        //wait.until(ExpectedConditions.visibilityOfAllElements(candidateList));

        actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        // Check if the search matches the list items
        boolean matchFound = false;

        for (WebElement listItem : candidateList)
        {
            String listItemList=listItem.getText().trim();
            System.out.println("List Item: " + listItemList);

            if (listItemList.toLowerCase().contains(search.toLowerCase()))
            {
                System.out.println("Matching with the search input");
                matchFound = true;
                break; // Exit loop once found
            }
        }

        if (!matchFound)
        {
            System.out.println("It is not matched in list");
        }

    }

    public void selectCandidateList()
    {
        System.out.println(candidateList.size());
    }

    @FindBy(xpath = "(//img[contains(@aria-controls,'customized-menu')])[2]")
    WebElement selectMenu;

    public void clkMenu()
    {
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", selectMenu);
        js.executeScript("arguments[0].click()", selectMenu);
    }

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock'][normalize-space()='Send Invite Email'])")
    WebElement selectSendInviteLink;

    public void clkSendInviteEmail()
    {
        selectSendInviteLink.click();
    }

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock'][normalize-space()='Send Interview Link'])")
    WebElement selectSendInterviewLink;

    public void clkSendInterviewLink()
    {
        selectSendInterviewLink.click();
    }

}

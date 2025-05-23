package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;
import utilities.Dataproviders;

public class TC001_LoginTest extends BaseClass {

    //@Test
    public void verify_Login()
    {
        LoginPage lp=new LoginPage(driver);
        lp.enterEmail(p.getProperty("email"));
        lp.enterPassword(p.getProperty("password"));
        lp.clkLogin();

        String expTitle= "Orgzstack";
        String actTitle=driver.getTitle();
        Assert.assertTrue(expTitle.equals(actTitle), "Login is not done" + expTitle + ", but found: " + actTitle);
    }

    @Test(dataProvider = "LoginData", dataProviderClass = Dataproviders.class, groups = "Master") //Getting dataprovider from different class
    public void verify_loginfromData(String email, String pwd, String exp)
    {
        try
        {
            BasePage pp=new BasePage(driver);
            pp.handleAlert();

            LoginPage lp=new LoginPage(driver);
            lp.enterEmail(email);
            lp.enterPassword(pwd);
            lp.clkLogin();

            pp.handleAlert();

            HomePage hp=new HomePage(driver);
            boolean targetPage=hp.isMyDashboardExists();


            if (exp.equalsIgnoreCase("Valid"))
            {
                if (targetPage == true)
                {
                    hp.clkMyProfile();
                    hp.clkLogOut();
                    Assert.assertTrue(true);
                }
                else
                {
                    Assert.assertTrue(false);
                }
            }

            if (exp.equalsIgnoreCase("Invalid"))
            {
                if (targetPage == true)
                {
                    hp.clkMyProfile();
                    hp.clkLogOut();
                    Assert.assertTrue(false);
                }
                else
                {
                    Assert.assertTrue(true);
                }
            }
        }
        catch (Exception e)
        {
            Assert.fail();
        }
    }

}

package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;

import pageObjects.UserWiseForwardSummaryPage;
import testBase.BaseClass;

public class TC051_VerifyUserWiseForwardSummaryTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_UserWiseForwardSummaryPageExists() {
		
	logger.info("*****Starting TC051_VerifyUserWiseForwardSummaryTest*****");
	
	try {
		CitizenPage cp=new CitizenPage(driver);
		
		String parentWindow = driver.getWindowHandle();
		cp.clickBtnOfficalLogin();
		logger.info("Clicked on Official Login Button..");
				
		Set<String> allWindows = driver.getWindowHandles();
				
		for (String window : allWindows) {
		    if (!window.equals(parentWindow)) {
			driver.switchTo().window(window);
		    break;
		  }
		}

		//LoginPage
		LoginPage lp=new LoginPage(driver);
				
		lp.setUserName(p.getProperty("username"));
		logger.info("Entered Valid username..");
				
	    lp.setPassword(p.getProperty("password"));
		logger.info("Entered Valid Password..");
				
		lp.clickLogin();
	    logger.info("Clicked on Login Button..");
	    
	    Thread.sleep(3000);
	    
	    //DashBoardPage
	    DashBoardPage dp=new DashBoardPage(driver);
	    
	    dp.clickPropertySurveyMenu();
	    logger.info("Clicked on property survey menu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUserWiseForwardSummarySubmenu();
	    logger.info("Scrolled till user wise forward summary submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickUserWiseForwardSummarySubMenu();
	    logger.info("Clicked on user wise forward summary submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    UserWiseForwardSummaryPage uwfsp=new UserWiseForwardSummaryPage(driver);
	    
	    boolean targetpage=uwfsp.displayPlainTextUserWiseForwardSummary();
	    logger.info("Validating user wise forward summary page..");
	    
	    uwfsp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    boolean targetreport=uwfsp.displayPlainTextNoneToNoneReportStatus();
	    logger.info("Validating None to None report..");
	    
	    Assert.assertTrue(targetpage);
	    
	    Assert.assertTrue(targetreport);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC051_VerifyUserWiseForwardSummaryTest*****");
	}

}

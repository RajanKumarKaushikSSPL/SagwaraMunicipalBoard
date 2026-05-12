package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.SurveyPendingReportPage;

import testBase.BaseClass;

public class TC049_VerifySurveyPendingReportTest extends BaseClass{
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_SurveyPendingReportPageExists() {
		
	logger.info("*****Starting TC049_VerifySurveyPendingReportTest*****");
	
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
	    
	    dp.scrollTillSurveyPendingReportSubmenu();
	    logger.info("Scrolled till survey pending report submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickSurveyPendingReportSubMenu();
	    logger.info("Clicked on survey pending report submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    SurveyPendingReportPage sprp=new SurveyPendingReportPage(driver);
	    
	    boolean targetpage=sprp.displayPlainTextSurveyPendingReport();
	    logger.info("Validating survey pending report page..");
	    
	    sprp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    boolean targetreport=sprp.displayPlainTextNoneToNoneReportStatus();
	    logger.info("Validating None to None report..");
	    
	    Assert.assertTrue(targetpage);
	    
	    Assert.assertTrue(targetreport);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC049_VerifySurveyPendingReportTest*****");
	}

}

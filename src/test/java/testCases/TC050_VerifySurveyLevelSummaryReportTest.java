package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.SurveyLevelSummaryReportPage;

import testBase.BaseClass;

public class TC050_VerifySurveyLevelSummaryReportTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_SurveyLevelSummaryReportPageExists() {
		
	logger.info("*****Starting TC050_VerifySurveyLevelSummaryReportTest*****");
	
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
	    
	    dp.scrollTillSurveyLevelSummaryReportSubmenu();
	    logger.info("Scrolled till survey level summary report submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickSurveyLevelSummaryReportSubMenu();
	    logger.info("Clicked on survey level summary report submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    SurveyLevelSummaryReportPage slsrp=new SurveyLevelSummaryReportPage(driver);
	    
	    boolean targetpage=slsrp.displayPlainTextSurveyLevelSummaryReport();
	    logger.info("Validating survey level summary report page..");
	    
	    slsrp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    boolean targetreport=slsrp.displayPlainTextNoneToNoneReportStatus();
	    logger.info("Validating None to None report..");
	    
	    Assert.assertTrue(targetpage);
	    
	    Assert.assertTrue(targetreport);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC050_VerifySurveyLevelSummaryReportTest*****");
	}


}

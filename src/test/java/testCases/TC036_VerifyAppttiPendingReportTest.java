package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AppttiPendingReportPage;
import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC036_VerifyAppttiPendingReportTest extends BaseClass {

	@Test(groups={"Sanity","Master","Regression"})
	public void verify_AppttiPendingReportPageExists() {
		
	logger.info("*****Starting TC036_VerifyAppttiPendingReportTest*****");
	
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
	    
	    dp.clickUDTaxReportMenu();
	    logger.info("Clicked on UD Tax report menu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillAppttiPendingReportSubmenu();
	    logger.info("Scrolled till apptti pending report submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickAppttiPendingReportSubMenu();
	    logger.info("Clicked on apptti pending report submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	   
	    AppttiPendingReportPage aprp=new AppttiPendingReportPage(driver);
	    
	    boolean targetpage=aprp.displayPlainTextAppttiPendingReport();
	    logger.info("Validating apptti pending report page..");
	    
	    aprp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(2000);
	    
	    boolean targetreport=aprp.displayPlainTextNoneToNoneReportStatus();
	    logger.info("Validating apptti pending report..");
	    
	    Assert.assertTrue(targetpage);
	    
	    Assert.assertTrue(targetreport);
	    
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC036_VerifyAppttiPendingReportTest*****");
	}
}

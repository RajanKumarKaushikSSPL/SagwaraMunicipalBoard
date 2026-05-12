package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.TCVisitSummaryPage;
import testBase.BaseClass;

public class TC039_VerifyTCVisitSummaryTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_TCVisitSummaryPageExists() {
		
	logger.info("*****Starting TC039_VerifyTCVisitSummaryTest*****");
	
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
	    
	    dp.scrollTillTCVisitSummarySubmenu();
	    logger.info("Scrolled till TC visit summary submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickTCVisitSummarySubMenu();
	    logger.info("Clicked on TC visit summary submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    TCVisitSummaryPage tcvsp=new TCVisitSummaryPage(driver);
	    
	    boolean targetpage=tcvsp.displayPlainTextTCVisitSummary();
	    logger.info("Validating TC visit summary page..");
	    
	    tcvsp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(2000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC039_VerifyTCVisitSummaryTest*****");
	}


}

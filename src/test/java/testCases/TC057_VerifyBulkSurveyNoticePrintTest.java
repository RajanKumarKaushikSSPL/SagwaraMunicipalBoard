package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BulkSurveyNoticePage;
import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;

import testBase.BaseClass;

public class TC057_VerifyBulkSurveyNoticePrintTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_BulkSurveyNoticePageExists() {
		
	logger.info("*****Starting TC057_VerifyBulkSurveyNoticePrintTest*****");
	
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
	    
	    dp.scrollTillBulkSurveyNoticePrintSubmenu();;
	    logger.info("Scrolled till bulk survey notice print submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickBulkSurveyNoticePrintSubMenu();;
	    logger.info("Clicked on bulk survey notice print submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    BulkSurveyNoticePage bsnp=new BulkSurveyNoticePage(driver);
	    
	    boolean targetpage=bsnp.displayPlainTextBulkSurveyNotice();
	    logger.info("Validating bulk survey notice page..");
	    
	    bsnp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC057_VerifyBulkSurveyNoticePrintTest*****");
	}


}

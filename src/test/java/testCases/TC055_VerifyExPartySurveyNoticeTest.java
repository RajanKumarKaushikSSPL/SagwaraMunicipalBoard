package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.ExPartySurveyNoticePage;
import pageObjects.LoginPage;

import testBase.BaseClass;

public class TC055_VerifyExPartySurveyNoticeTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_ExPartySurveyNoticePageExists() {
		
	logger.info("*****Starting TC055_VerifyExPartySurveyNoticeTest*****");
	
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
	    
	    dp.scrollTillExPartySurveyNoticeSubmenu();;
	    logger.info("Scrolled till ex-party survey notice submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickExPartySurveyNoticeSubMenu();;
	    logger.info("Clicked on ex-party survey notice submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    ExPartySurveyNoticePage epsnp=new ExPartySurveyNoticePage(driver);
	    
	    boolean targetpage=epsnp.displayPlainTextExPartySurveyNotice();
	    logger.info("Validating ex-party survey notice page..");
	    
	    epsnp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC055_VerifyExPartySurveyNoticeTest*****");
	}


}

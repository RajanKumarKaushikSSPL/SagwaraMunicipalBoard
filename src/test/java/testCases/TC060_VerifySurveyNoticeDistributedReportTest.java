package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.SurveyNoticeDistributedReportPage;

import testBase.BaseClass;

public class TC060_VerifySurveyNoticeDistributedReportTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_SurveyNoticeDistributedReportPageExists() {
		
	logger.info("*****Starting TC060_VerifySurveyNoticeDistributedReportTest*****");
	
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
	    
	    dp.scrollTillSurveyNoticeDistributedReportSubmenu();;
	    logger.info("Scrolled till survey notice distributed report submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickSurveyNoticeDistributedReportSubMenu();;
	    logger.info("Clicked on survey notice distributed report submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    SurveyNoticeDistributedReportPage sndrp=new SurveyNoticeDistributedReportPage(driver);
	    
	    boolean targetpage=sndrp.displayPlainTextSurveyNoticeDistributedReport();
	    logger.info("Validating survey notice distributed report page..");
	    
	    sndrp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC060_VerifySurveyNoticeDistributedReportTest*****");
	}

}

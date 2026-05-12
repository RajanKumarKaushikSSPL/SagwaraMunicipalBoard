package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;

import pageObjects.LoginPage;
import pageObjects.SurveyNoticeListPage;
import testBase.BaseClass;

public class TC056_VerifySurveyNoticeListTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_SurveyNoticeListPageExists() {
		
	logger.info("*****Starting TC056_VerifySurveyNoticeListTest*****");
	
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
	    
	    dp.scrollTillSurveyNoticeListSubmenu();;
	    logger.info("Scrolled till survey notice list submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickSurveyNoticeListSubMenu();;
	    logger.info("Clicked on survey notice list submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    SurveyNoticeListPage snlp=new SurveyNoticeListPage(driver);
	    
	    boolean targetpage=snlp.displayPlainTextSurveyNoticeList();
	    logger.info("Validating survey notice list page..");
	    
	    snlp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC056_VerifySurveyNoticeListTest*****");
	}

}

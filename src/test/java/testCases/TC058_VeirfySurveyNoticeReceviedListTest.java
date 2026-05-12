package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.SurveyNoticeReceivedListPage;
import testBase.BaseClass;

public class TC058_VeirfySurveyNoticeReceviedListTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_SurveyNoticeReceviedListPageExists() {
		
	logger.info("*****Starting TC058_VeirfySurveyNoticeReceviedListTest*****");
	
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
	    
	    dp.scrollTillSurveyNoticeReceivedListSubmenu();;
	    logger.info("Scrolled till survey notice received list submenu..");
	    
        Thread.sleep(3000);
	    
	    dp.clickSurveyNoticeRecivedListSubMenu();;
	    logger.info("Clicked on survey notice received list submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    SurveyNoticeReceivedListPage snrlp=new SurveyNoticeReceivedListPage(driver);
	    
	    boolean targetpage=snrlp.displayPlainTextSurveyNoticeReceivedList();
	    logger.info("Validating survey notice received list page..");
	    
	    snrlp.clickSearch();
	    logger.info("Clicked on search button..");
	    
	    Thread.sleep(3000);
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC058_VeirfySurveyNoticeReceviedListTest*****");
	}

}

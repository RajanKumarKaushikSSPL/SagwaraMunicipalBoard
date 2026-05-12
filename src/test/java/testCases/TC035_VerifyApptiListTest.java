package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ApptiFormListPage;
import pageObjects.CitizenPage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC035_VerifyApptiListTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_ApptiFormListPageExists() {
		
	logger.info("*****Starting TC035_VerifyApptiListTest*****");
	
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
	    
	    dp.scrollTillApptiListSubmenu();
	    logger.info("Scrolled till appti list submenu..");
	    
	    Thread.sleep(3000);
	    
	    dp.clickApptiListSubMenu();
	    logger.info("Clicked on appti list submenu..");
	    
	    Thread.sleep(2000);
	    
	    dp.scrollTillUpMost();
	    logger.info("Scrolled till upper most of web page..");
	    
	    Thread.sleep(2000);
	    
	    ApptiFormListPage aflp=new ApptiFormListPage(driver);
	    
	    boolean targetpage=aflp.displayPlainTextApptiFormList();
	    logger.info("Validating appti from list page..");
	    
	    Assert.assertTrue(targetpage);
	    
	    }catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
		    Assert.fail();
		}
	    
	    logger.info("*****Finished TC035_VerifyApptiListTest*****");
	}

}
